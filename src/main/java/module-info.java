module com.iniesta.cachui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.iniesta.cachui to javafx.fxml;
    exports com.iniesta.cachui;
    exports com.iniesta.cachui.controller;
    opens com.iniesta.cachui.controller to javafx.fxml;

    requires redis.clients.jedis;
}