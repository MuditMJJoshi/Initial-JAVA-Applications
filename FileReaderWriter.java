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

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FileReaderWriter {
  JSONObject jsonQ = new JSONObject();
  JSONArray questionArray = new JSONArray();
  Hashtable hashTable = new Hashtable();
  ArrayList<String> questionList = new ArrayList<String>();


  ArrayList<String> quizTypeList = new ArrayList<String>();

  public FileReaderWriter() {}

  public void writeQuestion(String question, String quizType, String imageURL, Answer[] answers) {

    // add em to jsonobject
    jsonQ.put("meta-data", "unused");
    jsonQ.put("questionText", question);
    jsonQ.put("topic", quizType);
    jsonQ.put("image", imageURL);

    JSONArray ansArray = new JSONArray();
    // create new json object for each answer object(all answers)
    // add isCorrect value and Choice value
    for (int i = 0; i < answers.length; i++) {
      JSONObject choice = new JSONObject();
     // System.out.println(answers[i] + "HEREEEE");
      choice.put("isCorrect", answers[i].isCorrect);
      choice.put("choice", answers[i].answer);
      ansArray.add(choice);
    }
    jsonQ.put("choiceArray", ansArray);
    questionArray.add(jsonQ);
    // Writing to a file, orders elements from smallest to largest
    // image which is 'null' goes first because its the smallest even tho it shouldn't.

    try (FileWriter file = new FileWriter("Output.json")) {
        file.write(jsonQ.toJSONString());
        QuestionAdded();
        file.flush();
      } catch (IOException e) {
        e.printStackTrace();
      }
  }





////////////////////////////////////////////////////////////////////////////////////////////////

  // Edit fr json writing

 public int QuestionAdded(){

 try (FileWriter file2 = new FileWriter("Output2.json")) {

     Object obj = new JSONParser().parse(new FileReader("Output.json"));
      file2.write(obj.toString());
      System.out.print("In");
    while((jsonQ.equals(obj))){
     System.out.print("In");
     obj=jsonQ;
    file2.write(obj.toString());
    }
      file2.flush();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ParseException e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
 }
 return 1;
  }
////////////////////////////////////////////////////////////////////////////////////////////////
  public void readQuestion(String jsonFilePath, String quizType)
      throws FileNotFoundException, IOException, ParseException {
    String question;
    String topic;
    String imageURL;
    Object obj = new JSONParser().parse(new FileReader(jsonFilePath));
    // typecasting to JSONObject
    JSONObject jsonObj = (JSONObject) obj;
    JSONArray jsonArr = (JSONArray) jsonObj.get("questionArray");
    for (int j = 0; j < jsonArr.size(); j++) {
      JSONObject smallerJSONObj = (JSONObject) jsonArr.get(j);
      question = (String) smallerJSONObj.get("questionText");;
      topic = (String) smallerJSONObj.get("topic");

      // TODO:::::::::::::::::::::::::::::::
      if (!quizTypeList.contains(topic)) {
        quizTypeList.add(topic);
      }

      imageURL = (String) smallerJSONObj.get("image");
      JSONArray answers = (JSONArray) smallerJSONObj.get("choiceArray");
      Answer[] answersArray = new Answer[5];
      for (int i = 0; i < 5; i++) {
        boolean isCorrect = false;
        JSONObject answer1 = (JSONObject) answers.get(i);
        if (answer1.get("isCorrect").equals("T")) {
          isCorrect = true;
        }
        String choice = (String) answer1.get("choice");
        Answer currAnswer = new Answer(choice, isCorrect);
        answersArray[i] = currAnswer;
      }
//      if (quizType.equals(topic)) {
        int hash = question.hashCode();
        this.hashTable.put(hash, new QuestionAnswer(question, answersArray, imageURL, topic));
        questionList.add(question);
//      }
      // ADD TO DATA STRUCTURE
    }

  }

  public ArrayList<String> getQuestionList() {
    return questionList;
  }

  public Hashtable getHashTable() {
    return hashTable;
  }

  public ArrayList<String> getTopicList() {
	  Collections.sort(quizTypeList);
    return quizTypeList;
  }


  public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {



  }

  public void writeQuestion(Map<String, String> valueList) {
    // TODO Auto-generated method stub

  }
}