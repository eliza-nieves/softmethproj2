/**
@author Eliza Nieves
@author Raheel Ozair
*/

public class Outstate extends Student{

  boolean tristate;


  public Outstate(String fname, String lname, int credit, boolean tristate){
    super(fname,lname,credit);
    this.tristate = tristate;
  }
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

  public String toString(){
    String res = super.toString();
    if(this.tristate){
      res += " In the Tristate Area.";
    }else{
      res += "Not in the Tristate Area.";
    }
    return res;
  }
}
