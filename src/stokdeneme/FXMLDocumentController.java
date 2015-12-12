
package stokdeneme;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField txt_user;
    @FXML
    private PasswordField pass;
    @FXML
    private Button btn_giris;
    @FXML
    private TextField txt_iban;
    @FXML
    private TextField txt_marka;
    @FXML
    private TextField txt_model;
    @FXML
    private TextField txt_fiyat;
    @FXML
    private TextField txt_miktar;
    String user = "ismetarslan";
    String password = "ismetarslan";
    @FXML
    private Button btn_ekle;
    @FXML
    private TableView<stok> tableView;
    @FXML
    private TableColumn<stok, String> tbl_user;
    @FXML
    private TableColumn<stok, Integer> tbl_iban;
    @FXML
    private TableColumn<stok, String> tbl_marka;
    @FXML
    private TableColumn<stok, String> tbl_model;
    @FXML
    private TableColumn<stok, Integer> tbl_fiyat;
    @FXML
    private TableColumn<stok, Integer> tbl_miktar;
    
    ObservableList<stok> liste = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tbl_user.setCellValueFactory(new PropertyValueFactory<stok, String>("userName"));
        tbl_iban.setCellValueFactory(new PropertyValueFactory<stok, Integer>("iban"));
        tbl_marka.setCellValueFactory(new PropertyValueFactory<stok, String>("marka"));
        tbl_model.setCellValueFactory(new PropertyValueFactory<stok, String>("model"));
        tbl_fiyat.setCellValueFactory(new PropertyValueFactory<stok, Integer>("fiyat"));
        tbl_miktar.setCellValueFactory(new PropertyValueFactory<stok, Integer>("miktar"));
        
    }    

    @FXML
    private void giris_basildi(ActionEvent event) {
        if(user.equals(txt_user.getText())&& password.equals(pass.getText())){
            txt_fiyat.setEditable(true);
            txt_iban.setEditable(true);
            txt_marka.setEditable(true);
            txt_model.setEditable(true);
            txt_miktar.setEditable(true);
            btn_ekle.setDisable(false);
            }
    }

    @FXML
    private void ekle_basildi(ActionEvent event) {
       int okunanIban,okunanFiyat,okunanMiktar;
       String okunanUser,okunanMarka,okunanModel;
       
       okunanUser= txt_user.getText();
       okunanMarka = txt_marka.getText();
       okunanModel = txt_model.getText();
       okunanIban= Integer.parseInt(txt_iban.getText());
       okunanFiyat = Integer.parseInt(txt_fiyat.getText());
       okunanMiktar = Integer.parseInt(txt_miktar.getText());
       
       liste=tableView.getItems();
       liste.add(new stok(okunanUser, okunanMarka, okunanModel, okunanIban, okunanFiyat, okunanMiktar));
       tableView.setItems(liste);
       
       txt_fiyat.clear();
       txt_iban.clear();
       txt_marka.clear();
       txt_miktar.clear();
       txt_model.clear();
       pass.clear();
       
    }
    
}
