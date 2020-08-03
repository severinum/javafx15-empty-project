package com.severinu;

import com.severinu.app.ApplicationManager;
import com.severinu.views.ViewFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ViewFactory viewFactory = new ViewFactory(new ApplicationManager());
        viewFactory.showMainWindow();
    }
}
