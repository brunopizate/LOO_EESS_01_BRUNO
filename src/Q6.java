import java.util.Scanner;
public class Q6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
          int A = Integer.parseInt(scanner.nextLine());
          int B = Integer.parseInt(scanner.nextLine());
          int C = Integer.parseInt(scanner.nextLine());
          int R = (A+B)*(A+B);
          int S = (B+C)*(B+C);
          int D = (R+S)/2;
          System.out.println(D);
    }

}
