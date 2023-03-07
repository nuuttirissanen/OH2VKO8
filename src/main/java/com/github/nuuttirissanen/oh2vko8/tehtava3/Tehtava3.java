package com.github.nuuttirissanen.oh2vko8.tehtava3;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Tehtava3 extends Application{

    @Override
    public void start(Stage ikkuna) {
        StackPane root = new StackPane();
        Circle ympyra = new Circle();
        ympyra.setFill(Color.BLUE);

        root.getChildren().add(ympyra);

        Scene scene = new Scene(root, 600, 400);
        ikkuna.widthProperty().addListener((observable -> {
            ympyra.setRadius(Math.min(ikkuna.getHeight() - (ikkuna.getHeight() - scene.getHeight()) , ikkuna.getWidth()) / 2);
        }));
        ikkuna.heightProperty().addListener((observable -> {
            ympyra.setRadius(Math.min(ikkuna.getHeight() - (ikkuna.getHeight() - scene.getHeight()), ikkuna.getWidth()) / 2);
        }));

        new Thread(new Runnable() {
            Color vari;

            @Override
            public void run() {
                try {
                    while (true) {
                        if (ympyra.getFill().equals(Color.BLUE)) {
                            vari = Color.YELLOW;
                        }else {
                            vari = Color.BLUE;
                        }
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                ympyra.setFill(vari);
                            }
                        });
                        Thread.sleep(200);
                    }

                }
                catch(InterruptedException e) {
                    System.out.println(e);
                }
            }
        }).start();

        ikkuna.setScene(scene);
        ikkuna.setTitle("Vilkkuva pallo!");
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(args);
        System.exit(0);
    }
}
