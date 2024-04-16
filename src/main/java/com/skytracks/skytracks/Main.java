package com.skytracks.skytracks;

import com.skytracks.skytracks.view.Palette;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		try {
          	Parent root = FXMLLoader.load(getClass().getResource("/view/Signin.fxml"));

			Scene scene = new Scene(root);

			Palette.setDefaultPalette(Palette.LightPalette);
			Palette.getDefaultPalette().usePalette(scene);

			primaryStage.initStyle(StageStyle.DECORATED); // Set the stage style

			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Skytracks");
			primaryStage.getIcons().add(new Image(getClass().getResource("/images/SkynetLogo.png").toExternalForm()));
			primaryStage.show();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
