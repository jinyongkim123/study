import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] arr;
    static int[] tmp;

    public static void main(String[] args) throws IOException {
        // Scanner stdIn = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n];
        tmp = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(0, n - 1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.print(sb);
    }

    static void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    static void merge(int left, int mid, int right) {
        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            tmp[k++] = arr[i++];
        }

        while (j <= right) {
            tmp[k++] = arr[j++];
        }

        for (int index = left; index <= right; index++) {
            arr[index] = tmp[index];
        }
    }
}
//https://gmlwjd9405.github.io/2018/05/08/algorithm-merge-sort.html 합병정렬 설명