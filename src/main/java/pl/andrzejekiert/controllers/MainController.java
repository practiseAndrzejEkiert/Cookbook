package pl.andrzejekiert.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.controlsfx.control.textfield.TextFields;
import pl.andrzejekiert.models.database.dao.CookbookDao;
import pl.andrzejekiert.models.database.dao.ProductsDao;
import pl.andrzejekiert.models.database.dao.impl.CookbookDaoImplements;
import pl.andrzejekiert.models.database.dao.impl.ProductsDaoImplements;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.*;


public class MainController implements Initializable {
    @FXML
    AnchorPane rootPane;
    @FXML
    private Label labelTitle;

    @FXML
    private Label labelDescription;

    @FXML
    private TextField textFieldInput;

    @FXML
    private Text textProducts;
    @FXML
    private Button button;
    @FXML
    private ListView listViewProducts;

    @FXML
    private Button buttonAddRecipe;



    private CookbookDao cookbookDao = new CookbookDaoImplements();
    private ProductsDao productsDao = new ProductsDaoImplements();

    public void initialize(URL location, ResourceBundle resources) {

        String[] products = {"Pomidor", "Cebula", "Papryka", "Pietruszka korzeń", "Pietruszka natka"};
//todo z bazydanych pobrac produky
        TextFields.bindAutoCompletion(textFieldInput, products);
        List<String> productsList = new ArrayList<>();
        button.setOnMouseClicked(e -> {
            if (e.isShiftDown()) {
                cookbookDao.loadCookbook(Integer.parseInt(textFieldInput.getText()));
                return;
            }
            if (e.isAltDown()) {
                productsDao.loadProductsModel(Integer.parseInt(textFieldInput.getText()));
                return;

            }
            System.out.println(productsList);



        });
        buttonAddRecipe.setOnMouseClicked(e -> {
            try {
                handleButtonAction();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }
    void handleButtonAction() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("addRecipe.fxml"));
        Parent root1 =fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("addRecipe");
        stage.setScene(new Scene((root1)));
        stage.show();

    }

}