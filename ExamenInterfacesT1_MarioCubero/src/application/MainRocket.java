package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * Esta clase se encarga de iniciar nuestro proyecto y cargar la primera vista
 * 
 * @author mario 
 * @version 1.0.0
 * @see ControladorRocket
 * @see ControladorImagenes
 */

public class MainRocket extends Application {

	Stage stage;


	@Override
	public void start(Stage myStage) throws Exception {

		stage = myStage;
		Ventana();		

	}		

	private void Ventana() {

		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("view/Mars.fxml"));
			AnchorPane pane = loader.load();
			Scene scene = new Scene(pane);		
			stage.setTitle("Let me in");
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void closeStage() {
		stage.close();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
