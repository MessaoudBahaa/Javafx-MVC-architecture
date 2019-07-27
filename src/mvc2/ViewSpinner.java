package mvc2;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;
public class ViewSpinner implements ChangedValueListener {
    private Spinner spinner;
    private Button bouton;
    private Scene scene;
    public ViewSpinner(Stage primaryStage){
        Group root = new Group();
        primaryStage.setTitle("Illustration propagation evenements ");
        primaryStage.setMinWidth(200);
        primaryStage.setMinHeight(100);
        scene=new Scene(root);
//ajouter un spinner
        spinner = new Spinner(0,20,1);
        spinner.setLayoutX(20);
        spinner.setLayoutY(20);
        spinner.setEditable(true);
//ajouter un bouton
        bouton = new Button("Valider");
        bouton.setLayoutX(180);
        bouton.setLayoutY(20);
        root.getChildren().add(bouton);
        root.getChildren().add(spinner);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public Spinner getSpinner(){
        return spinner;
    }
    public Button getButton(){
        return bouton;
    }



    public void volumeChanged(ChangedValueEvent evt){
        spinner.setValueFactory(new
                SpinnerValueFactory.IntegerSpinnerValueFactory(0,1000,evt.getNewValue()));
    }
}