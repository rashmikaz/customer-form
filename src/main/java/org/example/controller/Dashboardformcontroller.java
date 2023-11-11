package org.example.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import org.example.dbConnection.DBConnection;
import org.example.dto.Dashboarddto;
import org.example.model.Dashboardmodel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dashboardformcontroller {

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtId;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtSalary;

    private Dashboardmodel cusModel = new Dashboardmodel();

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {

        String id=txtAddress.getText();
        String name=txtId.getText();
        String address=txtName.getText();
        String salary=txtSalary.getText();

        var dto = new Dashboarddto(id, name, address, salary);


        try {
            boolean isSaved = cusModel.saveCustomer(dto);

            if (isSaved) {
                new Alert(Alert.AlertType.CONFIRMATION, "customer saved!").show();
                clearFields();
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }
    }

    private void clearFields() {
    }


    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }
}
