import java.util.ArrayList;
import java.util.List;


class VerficadorCPF {


    public static void verificador(String x) {
        if (x.length() != 11) {
            System.out.println("CPF INVALIDO");
        } else {

            String cpf = x;
            String digitoValidador;
            List<Integer> digits = new ArrayList<>();

            digitoValidador = cpf.substring(9, 11);


            //primeiro digito
            for (int i = 0; i < 9; i++) {
                digits.add(Integer.parseInt(cpf.substring(i, (i + 1))));
            }
            int multiplier = 10;
            int keyDigit1 = 0;
            int keyDigit2 = 0;
            String keyDigit3;

            for (Integer n : digits) {
                keyDigit1 += (n * multiplier);
                multiplier -= 1;
            }
            keyDigit1 = (keyDigit1 * 10) % 11;
            if (keyDigit1 == 10) {
                keyDigit1 = 0;
            }
            digits.add(keyDigit1);


            multiplier = 11;
            for (Integer n : digits) {
                keyDigit2 += (n * multiplier);
                multiplier -= 1;
            }
            keyDigit2 = (keyDigit2 * 10) % 11;
            if (keyDigit2 == 10) {
                keyDigit2 = 0;
            }

            keyDigit3 = Integer.toString(keyDigit1).concat(Integer.toString(keyDigit2));

            cpf = new StringBuilder(cpf)
                    .insert(cpf.length() - 2, "-")
                    .insert(cpf.length() - 5, ".")
                    .insert(cpf.length() - 8, ".")
                    .toString();


            if (digitoValidador.equals(keyDigit3)) {
                System.out.printf("O CPF %s É VALIDO", cpf);
            } else {
                System.out.printf("O CPF %s É INVALIDO", cpf);
            }
        }

    }

}