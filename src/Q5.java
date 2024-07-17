import java.util.Scanner;
public class Q5 {


    public static void main(String[] args){
        final int SALALRIO_HORA= 3;
        final int PAGAMENTO_DEPENDENTE = 100;
        Scanner scanner = new Scanner(System.in);
        char nome = Character.toUpperCase(scanner.nextLine().charAt(0));

        int horas = Integer.parseInt(scanner.nextLine());
        int dependentes = Integer.parseInt(scanner.nextLine());
        int salarioLiquido = ((SALALRIO_HORA * horas) + (PAGAMENTO_DEPENDENTE * dependentes));
        System.out.println("Nome do Funcionário: " + nome);
        System.out.println("Salário líquido: R$"+salarioLiquido);
    }



}
