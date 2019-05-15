package Vista;

import Controller.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller_vistaEdicion extends Controller {
	@FXML
	private Button btn_cancel;
	
	public void toPrincipal1() {
		cambiarVista(btn_cancel, "../Vista/VistaPrincipal.fxml");
	}
	
	@FXML
	private Button btn_ok;
	
	public void toPrincipal2() {
		cambiarVista(btn_ok, "../Vista/VistaPrincipal.fxml");
	}
}
