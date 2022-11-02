package view;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

	class Acao implements EventHandler<MouseEvent> {
		@Override
		public void handle(MouseEvent event) {
			System.out.println("Hello World");
		}
	}

public class HelloWorld extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane painel = new BorderPane();
		Scene scn = new Scene(painel, 400, 300);
		
		Label lbltext = new Label ("Texto");
		painel.setTop(lbltext);
		BorderPane.setAlignment(lbltext, Pos.CENTER);
		
		Button btnOk = new Button("OK");
		painel.setCenter(btnOk);
		BorderPane.setAlignment(btnOk, Pos.CENTER);
		
		Acao ac = new Acao ();
		btnOk.addEventFilter(MouseEvent.MOUSE_PRESSED, ac);

		stage.setScene(scn);
		stage.setTitle("Teste de eventos");
		stage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(HelloWorld.class, args);
	}
}
