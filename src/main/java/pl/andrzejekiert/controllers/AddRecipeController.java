package pl.andrzejekiert.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.controlsfx.control.textfield.TextFields;
import pl.andrzejekiert.models.CookbookModel;
import pl.andrzejekiert.models.ProductsModel;
import pl.andrzejekiert.models.database.dao.ConnectorDao;
import pl.andrzejekiert.models.database.dao.CookbookDao;
import pl.andrzejekiert.models.database.dao.ProductsDao;
import pl.andrzejekiert.models.database.dao.impl.ConnectorDaoImplements;
import pl.andrzejekiert.models.database.dao.impl.CookbookDaoImplements;
import pl.andrzejekiert.models.database.dao.impl.ProductsDaoImplements;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class AddRecipeController implements Initializable {

    @FXML
    AnchorPane anchorPane;
    @FXML
    Label labelTitle;

    @FXML
    TextField product1;
    @FXML
    TextField product2;
    @FXML
    TextField product3;
    @FXML
    TextField product4;
    @FXML
    TextField product5;
    @FXML
    TextField product6;
    @FXML
    TextField product7;
    @FXML
    TextField product8;
    @FXML
    TextField product9;
    @FXML
    TextField product10;
    @FXML
    TextField product11;
    @FXML
    TextField product12;
    @FXML
    TextField product13;
    @FXML
    TextField product14;
    @FXML
    TextField product15;
    @FXML
    TextField product16;
    @FXML
    TextField product17;
    @FXML
    TextField product18;
    @FXML
    TextField product19;
    @FXML
    TextField product20;
    @FXML
    TextField textFieldTime;

    @FXML
    Button buttonAddProducts;

    @FXML
    TextArea textAreaAddDescription;

    @FXML
    Button buttonAddRecipe;
    @FXML
    TextField textFieldRecipe;

private ConnectorDao connectorDao = new ConnectorDaoImplements();
    private ProductsDao productsDao = new ProductsDaoImplements();
    private String recipe;
    private String products1;
    private String products2;
    private String products3;
    private String products4;
    private String products5;
    private String products6;
    private String products7;
    private String products8;
    private String products9;
    private String products10;
    private String products11;
    private String products12;
    private String products13;
    private String products14;
    private String products15;
    private String products16;
    private String products17;
    private String products18;
    private String products19;
    private String products20;
    private String products21;
    private int time;
    private String description;


    int counter = 1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buttonAddProducts.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getButton().equals(MouseButton.PRIMARY)) {

                    counter++;
                    if (counter == 2) {
                        product2.setOpacity(1);
                    }
                    if (counter == 3) {
                        product3.setOpacity(1);
                    }
                    if (counter == 4) {
                        product4.setOpacity(1);
                    }
                    if (counter == 5) {
                        product5.setOpacity(1);
                    }
                    if (counter == 6) {
                        product6.setOpacity(1);
                    }
                    if (counter == 7) {
                        product7.setOpacity(1);
                    }
                    if (counter == 8) {
                        product8.setOpacity(1);
                    }
                    if (counter == 9) {
                        product9.setOpacity(1);
                    }
                    if (counter == 10) {
                        product10.setOpacity(1);
                    }
                    if (counter == 11) {
                        product11.setOpacity(1);
                    }
                    if (counter == 12) {
                        product12.setOpacity(1);
                    }
                    if (counter == 13) {
                        product13.setOpacity(1);
                    }
                    if (counter == 14) {
                        product14.setOpacity(1);
                    }
                    if (counter == 15) {
                        product15.setOpacity(1);
                    }
                    if (counter == 16) {
                        product16.setOpacity(1);
                    }
                    if (counter == 17) {
                        product17.setOpacity(1);
                    }
                    if (counter == 18) {
                        product18.setOpacity(1);
                    }
                    if (counter == 19) {
                        product19.setOpacity(1);
                    }
                    if (counter == 20) {
                        product20.setOpacity(1);
                    }
                }
            }
        });

        buttonAddRecipe.setOnMouseClicked(e -> {
            recipe = (textFieldRecipe.getText());
            products1 = product1.getText();
            products2 = product2.getText();
            products3 = product3.getText();
            products4 = product4.getText();
            products5 = product5.getText();
            products6 = product6.getText();
            products7 = product7.getText();
            products8 = product8.getText();
            products9 = product9.getText();
            products10 = product10.getText();
            products11 = product11.getText();
            products12 = product12.getText();
            products13 = product13.getText();
            products14 = product14.getText();
            products15 = product15.getText();
            products16 = product16.getText();
            products17 = product17.getText();
            products18 = product18.getText();
            products19 = product19.getText();
            products20 = product20.getText();
            products21 = product20.getText();

            ProductsModel model = new ProductsModel(0, recipe, products1, products2, products3, products4, products5, products6, products7, products8, products9, products10, products11, products12, products13, products14, products15, products16, products17, products18, products19, products20, products21);
            ProductsDao productsDao = new ProductsDaoImplements();
            productsDao.saveProducts(model);
            time= Integer.parseInt(textFieldTime.getText());
            description=textAreaAddDescription.getText();
            CookbookModel cookbookModel = new CookbookModel(0, time, description, recipe);
            CookbookDao cookbookDao = new CookbookDaoImplements();
            cookbookDao.saveCookbook(cookbookModel);
            connectorDao.saveConnection();
        });

    }


}
