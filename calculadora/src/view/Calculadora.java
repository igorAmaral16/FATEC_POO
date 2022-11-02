package view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Calculadora extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		FlowPane flow = new FlowPane();
		Scene scn = new Scene(flow, 300, 400);
		flow.setPadding(new Insets(20, 20, 20, 20));
		flow.setVgap(5);
		flow.setHgap(20);		

		TextField txtNum = new TextField();
		txtNum.setPrefSize(190, 50);
		flow.getChildren().add(txtNum);

		Button btnCe = new Button("CE");
		btnCe.setPrefSize(45, 45);
		flow.getChildren().add(btnCe);

		Button btnNum1 = new Button("1");
		Button btnNum2 = new Button("2");
		Button btnNum3 = new Button("3");
		Button btnMais = new Button("+");
		Button btnNum4 = new Button("4");
		Button btnNum5 = new Button("5");
		Button btnNum6 = new Button("6");
		Button btnMenos = new Button("-");
		Button btnNum7 = new Button("7");
		Button btnNum8 = new Button("8");
		Button btnNum9 = new Button("9");
		Button btnMult = new Button("*");
		Button btnPonto = new Button(".");
		Button btnNum0 = new Button("0");
		Button btnIgual = new Button("=");
		Button btnDiv = new Button("/");
		btnNum1.setPrefSize(50, 70);
		btnNum2.setPrefSize(50, 70);
		btnNum3.setPrefSize(50, 70);
		btnMais.setPrefSize(50, 70);
		btnNum4.setPrefSize(50, 70);
		btnNum5.setPrefSize(50, 70);
		btnNum6.setPrefSize(50, 70);
		btnMenos.setPrefSize(50, 70);
		btnNum7.setPrefSize(50, 70);
		btnNum8.setPrefSize(50, 70);
		btnNum9.setPrefSize(50, 70);
		btnMult.setPrefSize(50, 70);
		btnPonto.setPrefSize(50, 70);
		btnNum0.setPrefSize(50, 70);
		btnIgual.setPrefSize(50, 70);
		btnDiv.setPrefSize(50, 70);	
		flow.getChildren().addAll(btnNum1, btnNum2, btnNum3, btnMais, btnNum4,	btnNum5, btnNum6, 
		btnMenos, btnNum7, btnNum8, btnNum9, btnMult, btnPonto, btnNum0, btnIgual, btnDiv);
		
		stage.setScene(scn);
		stage.setTitle("Calculadora");
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(Calculadora.class, args);
	}
}
