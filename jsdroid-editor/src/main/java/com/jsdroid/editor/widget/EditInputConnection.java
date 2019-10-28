package com.jsdroid.editor.widget;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

class EditInputConnection extends InputConnectionWrapper {

    /**
     * Initializes a wrapper.
     * <p>
     * <p><b>Caveat:</b> Although the system can accept {@code (InputConnection) null} in some
     * places, you cannot emulate such a behavior by non-null {@link InputConnectionWrapper} that
     * has {@code null} in {@code target}.</p>
     *
     * @param target  the {@link InputConnection} to be proxied.
     * @param mutable set {@code true} to protect this object from being reconfigured to target
     *                another {@link InputConnection}.  Note that this is ignored while the target is {@code null}.
     */
    public EditInputConnection(InputConnection target, boolean mutable) {
        super(target, mutable);
    }

    @Override
    public void setTarget(InputConnection target) {
        super.setTarget(target);
    }


    @Override
    public CharSequence getTextBeforeCursor(int n, int flags) {
        return super.getTextBeforeCursor(n, flags);
    }

    @Override
    public CharSequence getTextAfterCursor(int n, int flags) {
        return super.getTextAfterCursor(n, flags);
    }

    @Override
    public CharSequence getSelectedText(int flags) {
        return super.getSelectedText(flags);
    }

    @Override
    public int getCursorCapsMode(int reqModes) {
        return super.getCursorCapsMode(reqModes);
    }

    @Override
    public ExtractedText getExtractedText(ExtractedTextRequest request, int flags) {
        return super.getExtractedText(request, flags);
    }

    @Override
    public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        return super.deleteSurroundingTextInCodePoints(beforeLength, afterLength);
    }

    @Override
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        return super.deleteSurroundingText(beforeLength, afterLength);
    }

    @Override
    public boolean setComposingText(CharSequence text, int newCursorPosition) {
        return super.setComposingText(text, newCursorPosition);
    }

    @Override
    public boolean setComposingRegion(int start, int end) {
        return super.setComposingRegion(start, end);
    }

    @Override
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    @Override
    public boolean commitText(CharSequence text, int newCursorPosition) {
        return super.commitText(text, newCursorPosition);
    }

    @Override
    public boolean commitCompletion(CompletionInfo text) {
        return super.commitCompletion(text);
    }

    @Override
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        return super.commitCorrection(correctionInfo);
    }

    @Override
    public boolean setSelection(int start, int end) {
        return super.setSelection(start, end);
    }

    @Override
    public boolean performEditorAction(int editorAction) {
        return super.performEditorAction(editorAction);
    }

    @Override
    public boolean performContextMenuAction(int id) {
        return super.performContextMenuAction(id);
    }

    @Override
    public boolean beginBatchEdit() {
        return super.beginBatchEdit();
    }

    @Override
    public boolean endBatchEdit() {
        return super.endBatchEdit();
    }

    @Override
    public boolean sendKeyEvent(KeyEvent event) {
        return super.sendKeyEvent(event);
    }

    @Override
    public boolean clearMetaKeyStates(int states) {
        return super.clearMetaKeyStates(states);
    }

    @Override
    public boolean reportFullscreenMode(boolean enabled) {
        return super.reportFullscreenMode(enabled);
    }

    @Override
    public boolean performPrivateCommand(String action, Bundle data) {
        return super.performPrivateCommand(action, data);
    }

    @Override
    public boolean requestCursorUpdates(int cursorUpdateMode) {
        return super.requestCursorUpdates(cursorUpdateMode);
    }

    @Override
    public Handler getHandler() {
        return super.getHandler();
    }

    @Override
    public void closeConnection() {
        super.closeConnection();
    }

    @Override
    public boolean commitContent(InputContentInfo inputContentInfo, int flags, Bundle opts) {
        long t = System.currentTimeMillis();
        try {
            return super.commitContent(inputContentInfo, flags, opts);
        } finally {

        }


    }
}
