import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String option;


        System.out.println("Escolha uma opção\n 1.Gerar CPF| 2.Validar CPF");

        option = scanner.next();

        switch (option) {
            case "1" -> {
                System.out.println("GERAR QUANTOS CPFs?");
                option = scanner.next();
                for (int i = 0; i < Integer.parseInt(option); i++) {
                    FakeCPF.makeFakeCPF();
                    System.out.println(FakeCPF.fakeCPFs);

                }
            }
            case "2" -> {
                System.out.println("DIGITE OS 11 NUMEROS DO CPF");
                String op = scanner.next().trim();
                System.out.println(VerificadorCPF.verificador(op) ? "CPF VÁLIDO" : "CPF INVALIDO");
//
            }
            default -> System.out.println("Opção invalida");
        }


    }
}