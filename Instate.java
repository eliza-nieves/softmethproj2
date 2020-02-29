/**
@author Eliza Nieves
@author Raheel Ozair
*/

public class Instate extends Student{

  private int funds;


  public Instate(String fname, String lname, int credit, int funds){
    super(fname,lname,credit);
    this.funds = funds;
  }
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

  public String toString(){
    String res = super.toString();
    res += ". Funds: " + this.funds + ".";
    return res;
  }

}
