/**
@author Eliza Nieves
@author Raheel Ozair
*/

public class International extends Student{
  private boolean exchange;

  public International(String fname, String lname, int credit, boolean exchange){
    super(fname,lname,credit);
    this.exchange = exchange;
  }
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
