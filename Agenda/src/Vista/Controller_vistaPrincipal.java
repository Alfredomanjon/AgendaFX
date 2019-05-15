package Vista;

import Controller.Controller;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller_vistaPrincipal extends Controller {
	
	@FXML
	private Button btn_nuevo;
	
	public void toEdicion() {
		cambiarVista(btn_nuevo, "../Vista/VistaEdicion.fxml");
	}
}
