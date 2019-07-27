package mvc2;
import javafx.event.*;


public class ControllerSpinner {
    private Model model;
    private ViewSpinner view;

    public ControllerSpinner(Model model, ViewSpinner view){
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
        int valeur= (int) view.getSpinner().getValue();
        model.setValue(valeur);
    }}