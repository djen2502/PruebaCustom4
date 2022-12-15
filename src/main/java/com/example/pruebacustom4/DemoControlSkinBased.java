package com.example.pruebacustom4;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DemoControlSkinBased extends Application {
    private CustomControl control0;
    private CustomControl control1;


    @Override public void init() {
        control0 = new CustomControl();
        control0.setState(true);
        control0.setPrefSize(100, 100);
        control0.setColor(Color.LIME);

        control1 = new CustomControl(CustomControl.SkinType.SWITCH);
        control1.setState(true);
        control1.setColor(Color.web("#4bd865"));
        control1.stateProperty().addListener((o, ov, nv) -> control0.setState(nv));
    }

    @Override public void start(final Stage stage) {
        VBox pane = new VBox(20, control0, control1);
        pane.setPadding(new Insets(20));

        Scene scene = new Scene(pane, 200, 200);
        scene.getStylesheets().add(DemoControlSkinBased.class.getResource("estiloss.css").toExternalForm());

        stage.setTitle("Control-Skin based Control");
        stage.setScene(scene);
        stage.show();
    }

    @Override public void stop() {
        Platform.exit();
        System.exit(0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

