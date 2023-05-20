import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int front = 10000;
    static int back = 10000;
    static int size = 0;
    static int[] deque = new int[20001];

/*    Deque 배열에서 front가 최종적으로 가리키는 위치는 항상 비워두기
      즉, 가장 앞에 있는 원소는 front + 1이 됨..

      이유는 만약 front의 최종 위치에 원소를 넣게 되면 다음과 같은 예외 발생

      ex) push_front(3)을 실행하는데 아무 원소도 없을 경우
      front--; 감소 시킨 뒤 deque[front] = 3; 이 되면
      deque[9999] = 3; 이 된다. 이때 front = 9999; back = 10000이 된다.
      이러한 경우를 방지하기 위해
      deque[front]에 원소를 넣은 뒤, front--;을 해준다
      결과적으로 front 요소 자체는 deque[front+1]위치에 자리한다.
 */

    static void push_front(int val) {
        //원소를 먼저 넣은 뒤 front 감소
        deque[front] = val;
        front--;
        size++;
    }

    static void push_back(int val) {
        back++;
        size++;
        deque[back] = val;
    }

    static int pop_front() {
        if (size == 0) {
            return -1;
        }
    /*
    front + 1이 front 원소이므로 해당 원소를 임시 변수에 둔 뒤
    front을 +1 증가시킨다
     */
        int ret = deque[front+1];
        front++;
        size--;
        return ret;
    }

    static int pop_back(){
        if(size == 0){
            return -1;
        }
        int ret = deque[back];
        back--;
        size--;
        return ret;
    }

    static int size(){
        return size;
    }

    static int empty(){
        if(size==0){
            return 1;
        }
        return 0;
    }

    static int front() {
        if (size == 0) {
            return -1;
        }
        return deque[front+1];
    }

    static int back(){
        if(size == 0){
            return -1;
        }
        return deque[back];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String[] s = br.readLine().split(" ");

            switch (s[0]){

                case "push_front" :{
                    push_front(Integer.parseInt(s[1]));
                    break;
                }
                case "push_back" :{
                    push_back(Integer.parseInt(s[1]));
                    break;
                }
                case "pop_front" :{
                    sb.append(pop_front()).append('\n');
                    break;
                }
                case "pop_back" :{
                    sb.append(pop_back()).append('\n');
                    break;
                }
                case "size" :{
                    sb.append(size()).append('\n');
                    break;
                }
                case "empty" :{
                    sb.append(empty()).append('\n');
                    break;
                }
                case "front" :{
                    sb.append(front()).append('\n');
                    break;
                }
                case "back" :{
                    sb.append(back()).append('\n');
                    break;
                }
            }
        }
        System.out.println(sb);
    }

}