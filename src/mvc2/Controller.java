package mvc2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class Controller {


    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        addListenersToModel();
    }

    private void addListenersToModel() {
        model.addVolumeListener(view);
    }

    public void control(){
        view.getButton().setOnAction(new EventHandler<ActionEvent>() {
                                         @Override
                                         public void handle(ActionEvent e)
                                         {traitClicMethod(); }
                                     }
        );}

    private void traitClicMethod(){
        int valeur= Integer.parseInt(view.getTextField().getText());
        model.setValue(valeur);
    }


}