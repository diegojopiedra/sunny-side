/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunnysidebill;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author diego
 */
public class LoginController implements Initializable {
    
    @FXML
    private TextField tf_user;

    @FXML
    private PasswordField tf_pass;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void login() {
        
        System.out.println("Login user " + tf_user.getText() + " | pass: " + tf_pass.getText());
    }
}
