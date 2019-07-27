package mvc;

import javafx.event.*;
import mvc.View;


public class Controller {


    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }


    public void control(){
        view.getButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) { traitClicMethod(); }
        });
    }

    private void traitClicMethod(){
        int valeur = model.getValue();
        valeur++;
        model.setValue(valeur);
        view.setText(Integer.toString(model.getValue()));}
}