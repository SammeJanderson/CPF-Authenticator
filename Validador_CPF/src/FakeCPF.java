import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FakeCPF {


    public void makeFakeCPF() {
        Random random = new Random();
        List<Integer> digits = new ArrayList<>();
        List<Integer> digitsMult = new ArrayList<>();
        String fakeCpf = "";
        int multiplier;

        for (int i = 0; i < 9; i++) {
            digits.add(random.nextInt(10));
        }


        multiplier = 10;
        for (Integer n : digits) {
            digitsMult.add(n * multiplier);
            --multiplier;
        }
        int keyDigit1 = 0;
        for (Integer n : digitsMult) {
            keyDigit1 += n;
        }
        keyDigit1 = (keyDigit1 * 10) % 11;
        if (keyDigit1 == 10) {
            keyDigit1 = 0;
        }

        digits.add(keyDigit1);
        digitsMult.clear();

        multiplier = 11;
        for (Integer n : digits) {
            digitsMult.add(n * multiplier);
            --multiplier;
        }

        int keyDigit2 = 0;
        for (Integer n : digitsMult) {
            keyDigit2 += n;
        }
        keyDigit2 = (keyDigit2 * 10) % 11;
        if (keyDigit2 == 10) {
            keyDigit2 = 0;
        }

        digits.add(keyDigit2);

        for (Integer n : digits) {
            fakeCpf = fakeCpf.concat(Integer.toString(n));
        }

        fakeCpf = new StringBuilder(fakeCpf)
                .insert(fakeCpf.length() - 2, "-")
                .insert(fakeCpf.length() - 5, ".")
                .insert(fakeCpf.length() - 8, ".")
                .toString();

        System.out.println(fakeCpf);

    }
}



