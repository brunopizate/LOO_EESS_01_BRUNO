import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){


    Scanner scanner = new Scanner(System.in);
    float cotacaoDolar = Float.parseFloat(scanner.nextLine());
    float dolar = Float.parseFloat(scanner.nextLine());

    float real = dolar * cotacaoDolar;
    System.out.println("O Dolar está valendo R$ "+real);
}

}
