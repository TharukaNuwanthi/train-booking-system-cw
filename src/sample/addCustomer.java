package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static javafx.application.Application.launch;


public class addCustomer   {

    //private Button[] buttons = new Button[10];



    @FXML
    private Label lblName;


    @FXML
    private Label lblNIC;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtNIC;


   @FXML
    private FlowPane container;

    @FXML
    private List labels;

private static List<String> reservedSeats;

    public static void saveData(String[] data) {
        File fIle = new File("C:\\Users\\Tharuka\\Desktop\\data.txt");
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(fIle);
            for (int i=0;i<data.length;i++){
                fileWriter.write(data[i]+"-"+  "Available"+ "\n");
                //   fileWriter.write(String.valueOf(data));
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public  void reserveData(String[] data) {
        File fIle = new File("C:\\Users\\Tharuka\\Desktop\\data.txt");
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(fIle);
            for (int i=0;i<data.length;i++){
                fileWriter.write(data[i]+"-"+ (reservedSeats.get(i).contains(String.valueOf(i)) ? "Reserved" : "Available") + "\n");
                //   fileWriter.write(String.valueOf(data));
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }



    public void view(){
        String[] data = new String[42];
        for (int i=0;i<data.length;i++){
            data[i] = "Seat "+ (i+1);
        }
        saveData(data);
      reservedSeats = new ArrayList<>();
        labels = new ArrayList<>();

        for (int i=1 ; i <= 42; i++) {
            Button button = new Button("Seat:" + i);
            button.setId(Integer.toString(i));
            int finalI = i;
            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    reservedSeats.add(String.valueOf(finalI));
                }
            });
            container.getChildren().add(button);

        }
        //container.getChildren().addAll(labels);



    }
    public void getSeats(){
        System.out.println(reservedSeats.toString());
    }
    //public List<Label> getLabels(){
        //return Collections.unmodifiableList(labels);

    }










