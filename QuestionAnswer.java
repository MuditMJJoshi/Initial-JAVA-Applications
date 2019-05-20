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

/**
 * Class that creates either a 4 or 5 answer question and stores the data
 *
 * @author 
 */
public class QuestionAnswer {
  String question;
  Answer answer1;
  Answer answer2;
  Answer answer3;
  Answer answer4;
  String imageURL;
  String topic;

  /**
   * Constructor for a 4 answer question
   *
   * @param question
   * @param correctAnswer
   * @param incorrectAnswer1
   * @param incorrectAnswer2
   * @param incorrectAnswer3
   */
  public QuestionAnswer(String question, Answer[] answers, String imageURL, String topic) {
    this.question = question;
    this.answer1 = answers[0];
    this.answer2 = answers[1];
    this.answer3 = answers[2];
    this.answer4 = answers[3];
    this.imageURL = imageURL;
    this.topic = topic;
  }

}

