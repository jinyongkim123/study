import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static class Queue {
        private int[] queue;
        private int front;
        private int rear;
        private int size;

        public Queue(int capacity) {
            queue = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == queue.length;
        }

        public int size() {
            return size;
        }

        public void enqueue(int x) {
            if (isFull()) {//큐가 가득 차있으면 아무 동작도 수행하지 않음
                return;
            }
            rear = (rear + 1) % queue.length;//rear를 1 증가시키고, 배열의 인덱스 넘어가지 않도록 %연산 수행
            queue[rear] = x;//rear 인덱스에 값 저장
            size++;//큐의 사이즈 1 증가
        }
        public int dequeue(){
            if(isEmpty()){//큐가 비어있으면 -1 반환
                return -1;
            }
            int x = queue[front];//front 인덱스의 값 저장
            front = (front + 1) % queue.length;//front를 1 증가시키고, 배열 인덱스 넘어가지 않도록 %연산 수행
            size--;//큐의 사이즈 1 감소
            return x;//front 인덱스 값 반환
        }
        public int peek(){
            if(isEmpty()){//큐가 비어있으면 -1 반환
                return -1;
            }
            return queue[front];//front 인덱스의 값을 반환
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue queue = new Queue(N);

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");//명령어 입력
            switch (command[0]) {
                case "push":
                    int x = Integer.parseInt(command[1]);
                    queue.enqueue(x);
                    break;
                case "pop":
                    sb.append(queue.dequeue()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(queue.peek()).append("\n");
                    break;
                case "back":
                    if(queue.isEmpty()){//큐가 비어있다면 -1 출력
                        sb.append("-1").append("\n");
                    }else {
                        sb.append(queue.queue[queue.rear]).append("\n");//rear인덱스 값을 출력
                    }
                    break;
            }
        }
        System.out.println(sb);
    }

}