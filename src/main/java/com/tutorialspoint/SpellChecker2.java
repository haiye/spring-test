package com.tutorialspoint;

public class SpellChecker2 extends SpellChecker{
    public SpellChecker2() {
        System.out.println("Inside SpellChecker constructor.");
    }

    public void checkSpelling() {
        System.out.println(this.getClass().getSimpleName()+": Inside checkSpelling.");
    }
}