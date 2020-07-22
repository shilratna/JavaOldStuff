import java.util.Scanner;

//Your program will be evaluated by this DriverMain class and several test cases.
public class DriverMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int N = sc.nextInt();
        
        System.out.println("Enter numbers ");
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();
        ProblemSolution problemSolution = new ProblemSolution();
        System.out.print(problemSolution.solution(A, N));
    }
}