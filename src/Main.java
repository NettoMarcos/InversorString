import java.util.Scanner;

public class Main {

    public static String inversor(String original) {

        char[] caracteres = original.toCharArray();

        int n = caracteres.length;

        for (int i = 0; i < n / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[n - 1 - i];
            caracteres[n - 1 - i] = temp;
        }

        return new String(caracteres);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string para inverter: ");
        String original = sc.nextLine();

        sc.close();

        String invertida = inversor(original);

        System.out.println("A string invertida é: " + invertida);
    }
}
