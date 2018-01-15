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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
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
    private int recipeId;
    private String product;
    private String recipe;
    private int time;
    private String description;
private String title;
//do poprawy niech się świeci na czerwono
    int counter = 1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        AddProductVisibility();
        AddRecipeButton();
    }

    public void AddRecipeButton() {
        buttonAddRecipe.setOnMouseClicked(e -> {
            time = Integer.parseInt(textFieldTime.getText());
            description = textAreaAddDescription.getText();
            title = textFieldRecipe.getText();
            CookbookModel cookbookModel = new CookbookModel(0, time, description, title);
            CookbookDao cookbookDao = new CookbookDaoImplements();
            cookbookDao.saveCookbook(cookbookModel);
            connectorDao.saveConnection();
        });
    }

    private void AddProductVisibility() {
        product1.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product2.setOpacity(1);
                    product2.requestFocus();
                    //  recipeId = Integer.parseInt((textFieldRecipe.getText()));
                    product = product1.getText();
                    ProductsModel model = new ProductsModel(0, recipeId, product);
                    ProductsDao productsDao = new ProductsDaoImplements();
                    productsDao.saveProducts(model);
                }
            }
        });
        product2.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product3.setOpacity(1);
                    product3.requestFocus();
                    //  recipeId = Integer.parseInt((textFieldRecipe.getText()));
                    product = product2.getText();
                    ProductsModel model = new ProductsModel(0, recipeId, product);
                    ProductsDao productsDao = new ProductsDaoImplements();
                    productsDao.saveProducts(model);
                }
            }
        });
        product3.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product4.setOpacity(1);
                    product4.requestFocus();
                    //  recipeId = Integer.parseInt((textFieldRecipe.getText()));
                    product = product3.getText();
                    ProductsModel model = new ProductsModel(0, recipeId, product);
                    ProductsDao productsDao = new ProductsDaoImplements();
                    productsDao.saveProducts(model);
                }
            }
        });
        product4.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product5.setOpacity(1);
                    product5.requestFocus();
                    //  recipeId = Integer.parseInt((textFieldRecipe.getText()));
                    product = product4.getText();
                    ProductsModel model = new ProductsModel(0, recipeId, product);
                    ProductsDao productsDao = new ProductsDaoImplements();
                    productsDao.saveProducts(model);
                }
            }
        });
        product5.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product6.setOpacity(1);
                    product6.requestFocus();
                    //  recipeId = Integer.parseInt((textFieldRecipe.getText()));
                    product = product5.getText();
                    ProductsModel model = new ProductsModel(0, recipeId, product);
                    ProductsDao productsDao = new ProductsDaoImplements();
                    productsDao.saveProducts(model);
                }
            }
        });
        product6.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product7.setOpacity(1);
                    product7.requestFocus();
                    //  recipeId = Integer.parseInt((textFieldRecipe.getText()));
                    product = product6.getText();
                    ProductsModel model = new ProductsModel(0, recipeId, product);
                    ProductsDao productsDao = new ProductsDaoImplements();
                    productsDao.saveProducts(model);
                }
            }
        });
        product7.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product8.setOpacity(1);
                    product8.requestFocus();
                    //  recipeId = Integer.parseInt((textFieldRecipe.getText()));
                    product = product7.getText();
                    ProductsModel model = new ProductsModel(0, recipeId, product);
                    ProductsDao productsDao = new ProductsDaoImplements();
                    productsDao.saveProducts(model);
                }
            }
        });
        product8.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product9.setOpacity(1);
                    product9.requestFocus();
                    product = product8.getText();
                    ProductsModel model = new ProductsModel(0, recipeId, product);
                    ProductsDao productsDao = new ProductsDaoImplements();
                    productsDao.saveProducts(model);
                }
            }
        });
        product9.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product10.setOpacity(1);
                    product10.requestFocus();
                    product = product9.getText();
                    ProductsModel model = new ProductsModel(0, recipeId, product);
                    ProductsDao productsDao = new ProductsDaoImplements();
                    productsDao.saveProducts(model);
                }
            }
        });
        product10.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product11.setOpacity(1);
                    product11.requestFocus();
                    product = product10.getText();
                    ProductsModel model = new ProductsModel(0, recipeId, product);
                    ProductsDao productsDao = new ProductsDaoImplements();
                    productsDao.saveProducts(model);
                }
            }
        });
        product11.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product12.setOpacity(1);
                    product12.requestFocus();
                    product = product11.getText();
                    ProductsModel model = new ProductsModel(0, recipeId, product);
                    ProductsDao productsDao = new ProductsDaoImplements();
                    productsDao.saveProducts(model);
                }
            }
        });
        product12.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product13.setOpacity(1);
                    product13.requestFocus();
                    product = product12.getText();
                    ProductsModel model = new ProductsModel(0, recipeId, product);
                    ProductsDao productsDao = new ProductsDaoImplements();
                    productsDao.saveProducts(model);

                }
            }
        });
        product13.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product14.setOpacity(1);
                    product14.requestFocus();
                    product = product13.getText();
                    ProductsModel model = new ProductsModel(0, recipeId, product);
                    ProductsDao productsDao = new ProductsDaoImplements();
                    productsDao.saveProducts(model);
                }
            }
        });
        product14.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product15.setOpacity(1);
                    product15.requestFocus();
                    product = product14.getText();
                    ProductsModel model = new ProductsModel(0, recipeId, product);
                    ProductsDao productsDao = new ProductsDaoImplements();
                    productsDao.saveProducts(model);
                }
            }
        });
        product15.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product16.setOpacity(1);
                    product16.requestFocus();
                    product = product15.getText();
                    ProductsModel model = new ProductsModel(0, recipeId, product);
                    ProductsDao productsDao = new ProductsDaoImplements();
                    productsDao.saveProducts(model);
                }
            }
        });
        product16.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product17.setOpacity(1);
                    product17.requestFocus();
                    product = product16.getText();
                    ProductsModel model = new ProductsModel(0, recipeId, product);
                    ProductsDao productsDao = new ProductsDaoImplements();
                    productsDao.saveProducts(model);
                }
            }
        });
        product17.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product18.setOpacity(1);
                    product18.requestFocus();
                    product = product17.getText();
                    ProductsModel model = new ProductsModel(0, recipeId, product);
                    ProductsDao productsDao = new ProductsDaoImplements();
                    productsDao.saveProducts(model);
                }
            }
        });
        product18.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product19.setOpacity(1);
                    product19.requestFocus();
                    product = product18.getText();
                    ProductsModel model = new ProductsModel(0, recipeId, product);
                    ProductsDao productsDao = new ProductsDaoImplements();
                    productsDao.saveProducts(model);
                }
            }
        });
        product19.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    product20.setOpacity(1);
                    product20.requestFocus();
                    product = product19.getText();
                    ProductsModel model = new ProductsModel(0, recipeId, product);
                    ProductsDao productsDao = new ProductsDaoImplements();
                    productsDao.saveProducts(model);
                }
            }
        });
    }

}
