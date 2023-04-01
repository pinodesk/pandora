package com.gitlab.mudia.pro.pandora.formatter;

import javafx.scene.control.TextFormatter;

public class DigitFormatter extends TextFormatter<String> {

    public DigitFormatter() {
        super(change -> change.getText().matches("\\d*") ? change : null);
    }

}
