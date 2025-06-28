package com.samir.mp3player.mp3_player;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Player_Application extends Application {

    @Override
    public void start(Stage stage) {
        // Set the window title
        stage.setTitle("MP3 Player");

        // Create the layout using a GridPane
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);         // Center the content
        pane.setHgap(10);                      // Horizontal gap between cells
        pane.setVgap(10);                      // Vertical gap between cells
        pane.setPadding(new Insets(25, 25, 25, 25)); // Padding around the grid

        // Create the scene and define its size
        Scene scene = new Scene(pane, 800, 600);

        // Title text for the player
        Text playerTitle = new Text("Welcome to MP3 Player");
        playerTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        pane.add(playerTitle, 0, 0, 2, 1); // Add the title spanning 2 columns

        // Username label and input field
        Label userName = new Label("User Name:");
        pane.add(userName, 0, 1);

        TextField userNameField = new TextField();
        pane.add(userNameField, 1, 1);

        // Password label and input field
        Label password = new Label("Password:");
        pane.add(password, 0, 2);

        PasswordField passwordField = new PasswordField();
        pane.add(passwordField, 1, 2);

        // Create sign-in button and align it to the bottom right
        Button signInButton = new Button("Sign in");
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        hbox.getChildren().add(signInButton);
        pane.add(hbox, 1, 4);

        // Text that shows an action result
        final Text actionTarget = new Text();
        pane.add(actionTarget, 1, 6);

        // Handle button click with a lambda expression
        signInButton.setOnAction(event -> {
            actionTarget.setFill(Color.FIREBRICK); // Set the text color
            actionTarget.setText("Sign in button pressed"); // Display a message
        });

        // Set the scene and show the stage
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(); // Launch the JavaFX application
    }
}
