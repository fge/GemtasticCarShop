package Controller;

import Controller.navigators.ApplicationNavigator;
import application.ApplicationMain;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Gemtastic
 */
public class LoginController implements Initializable {
    
    @FXML
    private Button loginbtn;
    
    @FXML
    private void loginAttempt() throws Exception{
        
        // TO DO add verification calls/hashing
        
        Stage stage = new Stage();
        
        FXMLLoader loader = new FXMLLoader();
        
        loader.setController(new ApplicationController());
        loader.setLocation(ApplicationMain.class.getResource("/fxml/Application.fxml"));
        
        AnchorPane root = loader.load();
        
        ApplicationController applicationController = loader.getController();
        ApplicationNavigator.setController(applicationController);
        ApplicationNavigator.loadTabContent(ApplicationNavigator.listCustomers, applicationController.customerContent);
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        Stage oldStage = (Stage)loginbtn.getScene().getWindow();
        oldStage.close();
        
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
}
