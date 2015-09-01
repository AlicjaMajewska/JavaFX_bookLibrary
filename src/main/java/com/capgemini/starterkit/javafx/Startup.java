package com.capgemini.starterkit.javafx;

import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Startup extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		

		primaryStage.setTitle("StarterKit-JavaFX");

		
		Parent root = FXMLLoader.load(
				getClass().getResource("/com/capgemini/starterkit/javafx/view/library.fxml"), //
				ResourceBundle.getBundle("com/capgemini/starterkit/javafx/bundle/library_bundle"));

		Scene scene = new Scene(root);

		/*
		 * Set the style sheet(s) for application.
		 */
		scene.getStylesheets()
				.add(getClass().getResource("/com/capgemini/starterkit/javafx/css/standard.css").toExternalForm());
		// scene.getStylesheets().add(getClass().getResource("/com/capgemini/starterkit/javafx/css/alternative.css").toExternalForm());

		primaryStage.setScene(scene);

		primaryStage.show();
	}
}
