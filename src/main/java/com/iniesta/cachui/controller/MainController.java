package com.iniesta.cachui.controller;

import com.iniesta.cachui.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private TabPane tabpane;

    @FXML
    void onNewConnection(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("dialog-config-connection.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 200);
        stage.setTitle("New Connection");
        stage.setScene(scene);
        stage.showAndWait();
        ConfigController configCtrl = fxmlLoader.getController();
        System.out.println(configCtrl.getConf());

        FXMLLoader cacheQuery = new FXMLLoader(MainApplication.class.getResource("cache-query.fxml"));
        Parent parentCacheQuery = cacheQuery.load();
        ((CacheQueryController)cacheQuery.getController()).setCacheConf(configCtrl.getConf());
        Tab tab = new Tab(configCtrl.getConf().getName());
        tab.setClosable(true);
        tab.setContent(parentCacheQuery);
        tabpane.getTabs().add(tab);

    }

}
