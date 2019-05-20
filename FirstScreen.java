// Title: Quiz Generator
// Files: Answer.java
// Course: CS400, SP19, Lec001, Lec004
// Due Date: 05/03/2019
//
// Authors: Jenna Eizadi, Mudit Joshi, Shubham Mehta, Jose Pascual,
// Satchi Mehta
// Email: eizadi@wisc.edu, mjoshi6@wisc.edu, smehta23@wisc.edu,
// jpascual@wisc.edu, skmehta3@wisc.edu
///////////////////////////////////////////////////////////////////////////////

package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FirstScreen extends Application implements EventHandler<ActionEvent> {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    // TODO Auto-generated method stub

    primaryStage.setTitle("Introduction Screen"); // screen title
    BorderPane root = new BorderPane();
    Scene scene1 = new Scene(root, 1000, 800); // sets scene for elements

    VBox box = new VBox();

    ComboBox<String> quizTypes = new ComboBox<String>(); // Quiz Types choice listing
    quizTypes.getItems().addAll("Data Structures Quiz", "Syntax Quiz", "Recursion Quiz",
        "Fundamentals Quiz");
    quizTypes.setPromptText("Select Quiz Type:"); // user interaction
    TextField numberOfQuestions = new TextField("Enter the number of Questions you want to answer");
    numberOfQuestions.setMaxWidth(500);

    Button startQuiz = new Button("Start Quiz");
    startQuiz.minWidth(100);

    Button newQuiz = new Button("Add a new quiz");
    newQuiz.minWidth(100);

    Button addQuestion = new Button("Add Questions to an existing quiz");
    addQuestion.minWidth(100);

    box.setSpacing(10);
    box.getChildren().addAll(numberOfQuestions, quizTypes, startQuiz, newQuiz, addQuestion);
    Insets padding = new Insets(250);

    root.setPadding(padding);
    root.setCenter(box);

    primaryStage.setScene(scene1);
    primaryStage.show();
  }



  @Override
  public void handle(ActionEvent event) {
    // TODO Auto-generated method stub
    Main.main(null);
  }
}
