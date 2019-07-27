package sample;


import javafx.application.Application;
import javafx.stage.Stage;

import mvc2.ControllerSpinner;
import mvc2.Model;
import mvc2.View;
import mvc2.ViewSpinner;
import mvc2.Controller;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{



        // 1 ier stage (Spinner)
        ViewSpinner viewSpinner = new ViewSpinner(primaryStage) ;
        Model model = new Model(0);
        ControllerSpinner controllerSpinner =new ControllerSpinner(model,viewSpinner);
        controllerSpinner.control();


        //2 ieme stage (textField)
        Stage secondaryStage = new Stage();
        View view = new View(secondaryStage);
        Controller controller1=new Controller(model,view);
        controller1.control();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
