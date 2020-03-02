/**
 * This class is used in order to hold information specific to international students,
 * namely whether they are on exchange.
 * @author Raheel Ozair
 * @author Eliza Nieves
*/

public class International extends Student{
  private boolean exchange;

  /**
   * Constructor for international students.
   * @param fname First name of the student.
   * @param lname Last name of the student.
   * @param credit Number of credits being taken.
   * @param exchange Boolean as to whether the student is on exchange, true if they are.
   */
  public International(String fname, String lname, int credit, boolean exchange){
    super(fname,lname,credit);
    this.exchange = exchange;
  }
  /**
   * Returns the amount of tuition due for an int. student.
   * @return the amount of tuition due for a student.
   */
  public int tuitionDue(){
    int tuition; //resulting tuition due
    int realCr = this.credit; //copy this object's credit number
    int perCredit = 945; //per credit price for instate
    boolean exch = this.exchange;
    int uniFee; //part-time or full-time
    int intStudentFee = 350; //international student fee
    if(realCr > 15){
      realCr = 15;
    }
    if(realCr < 12){
      uniFee = 846;
    }else{
      uniFee = 1441;
    }
    if(exch){
      tuition = uniFee + intStudentFee;
    }else{
      tuition = (realCr * perCredit) + uniFee + intStudentFee;
    }
    return tuition;
  }

  /**
   * Gives the string representation of the student, appending onto the
   * super representation with the tristate area status of the student.
   * @return the string representation of the student.
   */
  public String toString(){
    String res = super.toString();

    if(this.exchange){
      res += ". Exchange student.";
    }else{
      res += ". Not exchange student.";
    }
    return res;
  }
}
