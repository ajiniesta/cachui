package com.iniesta.cachui.controller;

import com.iniesta.cachui.domain.CacheConf;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ConfigController {

    @FXML
    private TextField hostTextField;
    @FXML
    private TextField portTextField;

    private CacheConf cacheConf;

    @FXML
    void onCancel(ActionEvent event) {

    }

    @FXML
    void onSave(ActionEvent event) {
        cacheConf = new CacheConf();
        cacheConf.setHost(hostTextField.getText());
        cacheConf.setPort(Integer.parseInt(portTextField.getText()));
        ((Stage)hostTextField.getScene().getWindow()).close();
    }

    @FXML
    void onTest(ActionEvent event) {

    }

    public CacheConf getConf(){
        return cacheConf;
    }
}
