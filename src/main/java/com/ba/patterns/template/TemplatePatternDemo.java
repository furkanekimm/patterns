package com.ba.patterns.template;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game football = new Football();
        football.play();

        Game cricket = new Cricket();
        cricket.play();
    }
}
