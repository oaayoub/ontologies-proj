module org.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires okhttp3;
    requires ollama4j;
    requires com.google.gson;

    opens org.example.demo to javafx.fxml;
    exports org.example.demo;
}