/**
 @author Eliza Nieves
 */
public class StudentList
{
   private Student[] list;
   private int length;

   public StudentList(){
      length = 0;
      list = new Student[4];
   }

   private Student[] grow(Student[] og){
      Student[] temp = new Student[length + 4];
      for(int i = 0; i < length; i++){
         temp[i] = og[i];
      }
      this.length += 4;
      return temp;
   }

   public void add(Student s){
      if(length >= list.length){
         list = grow(list);
      }
      list[length] = s;
      this.length++;
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
