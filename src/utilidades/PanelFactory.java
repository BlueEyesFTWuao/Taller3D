package utilidades;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Slider;
import javafx.scene.shape.Box;
import javafx.stage.Stage;
import controller.FXMLDocumentController;
import controller.Tallertraslacionrotacion;
import javafx.scene.shape.Cylinder;
//import org.compgraf.transform.Aplication;
//import org.compgraf.transform.FXMLController;

/**
 *
 * @author 
 */
public class PanelFactory {

    /**
     * Crea el panel del control de la aplicación que está en un archivo tipo
     * FXML.
     *
     * @param stage
     * @param box
     * @param box1
     * @return
     * @throws Exception
     */
    //<editor-fold defaultstate="collapsed" desc="Metodo :: Node createControlPanel(Stage, ObjetoGeometrico)">
    public static Node createControlPanel(Stage stage, Cylinder c) throws Exception {
        FXMLLoader myLoader = new FXMLLoader(Tallertraslacionrotacion.class.getResource("/vista/FXMLDocument.fxml"));
        Parent controles = myLoader.load();
        setUpController((FXMLDocumentController) myLoader.getController(), stage,  c);

        return controles;
    }
    //</editor-fold>

    /**
     * Configuración del panel de control de la aplicacion.
     *
     * @param controller
     * @param stage
     * @param box
     */
    //<editor-fold defaultstate="collapsed" desc="Metodo :: void setUpController(FXMLController, Stage, ObjetoGeometrico)">
    private static void setUpController(FXMLDocumentController controller, Stage stage, Cylinder c) {

        controller.setObjetoGeometrico5(c);
        
    }
    //</editor-fold>

}
