package view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class Formulario extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		GridPane grid = new GridPane();
		Scene scn = new Scene(grid, 600, 200);
		
		Label lblId = new Label("ID: ");
		TextField txtId = new TextField();		
		grid.add(lblId, 0,0);
		grid.add(txtId, 3,0);
		
		Label lblNome = new Label("Nome: ");
		TextField txtNome = new TextField();
		grid.add(lblNome, 0, 1);
		grid.add(txtNome, 3, 1);
		
		Label lblTel = new Label("Telefone: ");
		TextField txtTel = new TextField();
		grid.add(lblTel, 0, 2);
		grid.add(txtTel, 3, 2);
		txtTel.setMinWidth(400);
		
		RowConstraints row1 = new RowConstraints();
		RowConstraints row2 = new RowConstraints();
		RowConstraints row3 = new RowConstraints();
		row1.setPercentHeight(20);
		row2.setPercentHeight(20);
		row3.setPercentHeight(20);
		grid.getRowConstraints().addAll(row1, row2, row3);
		grid.setPadding(new Insets(20));
		
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(10);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPercentWidth(15);
		grid.getColumnConstraints().addAll(col1, col2);
		
		Button btnSalvar = new Button("Salvar");
		Button btnPesquisar = new Button("Pesquisar");
		grid.add(btnSalvar, 0, 3);
		grid.add(btnPesquisar, 1, 3);
		
		stage.setScene(scn);
		stage.setTitle("Agenda de Contatos");		
		stage.show();
		
	}
	public static void main(String[] args) {
		Application.launch(Formulario.class, args);
	}

}
