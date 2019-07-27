package mvc2;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class View implements ChangedValueListener {
    private TextField textField;
    private Button bouton;
    private Scene scene;
    public View(Stage primaryStage){
        Group root = new Group();
        primaryStage.setTitle("Illustration propagation evenements ");
        primaryStage.setMinWidth(200);
        primaryStage.setMinHeight(100);
        scene=new Scene(root);
        //ajouter un textfield
        textField = new TextField("1");
        textField.setLayoutX(20);
        textField.setLayoutY(20);
        textField.setEditable(true);
        //ajouter un bouton
        bouton = new Button("Valider");
        bouton.setLayoutX(180);
        bouton.setLayoutY(20);
        root.getChildren().add(bouton);
        root.getChildren().add(textField);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public TextField getTextField(){
        return textField;
    }
    public Button getButton(){
        return bouton;
    }



    public void volumeChanged(ChangedValueEvent evt){
        textField.setText(evt.getNewValue()+"");
    }

}