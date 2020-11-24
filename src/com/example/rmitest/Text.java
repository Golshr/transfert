package com.example.rmitest;

import java.io.Serializable;

public class Text implements Serializable {

    private final String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
