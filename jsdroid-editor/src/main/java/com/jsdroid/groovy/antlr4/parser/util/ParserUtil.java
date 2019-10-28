package com.jsdroid.groovy.antlr4.parser.util;



import com.jsdroid.groovy.antlr4.parser.GroovyParser;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

public class ParserUtil {

    /**
     * 获取dot位置
     *
     * @param tipParser
     * @param cursorPos 光标的位置
     * @return
     */
    public static Token getCursorDotToken(
            GroovyParser tipParser,
            int cursorPos) {
        return getCursorDotToken(tipParser.getTokenStream(), cursorPos);
    }

    /**
     * 获取dot位置
     *
     * @param tokenStream
     * @param cursorPos
     * @return
     */
    public static Token getCursorDotToken(
            TokenStream tokenStream,
            int cursorPos) {
        for (int i = 0; i < tokenStream.size(); i++) {
            Token token = tokenStream.get(i);
            int stopIndex = token.getStopIndex();
            if (stopIndex > cursorPos) {
                break;
            }

            if (token.getType() == GroovyParser.DOT) {
                Token nextToken = tokenStream.get(i + 1);
                if (nextToken.getType() == GroovyParser.EOF
                        || cursorPos >= nextToken.getStartIndex() && cursorPos <= nextToken.getStopIndex()) {
                    return token;
                }
            }

        }
        return null;
    }

    public static Token getLastToken(GroovyParser tipParser, Token currentToken) {
        if (currentToken == null) {
            return null;
        }
        return getLastToken(tipParser.getTokenStream(), currentToken);
    }

    public static Token getLastToken(TokenStream tokenStream, Token currentToken) {
        int pos = currentToken.getTokenIndex() - 1;
        if (pos < 0) {
            return null;
        }
        return tokenStream.get(pos);
    }


}
