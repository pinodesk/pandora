package com.gitlab.mudiasoft.pandora.utility;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;

public final class ScrollPaneUtils {
    private ScrollPaneUtils() {
    }

    // Reference:
    // https://stackoverflow.com/questions/26098295/scrollpane-content-becomes-blurry-after-dragging/50486726#50486726
    public static void fixBlur(ScrollPane scrollPane) {
        StackPane stackPane = (StackPane) scrollPane.lookup("ScrollPane .viewport");
        stackPane.setCache(false);
    }

}
