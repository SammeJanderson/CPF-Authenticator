import java.util.ArrayList;
import java.util.List;


class VerficadorCPF {
    static String cpf = "";
    static String digitoValidador ="";
    static List<Integer> digits = new ArrayList<>();


    public static void verificador(String x){
        if(x.length() !=11){
            System.out.println("CPF INVALIDO");
        }else {

            String cpf = x;
            String digitoValidador = "";
            List<Integer> digits = new ArrayList<>();

            digitoValidador = cpf.substring(9, 11);


            //primeiro digito
            for (int i = 0; i < 9; i++) {
                digits.add(Integer.parseInt(cpf.substring(i, (i + 1))));
            }
            int m = 10;
            int total1 = 0;
            int total2 = 0;
            String total3;

            for (Integer n : digits) {
                total1 += (n * m);
                m -= 1;
            }
            total1 = (total1 * 10) % 11;
            if (total1 == 10) {
                total1 = 0;
            }
            digits.add(total1);


            m = 11;
            for (Integer n : digits) {
                total2 += (n * m);
                m -= 1;
            }
            total2 = (total2 * 10) % 11;
            if (total2 == 10) {
                total2 = 0;
            }

            total3 = Integer.toString(total1).concat(Integer.toString(total2));

            cpf = new StringBuilder(cpf)
                    .insert(cpf.length() - 2, "-")
                    .insert(cpf.length() - 4, ".")
                    .insert(cpf.length() - 8, ".")
                    .toString();


            if (digitoValidador.equals(total3)) {
                System.out.printf("O CPF %s É VALIDO", cpf);
            } else {
                System.out.printf("O CPF %s É INVALIDO", cpf);
            }
        }

    }

    }





