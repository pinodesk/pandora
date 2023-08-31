package com.gitlab.mudiasoft.pandora.factory;

import javafx.scene.Node;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

/**
 * Renders the TableCell item property within the
 * {@link TableCell#graphicProperty() graphic} property if the {@link Cell#item
 * item} is a Node, or it simply calls <code>toString()</code> if it is not
 * null, setting the resulting string inside the {@link Cell#textProperty()
 * text} property.
 * 
 * @see TableColumn.DEFAULT_CELL_FACTORY
 */
public class DefaultCellFactory<E, T> implements Callback<TableColumn<E, T>, TableCell<E, T>> {

    @Override
    public TableCell<E, T> call(TableColumn<E, T> param) {
        return new TableCell<E, T>() {
            @Override
            protected void updateItem(T item, boolean empty) {
                if (item == getItem())
                    return;

                super.updateItem(item, empty);

                if (item == null) {
                    super.setText(null);
                    super.setGraphic(null);
                } else if (item instanceof Node) {
                    super.setText(null);
                    super.setGraphic((Node) item);
                } else {
                    super.setText(item.toString());
                    super.setGraphic(null);
                }
            }
        };
    }
}
