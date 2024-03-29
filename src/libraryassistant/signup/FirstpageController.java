/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryassistant.signup;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 *  * @author Gabriel
 */
public class FirstpageController implements Initializable {

    @FXML
    private VBox mainContent;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
            Parent pane=FXMLLoader.load(getClass().getResource("login.fxml"));
            mainContent.getChildren().setAll(pane);
            
        } catch (IOException ex) {
            Logger.getLogger(FirstpageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void loginAction(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("login.fxml"));
        mainContent.getChildren().setAll(pane);
    }

    @FXML
    private void signupAction(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("signup.fxml"));
        mainContent.getChildren().setAll(pane);
    }
    
}
