/*
 * UCF COP3330 Fall 2021 Assignment 5 Solution
 * Copyright 2021 Keri Mullens
 */
package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class InventoryTrackerController {

    @FXML
    private TableView<?> inventory;

    @FXML
    private TextField fileLocation;

    @FXML
    private TextField serialNumberSearch;

    @FXML
    private TextField nameSearch;

    @FXML
    void addItemButtonPressed(ActionEvent event) {

    }

    @FXML
    void deleteAllItemsButtonPressed(ActionEvent event) {

    }

    @FXML
    void editItemButtonPressed(ActionEvent event) {

    }

    @FXML
    void editMonetaryValueButtonPressed(ActionEvent event) {

    }

    @FXML
    void editSerialNumberButtonPressed(ActionEvent event) {

    }

    @FXML
    void helpButtonPressed(ActionEvent event) throws IOException {
        Parent part = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Help Payne.fxml")));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void loadButtonPressed(ActionEvent event) {

    }

    @FXML
    void nameSearchButtonPressed(ActionEvent event) {

    }

    @FXML
    void removeItemButtonPressed(ActionEvent event) {

    }

    @FXML
    void saveButtonPressed(ActionEvent event) {

    }

    @FXML
    void serialSearchButtonPressed(ActionEvent event) {

    }

}