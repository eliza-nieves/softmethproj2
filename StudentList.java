/**
 @author Eliza Nieves
 @author Raheel Ozair
 */
public class StudentList
{
   private Student[] list;
   private int length;
   private final int GROW_SIZE = 4; //grown and init size

   public StudentList(){
      length = 0;
      list = new Student[GROW_SIZE];
   }

   private Student[] grow(Student[] og){
      Student[] temp = new Student[length + GROW_SIZE];
      System.arraycopy(og,0,temp,0,og.length);

      return temp;
   }

   public void add(Student s){
      this.length++;

      if(length >= list.length){
         list = grow(list);
      }
      list[length - 1] = s;
      
      return;
   }

   public boolean remove(Student s){
      int del = -1;
      for(int i = 0; i < length; i++){
         if(list[i].compareTo(s) == 0){
            del = i;
         }
      }
      if(del < 0){
         return false;
      }
      list[del] = list[length - 1];
      this.length--;
      return true;
   }

   public void print(){
      for(int i = 0; i < length; i++){
         System.out.println(list[i].toString() + " tuition due: $" + list[i].tuitionDue() + "\n");
      }
   }

   public boolean contains(Student s){
      boolean contains = false;
      for(int i = 0; i < length; i++){

         if(list[i].compareTo(s) == 0){

            contains = true;
         }
      }
      return contains;
   }
}
