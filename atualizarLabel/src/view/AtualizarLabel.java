package view;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class AtualizarLabel  extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane painel = new BorderPane();
		Scene scn = new Scene(painel, 400, 300);
		
		
	class Acao implements EventHandler<MouseEvent> {
		@Override
		public void handle(MouseEvent event) {
		Label lbltxt = new Label("Botao Apertado");
		painel.setTop(lbltxt);
		painel.setPadding(new Insets(15));
		BorderPane.setAlignment(lbltxt, Pos.CENTER);
		
		
	}
	
}

		Button btnOk = new Button("OK");
		painel.setCenter(btnOk);
		BorderPane.setAlignment(btnOk, Pos.CENTER);		
		Acao ac = new Acao();
		btnOk.addEventFilter(MouseEvent.MOUSE_PRESSED, ac);
		
		
		stage.setTitle("Teste de eventos");
		stage.setScene(scn);
		stage.show();
		
	}
	public static void main(String[] args) {
		Application.launch(AtualizarLabel.class, args);
	}
}
