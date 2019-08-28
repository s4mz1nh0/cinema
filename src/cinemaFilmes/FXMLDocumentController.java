
package cinemaFilmes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Petrônio
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private CheckBox CheckBoxAcao;
    @FXML
    private CheckBox CheckBoxTerror;
    @FXML
    private CheckBox CheckBoxRomance;
    @FXML
    private CheckBox CheckBoxComedia;
    @FXML
    private ToggleGroup Filme;
    @FXML
    private TextArea TextAreaOpniao;
    @FXML
    private Label LabelRespostas;
    @FXML
    private RadioButton Radio1;
    @FXML
    private RadioButton Radio2;
    @FXML
    private RadioButton Radio3;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void PegarRespostas(ActionEvent event) {
        
        String m = " ";
        String n =" ";
        String o =" ";
        
        if(CheckBoxAcao.isSelected()){
            m+=CheckBoxAcao.getText();
        }
        if(CheckBoxComedia.isSelected()){
            m+=CheckBoxComedia.getText();
        }
        if(CheckBoxRomance.isSelected()){
            m+=CheckBoxRomance.getText();
        }
        if(CheckBoxTerror.isSelected()){
            m+=CheckBoxTerror.getText();
        }
        
        
         o += "\n" + TextAreaOpniao.getText();
         
          if(Radio1.isSelected()){
            n = Radio1.getText();
          }
          if(Radio2.isSelected()){
            n = Radio2.getText();
          }
          if(Radio3.isSelected()){
            n = Radio3.getText();
          }
        
        LabelRespostas.setText (m + " \n " + n + " \n " + o);
    }
    
}
