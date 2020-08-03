package com.severinu.views;

import com.severinu.app.ApplicationManager;
import com.severinu.controllers.BaseController;
import com.severinu.controllers.MainWindowController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {

    private ApplicationManager applicationManager;
    private String windowTitle;

    public ViewFactory(ApplicationManager applicationManager) {
        this.applicationManager = applicationManager;
    }

    private void initializeStage(BaseController controller)  {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(controller.getFxmlFileName()));
        fxmlLoader.setController(controller);
        Parent parent;
        try {
            parent = fxmlLoader.load();
        } catch (IOException e){
            System.out.println("Wystapil blad ladowania pliku fxml : " + controller.getFxmlFileName());
            e.printStackTrace();
            return;
        }
        Scene scene =  new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(this.windowTitle);
        stage.show();
    }


    public void showMainWindow()  {
        windowTitle = "New JavaFX 15 Blank App";
        BaseController controller = new MainWindowController(applicationManager, this, "MainWindow.fxml");
        initializeStage(controller);
    }
}
