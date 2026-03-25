import java.util.*;

public class StudentPassMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int count = 0; // number of students passed

        for (int i = 0; i < N; i++) {
            int sum = 0;

            for (int j = 0; j < M; j++) {
                int marks = sc.nextInt();
                sum += marks;
            }

            double avg = (double) sum / M;

            if (avg >= 50) {  // strictly greater than 50
                count++;
            }
        }

        System.out.println(count);
    }
}