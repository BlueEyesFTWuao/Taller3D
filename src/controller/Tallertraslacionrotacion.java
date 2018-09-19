/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.AmbientLight;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
import utilidades.ObjectFactory;
import utilidades.PanelFactory;

public class Tallertraslacionrotacion extends Application {

   
    Cylinder c;
  
    
    @Override
    public void start(Stage stage) throws Exception {
        //creación del cubo
        double lado = 100;
        c=new Cylinder(200, 200);
        //cu=new Cube (200,200);
        c.setVisible(false);
        //material
        Image imageDiffuseAjedrez = new Image(getClass().getResource("/Texturas/madera.jpg").toExternalForm());
       
        
        PhongMaterial material5 = new PhongMaterial();
        material5.setBumpMap(imageDiffuseAjedrez);
        material5.setDiffuseMap(imageDiffuseAjedrez);
           
        c.setMaterial(material5);
        
        Node controlPanel = PanelFactory.createControlPanel(stage, c);
        
        Node scene3D5 = ObjectFactory.createScene3D(c);

        
        //luces (cree un AmbientLight)
        AmbientLight luz = new AmbientLight();
    //Group
        Group root = new Group();
        //agregue al root la scene3D como un hijo 
        //agregue al root el controlPanel como un hijo
        //agregue al root la luz como un hijo
        root.getChildren().add(controlPanel);
        root.getChildren().add(scene3D5);
        root.getChildren().add(luz);
       
        
        
        Scene scene = new Scene(root);

        //Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.getScene().setCamera(new PerspectiveCamera());
        stage.setResizable(false);
        stage.setTitle("Rotacion General - CG");
        stage.show();
       
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
      
    }

}
