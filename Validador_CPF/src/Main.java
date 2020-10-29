import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option = -1;


        while (option !=0) {
            System.out.println("\nEscolha uma opção\n----------------\n0.Exit | 1.Gerar CPF| 2.Validar CPF");

            option = scanner.nextInt();

            switch (option) {
                case 0 -> {
                    System.out.println("Good bye");
                }

                case 1 -> {
                    System.out.println("GERAR QUANTOS CPFs?");
                    option = scanner.nextInt();
                    for (int i = 0; i < option; i++) {
                        FakeCPF.makeFakeCPF();
                        System.out.println(FakeCPF.fakeCPFs);

                    }
                }
                case 2 -> {
                    System.out.println("DIGITE OS 11 NUMEROS DO CPF");
                    String op = scanner.next().trim();
                    System.out.println(VerificadorCPF.verificador(op) ? "CPF VÁLIDO" : "CPF INVALIDO");

                }
                default -> System.out.println("Opção invalida");
            }
        }


    }
}