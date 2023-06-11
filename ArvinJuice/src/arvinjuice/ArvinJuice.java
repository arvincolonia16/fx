/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvinjuice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author kentj
 */
public class ArvinJuice extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        try{
        Parent root=FXMLLoader.load(getClass().getResource("ArvinJuicefx.fxml"));
        Scene scene=new Scene(root);
        scene.getStylesheets().add(getClass().getResource("arvinjuicefx.css").toExternalForm());
        primaryStage.setTitle("Arvin Juice");
        primaryStage.setScene(new Scene(root, 1315, 855)); 
        primaryStage.show();
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
    }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
