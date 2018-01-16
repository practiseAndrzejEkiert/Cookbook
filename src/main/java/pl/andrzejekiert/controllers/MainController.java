package pl.andrzejekiert.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.controlsfx.control.textfield.TextFields;
import pl.andrzejekiert.models.ProductsModel;
import pl.andrzejekiert.models.database.dao.CookbookDao;
import pl.andrzejekiert.models.database.dao.ProductsDao;
import pl.andrzejekiert.models.database.dao.impl.CookbookDaoImplements;
import pl.andrzejekiert.models.database.dao.impl.ProductsDaoImplements;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
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
    private Button buttonSearch;
    @FXML
    private ListView listViewProducts;

    @FXML
    private Button buttonAddRecipe;

    @FXML
    TextField product1 ;
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

    private CookbookDao cookbookDao = new CookbookDaoImplements();
    private ProductsDao productsDao = new ProductsDaoImplements();
public List<String> productList=new ArrayList<>();

    public void initialize(URL location, ResourceBundle resources) {
        AddProductVisibility();
        List<String> products= productsDao.loadProductsModel();

        TextFields.bindAutoCompletion(product1, products);
        TextFields.bindAutoCompletion(product2, products);
        TextFields.bindAutoCompletion(product3, products);
        TextFields.bindAutoCompletion(product4, products);
        TextFields.bindAutoCompletion(product5, products);
        TextFields.bindAutoCompletion(product6, products);
        TextFields.bindAutoCompletion(product7, products);
        TextFields.bindAutoCompletion(product8, products);
        TextFields.bindAutoCompletion(product9, products);
        TextFields.bindAutoCompletion(product10, products);
        TextFields.bindAutoCompletion(product11, products);
        TextFields.bindAutoCompletion(product12, products);
        TextFields.bindAutoCompletion(product13, products);
        TextFields.bindAutoCompletion(product14, products);
        TextFields.bindAutoCompletion(product15, products);
        TextFields.bindAutoCompletion(product16, products);
        TextFields.bindAutoCompletion(product17, products);
        TextFields.bindAutoCompletion(product18, products);
        TextFields.bindAutoCompletion(product19, products);
        TextFields.bindAutoCompletion(product20, products);


        buttonAddRecipe.setOnMouseClicked(e -> {
            try {
                handleButtonAction();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        buttonSearch.setOnMouseClicked(e->{
            try {
                cookbookDao.checkProducts(productList);
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        });
    }





    void handleButtonAction() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("addRecipe.fxml"));
        Parent root1 = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("addRecipe");
        stage.setScene(new Scene((root1)));
        stage.show();

    }

    private void AddProductVisibility() {
        product1.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    productList.add(product1.getText());
                    product2.setOpacity(1);
                    product2.requestFocus();
                }
            }
        });
        product2.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product3.setOpacity(1);
                    product3.requestFocus();productList.add(product2.getText());
                }
            }
        });
        product3.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product4.setOpacity(1);
                    product4.requestFocus();productList.add(product3.getText());
                }
            }
        });
        product4.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product5.setOpacity(1);
                    product5.requestFocus();productList.add(product4.getText());
                }
            }
        });
        product5.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product6.setOpacity(1);
                    product6.requestFocus();productList.add(product5.getText());
                }
            }
        });
        product6.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product7.setOpacity(1);
                    product7.requestFocus();
                }
            }
        });
        product7.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product8.setOpacity(1);
                    product8.requestFocus();
                }
            }
        });
        product8.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product9.setOpacity(1);
                    product9.requestFocus();
                }
            }
        });
        product9.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product10.setOpacity(1);
                    product10.requestFocus();
                }
            }
        });
        product10.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product11.setOpacity(1);
                    product11.requestFocus();
                }
            }
        });
        product11.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product12.setOpacity(1);
                    product12.requestFocus();
                }
            }
        });
        product12.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product13.setOpacity(1);
                    product13.requestFocus();

                }
            }
        });
        product13.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product14.setOpacity(1);
                    product14.requestFocus();
                }
            }
        });
        product14.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product15.setOpacity(1);
                    product15.requestFocus();
                }
            }
        });
        product15.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product16.setOpacity(1);
                    product16.requestFocus();
                }
            }
        });
        product16.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product17.setOpacity(1);
                    product17.requestFocus();
                }
            }
        });
        product17.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product18.setOpacity(1);
                    product18.requestFocus();
                }
            }
        });
        product18.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product19.setOpacity(1);
                    product19.requestFocus();
                }
            }
        });
        product19.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product20.setOpacity(1);
                    product20.requestFocus();
                }
            }
        });
    }

}
