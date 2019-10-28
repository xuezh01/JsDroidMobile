/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package com.jsdroid.groovy.antlr4;

import groovy.lang.Closure;

import org.codehaus.groovy.runtime.StringGroovyMethods;

import java.util.Map;
import java.util.regex.Pattern;

/**
 * Utilities for handling strings
 */
public class StringUtils {
    private static final String BACKSLASH = "\\";
    private static final Pattern HEX_ESCAPES_PATTERN = Pattern.compile("(\\\\*)\\\\u([0-9abcdefABCDEF]{4})");
    private static final Pattern OCTAL_ESCAPES_PATTERN = Pattern.compile("(\\\\*)\\\\([0-3]?[0-7]?[0-7])");
    private static final Pattern STANDARD_ESCAPES_PATTERN = Pattern.compile("(\\\\*)\\\\([btnfr\"'])");
    private static final Pattern LINE_ESCAPE_PATTERN = Pattern.compile("(\\\\*)\\\\\r?\n");

    public static String replaceHexEscapes(String text) {
        if (!text.contains(BACKSLASH)) {
            return text;
        }

        return StringGroovyMethods.replaceAll((CharSequence) text, HEX_ESCAPES_PATTERN, new Closure<Void>(null, null) {
            Object doCall(String _0, String _1, String _2) {
                if (isLengthOdd(_1)) {
                    return _0;
                }

                return _1 + new String(Character.toChars(Integer.parseInt(_2, 16)));
            }
        });
    }

    public static String replaceOctalEscapes(String text) {
        if (!text.contains(BACKSLASH)) {
            return text;
        }

        return StringGroovyMethods.replaceAll((CharSequence) text, OCTAL_ESCAPES_PATTERN, new Closure<Void>(null, null) {
            Object doCall(String _0, String _1, String _2) {
                if (isLengthOdd(_1)) {
                    return _0;
                }

                return _1 + new String(Character.toChars(Integer.parseInt(_2, 8)));
            }
        });
    }


    public static final int NONE_SLASHY = 0;
    public static final int SLASHY = 1;
    public static final int DOLLAR_SLASHY = 2;

    private static String replaceLineEscape(String text) {
        if (!text.contains(BACKSLASH)) {
            return text;
        }

        text = StringGroovyMethods.replaceAll((CharSequence) text, LINE_ESCAPE_PATTERN, new Closure<Void>(null, null) {
            Object doCall(String _0, String _1) {
                if (isLengthOdd(_1)) {
                    return _0;
                }

                return _1;
            }
        });

        return text;
    }

    private static boolean isLengthOdd(String str) {
        return null != str && str.length() % 2 == 1;
    }

    public static String removeCR(String text) {
        return replace(text, "\r\n", "\n");
    }


    public static String trimQuotations(String text, int quotationLength) {
        int length = text.length();

        return length == quotationLength << 1 ? "" : text.substring(quotationLength, length - quotationLength);
    }

    public static boolean matches(String text, Pattern pattern) {
        return pattern.matcher(text).matches();
    }

    /**
     * The modified implementation is based on StringUtils#replace(String text, String searchString, String replacement, int max), Apache commons-lang3-3.6
     * <p>
     * <p>Replaces all occurrences of a String within another String.</p>
     * <p>
     * <p>A {@code null} reference passed to this method is a no-op.</p>
     * <p>
     * <pre>
     * StringUtils.replace(null, *, *)        = null
     * StringUtils.replace("", *, *)          = ""
     * StringUtils.replace("any", null, *)    = "any"
     * StringUtils.replace("any", *, null)    = "any"
     * StringUtils.replace("any", "", *)      = "any"
     * StringUtils.replace("aba", "a", null)  = "aba"
     * StringUtils.replace("aba", "a", "")    = "b"
     * StringUtils.replace("aba", "a", "z")   = "zbz"
     * </pre>
     *
     * @param text         text to search and replace in, may be null
     * @param searchString the String to search for, may be null
     * @param replacement  the String to replace it with, may be null
     * @return the text with any replacements processed,
     * {@code null} if null String input
     */
    public static String replace(final String text, String searchString, final String replacement) {
        if (isEmpty(text) || isEmpty(searchString) || replacement == null) {
            return text;
        }
        int start = 0;
        int end = text.indexOf(searchString, start);
        if (end == INDEX_NOT_FOUND) {
            return text;
        }
        final int replLength = searchString.length();
        int increase = replacement.length() - replLength;
        increase = (increase < 0 ? 0 : increase) * 16;
        final StringBuilder buf = new StringBuilder(text.length() + increase);
        while (end != INDEX_NOT_FOUND) {
            buf.append(text, start, end).append(replacement);
            start = end + replLength;
            end = text.indexOf(searchString, start);
        }
        buf.append(text.substring(start));
        return buf.toString();
    }

    /**
     * Copied from Apache commons-lang3-3.6
     * <p>
     * <p>Checks if a CharSequence is empty ("") or null.</p>
     * <p>
     * <pre>
     * StringUtils.isEmpty(null)      = true
     * StringUtils.isEmpty("")        = true
     * StringUtils.isEmpty(" ")       = false
     * StringUtils.isEmpty("bob")     = false
     * StringUtils.isEmpty("  bob  ") = false
     * </pre>
     * <p>
     * <p>NOTE: This method changed in Lang version 2.0.
     * It no longer trims the CharSequence.
     * That functionality is available in isBlank().</p>
     *
     * @param cs the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is empty or null
     */
    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    /**
     * Copied from Apache commons-lang3-3.6
     * <p>
     * Represents a failed index search.
     */
    private static final int INDEX_NOT_FOUND = -1;
}