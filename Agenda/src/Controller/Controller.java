package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Model.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Controller implements Initializable {
	@FXML
	private TableView myTable;
	

	public void initialize(URL url, ResourceBundle rb) {
		TableColumn nombre = new TableColumn("NOMBRE");
		TableColumn apellido = new TableColumn("APELLIDO");
		TableColumn email = new TableColumn("EMAIL");


		myTable.getColumns().addAll(nombre, apellido, email);

		final ObservableList<Person> data = FXCollections.observableArrayList(
				new Person("Isabella", "Perez", "Isabella.johnson@example.com"),
				new Person("Carlos", "Gonzalez", "Carlos.johnson@example.com"),
				new Person("Fernando", "Ruiz", "Fernando.johnson@example.com"),
				new Person("Laura", "Martinez", "Laura.johnson@example.com"),
				new Person("Irene", "Alvarez", "Irene.johnson@example.com"));

		// Step : 3# Associate data with columns
		nombre.setCellValueFactory(new PropertyValueFactory<Person, String>("nombre"));

		apellido.setCellValueFactory(new PropertyValueFactory<Person, String>("apellido"));

		email.setCellValueFactory(new PropertyValueFactory<Person, String>("email"));

		// Step 4: add data inside table
		myTable.setItems(data);
	}
	
	public void cambiarVista(Button btn, String rsc) {
		try {

			Stage stage;
			Parent changeTo;
			stage = (Stage) btn.getScene().getWindow();
			changeTo = FXMLLoader.load(getClass().getResource(rsc));
			Scene vista = new Scene(changeTo);
			stage.setScene(vista);
			stage.show();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}


	

}
