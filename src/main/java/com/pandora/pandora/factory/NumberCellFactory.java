package com.pinodesk.pandora.factory;

import java.util.Locale;

import com.pinodesk.toolbox.data.StringNumberUtils;

import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class NumberCellFactory<E, T extends Number> implements Callback<TableColumn<E, T>, TableCell<E, T>> {

    public static final int DEFAULT_DECIMAL_DIGIT = 0;

    private Locale locale;
    private int decimalDigit;

    public NumberCellFactory(int decimalDigit, Locale locale) {
        this.locale = locale;
        this.decimalDigit = decimalDigit;
    }

    public NumberCellFactory(Locale locale) {
        this(DEFAULT_DECIMAL_DIGIT, locale);
    }

    @Override
    public TableCell<E, T> call(TableColumn<E, T> param) {

        return new TableCell<E, T>() {
            @Override
            protected void updateItem(T item, boolean empty) {
                if (item == getItem()) {
                    return;
                }
                super.updateItem(item, empty);
                if (item == null) {
                    super.setText(null);
                    super.setGraphic(null);
                } else {
                    String formatted = StringNumberUtils.format(item, locale, decimalDigit);
                    super.setText(formatted);
                }
            }
        };
    }

}
