import java.util.*;
public class Main {
   public static void main(String[] args){
       Scanner stdIn = new Scanner(System.in);
       int[] ary = new int[100];
       int solve = 0;
       int count = 0;

       int total = stdIn.nextInt();


       for(int i = 0; i<total; i++){
           ary[i] = stdIn.nextInt();
       }

       solve = stdIn.nextInt();

       for(int i = 0; i<total; i++){
           if(ary[i] == solve){
               count++;
           }
       }

       System.out.print(count);
   }
}