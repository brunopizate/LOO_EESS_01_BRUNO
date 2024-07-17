
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] dados,professor;
        dados = new String[]{"Nome:","Endereço:","Cidade:", "UF:","CEP:", "Telefone:","CPF:", "RG:","Data de Nascimento:","Grau de Escolaridade:", "curso que leciona:"};
        professor = new String[dados.length];

        for(int i = 0; i< dados.length;i++){
            System.out.print(dados[i]);
            professor[i] = sc.nextLine();
        }
        for(int i = 0; i < dados.length;i++){
            System.out.println(dados[i]+""+professor[i]);
        }

    }
}


