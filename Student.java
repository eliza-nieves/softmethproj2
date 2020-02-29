/**
 @author Eliza Nieves
 @author Raheel Ozair
 */

public abstract class Student implements Comparable {
  private String fname;
  private String lname;
  protected int credit;
  public Student(String fname, String lname, int credit) {
    this.fname = fname;
    this.lname = lname;
    this.credit = credit;
  }
  //constructor
  //must implement compareTo method because Student class implements the
  //Comparable Interface
  //return 0 if fname and lname of the two students are equal,
  //return -1 if this fname and lname is < obj’s, return 1 if this fname and
  //lname is > obj’s
  //Hint: use the .equals and compareToIgnoreCase methods of the String class
  //to compare fname
  //and lname; names are not case-sensitive
  public int compareTo(Object obj){
    if(!(obj instanceof Student)){
      System.out.println("This is not a student.");
      return -2;
    }
    Student compStudent = (Student) obj;

    String s1 = this.fname + " " + this.lname;
    String s2 = compStudent.fname + " " + compStudent.lname;
    int longerName = (s1.compareToIgnoreCase(s2)); //this will be
      //negative if obj is longer

    if(longerName < 0){
      return -1;
    }else if(longerName > 0){
      return 1;
    }else{
      return 0;
    }

  }
  //return a string with fname, lname and credit hours; subclasses will
  //be using this method.
  public String toString() {
    String retStr = this.fname + " " + this.lname + ". Credits: " + this.credit;
    return retStr;
  }
  //compute the tuition due; concrete implementation is required in the subclasses.
  public abstract int tuitionDue();

}
