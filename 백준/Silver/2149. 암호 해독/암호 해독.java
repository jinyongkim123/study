import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        String key = stdIn.next();// 키 입력
        String stc = stdIn.next();// 암호문 입력
        String[] skey = key.split(""); //키 끊어서 한글자씩 삽입
        Arrays.sort(skey);  //알파벳 순 정렬
        String[] sstc = stc.split(""); //암호문 끊어서 한 글자씩 삽입

        int a = skey.length; // 암호문들을 자르기 위한 배열길이 측정
        int b = sstc.length/skey.length + 1;

        String[][] res = new String[a][b];//평문을 만들 이중 배열 선언
        for(int i=0; i<a; i++) {   //이중배열의 첫 열에 알파벳순으로 나열한 키 삽입
            res[i][0] = skey[i];
        }

        int pls = 0;
        for(int i=0; i<a; i++){        //알파벳순으로 정렬한 키에 암호문들 끊어서 삽입
            for(int j = 1; j<b; j++){
                res[i][j] = sstc[pls++];
            }
        }

        Queue<String[]> q = new LinkedList<>();
        for(int i=0; i<a; i++){            //큐에 각 키의 알파벳별로 순서대로 삽입
            q.add(res[i]);
        }

        String[] keyword = key.split("");
        pls = 0;
        while(q.size()!= 0){                        //큐가 빌 때 까지
            if(keyword[pls].equals(q.peek()[0])){  //입력한 키워드 글자와 큐의 첫 번째 요소와 같으면 
                res[pls] = q.poll();               //평문을 만들 배열에 삽입
                pls++;
            }
            else {
                q.add(q.poll());                     //같지 않다면 큐의 첫 요소 맨 뒤로 이동
            }
        }

        String result = "";                          //평문을 넣을 변수 선언
        for(int i=1; i<b; i++){                    
            for(int j=0; j<a; j++){
                result += res[j][i];              //키 순서에 맞는 암호문을 result 변수에 넣어주면서
            }                                     
        }
        System.out.print(result);                  //평문 완성

    }
}