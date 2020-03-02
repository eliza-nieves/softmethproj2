/**
 * This class is used in order to hold information specific to outstate students,
 * namely whether they are from the tristate area.
 * @author Raheel Ozair
 * @author Eliza Nieves
*/

public class Outstate extends Student{

  boolean tristate;

  /**
   * Constructor for outstate students.
   * @param fname First name of the student.
   * @param lname Last name of the student.
   * @param credit Number of credits being taken.
   * @param tristate Boolean as to whether the student is from the
   * tristate area, true if they are.
   */
  public Outstate(String fname, String lname, int credit, boolean tristate){
    super(fname,lname,credit);
    this.tristate = tristate;
  }

  /**
   * Returns the amount of tuition due for an outstate student.
   * @return the amount of tuition due for a student.
   */
  public int tuitionDue(){
    int tuition;
    int perCredit = 756;
    int realCr = this.credit; //to limit credit cost
    boolean isTri = this.tristate;
    int triDisc = 0;
    int uniFee;

    if(realCr > 15){
      realCr = 15; //real number of credits to be paid for
    }
    if(realCr < 12){
      uniFee = 846; //part-time fee
    }else{
      uniFee = 1441;//full-time fee
    }

    if(isTri){
      triDisc = this.credit * 200;//discount for being in the tristate
    }
    tuition = (realCr * perCredit) + uniFee - triDisc;
    return tuition;

  }

  /**
   * Gives the string representation of the student, appending onto the
   * super representation with the tristate area status of the student.
   * @return the string representation of the student.
   */
  public String toString(){
    String res = super.toString();
    if(this.tristate){
      res += ". Tristate Area.";
    }else{
      res += ". Not Tristate Area.";
    }
    return res;
  }
}
