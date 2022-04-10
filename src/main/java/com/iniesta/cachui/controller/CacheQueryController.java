package com.iniesta.cachui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.iniesta.cachui.domain.CacheConf;
import com.iniesta.cachui.infra.CacheManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class CacheQueryController {

    private CacheManager cacheManager;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<?> historyQueries;

    @FXML
    private TextArea queryText;

    @FXML
    private Button runButton;

    @FXML
    private Button saveButton;

    @FXML
    private TableView<?> tableResults;
    private CacheConf cacheConf;

    @FXML
    void onRunAction(ActionEvent event) {
        cacheManager.execute(queryText.getText());
    }

    @FXML
    void onSaveAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert historyQueries != null : "fx:id=\"historyQueries\" was not injected: check your FXML file 'cache-query.fxml'.";
        assert queryText != null : "fx:id=\"queryText\" was not injected: check your FXML file 'cache-query.fxml'.";
        assert runButton != null : "fx:id=\"runButton\" was not injected: check your FXML file 'cache-query.fxml'.";
        assert saveButton != null : "fx:id=\"saveButton\" was not injected: check your FXML file 'cache-query.fxml'.";
        assert tableResults != null : "fx:id=\"tableResults\" was not injected: check your FXML file 'cache-query.fxml'.";

    }

    public void setCacheConf(CacheConf conf) {
        cacheConf = conf;
    }
}
