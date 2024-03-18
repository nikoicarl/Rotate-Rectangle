/**
 * Student Name: Carl Nikoi
 * Student Number: 100439006
 */
package org.example.lab8;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RotateRectangle extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        // Create a pane to hold the rectangle
        StackPane stackPane = new StackPane();
        Rectangle rectangle = new Rectangle(200, 50, 200, 100);
        rectangle.setFill(Color.rgb(255, 255, 255, 0.5));
        rectangle.setStroke(Color.BLACK);
        stackPane.getChildren().add(rectangle);
        root.setCenter(stackPane);

        // Create a button to rotate the rectangle
        Button rotateButton = new Button("Rotate");
        rotateButton.setOnAction(e -> rotateRectangle(rectangle));
        root.setBottom(rotateButton);
        BorderPane.setAlignment(rotateButton, Pos.CENTER);

        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.setTitle("Lab 8 Carl Ashie Nikoi");
        primaryStage.show();
    }

    // Method
    private void rotateRectangle(Rectangle rectangle) {
        double angle = rectangle.getRotate() + 15;
        rectangle.setRotate(angle);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
