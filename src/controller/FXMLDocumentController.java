/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Point3D;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.stage.Stage;
import javafx.util.Duration;


public class FXMLDocumentController implements Initializable {

    private Stage stage;

    @FXML
    private Slider slAngle;

    @FXML
    private Slider slAngle1;

    private Cylinder c;
    private Timeline t;
    private int contadorBoxTraslacion;
    private int contadorBoxRot1;
    private int contadorBoxRot2;
    private int signoBoxTraslacion;
    private int signoBoxRot1;
    private boolean resetBoxRot1;
    private int signoBoxRot2;
    private boolean resetBoxRot2;


    @FXML
    private Pane panelGrafico;

    /** 
    * Inicializa los elementos del Controller. 
    * @param url la ubicacion utilizada para resolver rutas de acceso relativas al objeto raíz o null si no se conoce la ubicacion.
    * @param rb los recursos utilizados para localizar el objeto raíz o null si el objeto raíz no fue localizado. 
    */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TO DO
        contadorBoxTraslacion = -200;
        contadorBoxRot1 = 0;
        contadorBoxRot2 = 0;
        signoBoxTraslacion = 0;
        signoBoxRot1 = 0;
        signoBoxRot2 = 0;
        resetBoxRot1 = false;
        resetBoxRot2 = false;
        
        t = new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
             
            }                       
        }));
        t.setCycleCount(Animation.INDEFINITE);
        
        t.play();
        
    }

    /** 
    * Modifica el valor del stage. 
    * @param stage el valor por el que se desea cambiar el stage. 
    */
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    /** 
    * Obtiene el panel gráfico. 
    * @return valor del panel gráfico. 
    */
    public Pane getPanelGrafico() {
         
        return panelGrafico;
    }

    
    

    /** 
    * Rota el cubo bb3 al activarse. 
    */
    @FXML
    public void handleDraggedSliderAngle() {
//        resetBoxRot1 = false;
//        bb3.setRotate(slAngle.getValue());        
    }
    
    /** 
    * Activa el proceso de reseteo del cubo bb3. 
    */
    @FXML
    public void handleMouseRealeasedSlider() throws InterruptedException
    {
        resetBoxRot1 = true;
    }

    /** 
    * Rota el cubo bb4 al activarse. 
    */
    @FXML
    public void handleDraggedSliderAngle1() {
        resetBoxRot2 = false;
              
    }
    
    /** 
    * Activa el proceso de reseteo del cubo bb4. 
    */
    @FXML
    public void handleMouseRealeasedSlider1()
    {
        resetBoxRot2 = true;
    }
   
    /** 
    * Detiene el timeline y termina la aplicación. 
    */
    @FXML
    public void handleButtonTerminar()
    {
        t.stop();
        Platform.exit();
    }
            
    public void setObjetoGeometrico5(Cylinder c) {
        c.setTranslateX(200);
        c.setTranslateY(100);
        c.setTranslateZ(-250);
        this.c = c;
        c.setRotationAxis(new Point3D(-1, -1, 1));
    }
    
      @FXML
    private void icilindro(ActionEvent event) {
      c.setVisible(true);
    }
     @FXML
    private void icubo(ActionEvent event) {
      c.setVisible(true);
    }
     @FXML
    private void iesfera(ActionEvent event) {
      c.setVisible(true);
    }
}
