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
 * Class QuizType stores the quiz type for a given question after being added
 * to the quiz.
 *
 */
public class QuizType {
  String quizType;

  /**
   * Default constructor for String quizType
   * @quizType
   */
  public QuizType() {
    quizType = null;
  }

  /**
   * Constructor for quizType
   * @param quizType
   */
  public void setQuizType(String quizType) {
    this.quizType = quizType;
  }

  /**
   * Method for returning the quizType
   * @return
   */
  public String getQuizType() {
    return quizType;
  }

}
