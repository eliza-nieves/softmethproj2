/**
 * This class is used in order to hold information specific to instate students,
 * namely student funding.
 * 
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

  public static void main(String[] args){

    String f1 = "t";
    String l1 = "1";
    int c1 = 16;
    int fun1 = 1000;
    Instate s1 = new Instate(f1,l1,c1,fun1);

    String f1a = "t";
    String l1a = "1a";
    int c1a = 15;
    int fun1a = 1000;
    Instate s1a = new Instate(f1a,l1a,c1a,fun1a);

    String f2 = "t";
    String l2 = "2";
    int c2 = 16;
    int fun2 = 0;
    Instate s2 = new Instate(f2,l2,c2,fun2);

    String f2a = "t";
    String l2a = "2a";
    int c2a = 15;
    int fun2a = 0;
    Instate s2a = new Instate(f2a,l2a,c2a,fun2a);

    String f3 = "t";
    String l3 = "3";
    int c3 = 13;
    int fun3 = 1000;
    Instate s3 = new Instate(f3,l3,c3,fun3);

    String f4 = "t";
    String l4 = "4";
    int c4 = 13;
    int fun4 = 0;
    Instate s4 = new Instate(f4,l4,c4,fun4);

    String f5 = "t";
    String l5 = "5";
    int c5 = 12;
    int fun5 = 1000;
    Instate s5 = new Instate(f5,l5,c5,fun5);

    String f6 = "t";
    String l6 = "6";
    int c6 = 12;
    int fun6 = 0;
    Instate s6 = new Instate(f6,l6,c6,fun6);

    String f7 = "t";
    String l7 = "7";
    int c7 = 11;
    int fun7 = 1000;
    Instate s7 = new Instate(f7,l7,c7,fun7);

    String f8 = "t";
    String l8 = "8";
    int c8 = 11;
    int fun8 = 0;
    Instate s8 = new Instate(f8,l8,c8,fun8);
    Student[] x = new Student[10];
    x[0] = s1;
    x[1] = s1a;
    x[2] = s2;
    x[3] = s2a;
    x[4] = s3;
    x[5] = s4;
    x[6] = s5;
    x[7] = s6;
    x[8] = s7;
    x[9] = s8;

    for(int i = 0; i < x.length; i ++){
      System.out.println("Student " + (i+1) + ": " + x[i].toString());
      System.out.println(x[i].tuitionDue());
    }
  }

}
