package com.pinodesk.pandora.converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.commons.lang3.StringUtils;

import javafx.util.StringConverter;

public class DefaultDatePickerConverter extends StringConverter<LocalDate> {

    private DateTimeFormatter formatter;

    public DefaultDatePickerConverter(String datePattern) {
        formatter = DateTimeFormatter.ofPattern(datePattern);
    }

    @Override
    public LocalDate fromString(String str) {
        if (StringUtils.isBlank(str)) {
            return null;
        }
        return LocalDate.parse(str, formatter);
    }

    @Override
    public String toString(LocalDate date) {
        if (date == null) {
            return null;
        }
        return formatter.format(date);
    }

}
