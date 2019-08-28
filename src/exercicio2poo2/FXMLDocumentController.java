
package exercicio2poo2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class FXMLDocumentController implements Initializable {

    @FXML
    private CheckBox CheckBoxAcao;
    @FXML
    private CheckBox CheckBoxTerror;
    @FXML
    private CheckBox CheckBoxRomance;
    @FXML
    private CheckBox CheckBoxComedia;
    @FXML
    private RadioButton Radio1;
    @FXML
    private ToggleGroup Filme;
    @FXML
    private RadioButton Radio2;
    @FXML
    private RadioButton Radio3;
    @FXML
    private TextArea TextAreaOpniao;
    @FXML
    private Label LabelRespostas;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
