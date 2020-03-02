/**
 * This class is used in order to hold information specific to instate students,
 * namely student funding.
 * @author Raheel Ozair
 * @author Eliza Nieves
*/

public class Instate extends Student{

  private int funds;

  /**
   * Constructor for instate students.
   * @param fname First name of the student.
   * @param lname Last name of the student.
   * @param credit Number of credits being taken.
   * @param funds Amount of funding received.
   */
  public Instate(String fname, String lname, int credit, int funds){
    super(fname,lname,credit);
    this.funds = funds;
  }

  /**
   * Returns the amount of tuition due for an instate student.
   * @return the amount of tuition due for a student.
   */
  public int tuitionDue(){
    int tuition; //resulting tuition due
    int realCr = this.credit; //copy this object's credit number
    int perCredit = 433; //per credit price for instate
    int extraFunds = this.funds; //copy this object's funds

    if(realCr > 15){
      realCr = 15;
    }
    int uniFee; //part-time or full-time
    if(realCr < 12){
      uniFee = 846;
    }else{
      uniFee = 1441;
    }
    if(realCr < 12){
      tuition = (realCr * perCredit) + uniFee;
    }else{
      tuition = (realCr * perCredit) + uniFee - extraFunds;
    }

    return tuition;
  }

  /**
   * Gives the string representation of the student, appending onto the
   * super representation with the funds of the student.
   * @return the string representation of the student.
   */
  public String toString(){
    String res = super.toString();
    res += ". Funds: " + this.funds + ".";
    return res;
  }

}
