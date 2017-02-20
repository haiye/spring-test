package com.tutorialspoint;

public class TextEditorDIConstructor {
    private SpellChecker spellChecker;

    public TextEditorDIConstructor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}