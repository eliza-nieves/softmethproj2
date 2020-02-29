import java.util.Scanner;
/**
 @author Eliza Nieves
 */
public class TuitionManager
{
   Scanner stdin = new Scanner(System.in);
   StudentList list = new StudentList();

   public void run(){
     boolean done = false;
     while(done == false){
         String cmd = stdin.next();
         switch (cmd) {
            case "I":
               add(cmd);
               break;
            case "O":
               add(cmd);
               break;
            case "N":
               add(cmd);
               break;
            case "R":
               remove();
               break;
            case "P":
               print();
               break;
            case "Q":
               done = true;
               break;
            default:
               System.out.println("Invalid input. Please try again.");
               break;
        }
     }
   }

   private void add(String in){
      String fname = stdin.next();
      String lname = stdin.next();
      int credits = stdin.nextInt();
      Student temp;
      switch (in) {
         case "I":
            int funding = stdin.nextInt();
            temp = new Instate(fname, lname, credits, funding);
            break;
         case "O":
            boolean tristate = stdin.nextBoolean();
            temp = new Outstate(fname, lname, credits, tristate);
            break;
         case "N":
            boolean exchange = stdin.nextBoolean();
            temp = new International(fname, lname, credits, exchange);
            break;
         default:
            break;
      }//instantiates the student

      boolean preexist = list.contains(temp);
      if(preexist){
         System.out.println("Student is already present in list.");
         return;
      }
      list.add(temp);
      return;
   }

   private void remove(){
      String fname = stdin.next();
      String lname = stdin.next();
      Student temp = new Student(fname, lname, 0);
      list.remove(temp);
      return;
   }//done

   private void print(){
      list.print();
   }

}