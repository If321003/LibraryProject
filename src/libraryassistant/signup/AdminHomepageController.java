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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class AdminHomepageController implements Initializable {

    @FXML
    private VBox maincontent;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
            Parent pane=FXMLLoader.load(getClass().getResource("addbookInfo.fxml"));
            maincontent.getChildren().setAll(pane);
            
        } catch (IOException ex) {
            Logger.getLogger(FirstpageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void addbooks(MouseEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("addbookInfo.fxml"));
        maincontent.getChildren().setAll(pane);
    }
    @FXML
    private void logoutAction(MouseEvent event) {
        try {

                    //add you loading or delays - ;-)
                    Node node = (Node) event.getSource();
                    Stage stage = (Stage) node.getScene().getWindow();
                    //stage.setMaximized(true);
                    stage.close();
                    Scene scene = new Scene(FXMLLoader.load(getClass().getResource("login.fxml")));
                    stage.setScene(scene);
                    stage.show();

                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
    }

    @FXML
    private void showAllbooks(MouseEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("showallbooks.fxml"));
        maincontent.getChildren().setAll(pane);
    }
    
    
}
