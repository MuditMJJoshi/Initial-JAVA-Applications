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

/**
 * The Answer class stores information about an answer includes whether it is
 * correct as a boolean and the answer in a string.
 *
 */
package application;

public class Answer {

  boolean isCorrect;
  String answer;

  /**
   * Default constructor for the String answer
   * @param answer
   */
  public Answer() {
    answer = null;
  }

  /**
   * Constructor for the String answer and boolean isCorrect
   * @param answer
   * @param isCorrect
   */
  public Answer(String answer, boolean isCorrect) {
    this.answer = answer;
    this.isCorrect = isCorrect;
  }

}
