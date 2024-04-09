package com.mudiatech.pandora.formatter;

import javafx.scene.control.TextFormatter;

public class DecimalFormatter extends TextFormatter<String> {

    public DecimalFormatter() {
        super(change -> {
            if (!change.isContentChange()) {
                // nothing is added or deleted but change must be returned as it contains
                // selection info and caret position
                return change;
            }
            String controlText = change.getControlText();
            String text = change.getText();
            boolean isComma = text.equals(",");
            boolean isDecimalSymbol = text.equals(",") || text.equals(".");
            boolean containsDecimalSymbol = controlText.contains(",") || controlText.contains(".");
            if (isDecimalSymbol && containsDecimalSymbol) {
                return null;
            }
            if (isDecimalSymbol && controlText.isBlank()) {
                change.setText("0.");
                change.selectRange(2, 2);
                return change;
            }
            if (isComma) {
                change.setText(".");
                return change;
            }
            return text.matches("[0-9]*\\,?\\.?[0-9]*") ? change : null;
        });
    }

}
