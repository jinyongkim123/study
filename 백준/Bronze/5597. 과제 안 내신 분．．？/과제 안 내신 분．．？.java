import java.util.*;
public class Main {
   public static void main(String[] args){
       Scanner stdIn = new Scanner(System.in);
       int[] stu = new int[31];
       
       for(int i=1; i<=28; i++){
           int put = stdIn.nextInt();
           stu[put] = 1;
           }
       for(int i=1; i<stu.length; i++){
           if(stu[i]!=1)
               System.out.println(i);
       }

      

   }
}