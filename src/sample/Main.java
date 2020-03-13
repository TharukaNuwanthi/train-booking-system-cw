package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// mee oyt

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{



        System.out.println("\t***Train Booking System*** ");
        System.out.println();

        System.out.println("Description:");
        System.out.println("A: Add a customer to a seat. \nV: View all seats. \nE: Display Empty seats. \nD: Delete customer from seat." +
                "\nF: Find the seat for a given customers name.\nQ: Quit.");

        Scanner scanner = new Scanner(System.in);
        //String input = scanner.next(); //getting user input.




            System.out.print("\nEnter the letter which is related your requirement: ");
            //Scanner scanner = new Scanner(System.in);
            String input = scanner.next(); //getting user input.

            switch (input) {
                case "A":
                    addCustomer();
                    break;

                case "V":
                    view();
                    break;

                case "E":
                    emptyMethod();
                    break;

                case "D":
                    deleteMethod();
                    break;

                case "F":
                    findMethod();
                    break;

                case "Q":


                    break;

            }
        }



    public static void main(String[] args) {
        launch(args);




    }

    private  void addCustomer() throws Exception {

        //Button[] buttons = new Button[10];



        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("addCustomer.fxml"));
        stage.setTitle("View Seats");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();


        

    }



    private static void view() {
    }

    private static void emptyMethod() {
    }


    private static void deleteMethod() {
    }


    private static void findMethod() {
    }


}

