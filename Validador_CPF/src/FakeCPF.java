import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FakeCPF {



    static int m = 10;
    static int n = 11;


    public void makeFakeCPF() {
        Random random = new Random();
        List<Integer> digits = new ArrayList<>();
        List<Integer> digitsMult = new ArrayList<>();
        String fakeCpf = "";
        int mult = 0;

        for (int i = 0; i < 9; i++) {
            digits.add(random.nextInt(9));
        }


        mult = 10;
        for (Integer n : digits) {
            digitsMult.add(n * mult);
            --mult;
        }
        int ver1 = 0;
        for (Integer n : digitsMult) {
            ver1 += n;
        }
        ver1 = (ver1 * 10) % 11;
        if (ver1 == 10) {
            ver1 = 0;
        }

        digits.add(ver1);
        digitsMult.clear();

        mult = 11;
        for (Integer n : digits) {
            digitsMult.add(n * mult);
            --mult;
        }

        int ver2 = 0;
        for (Integer n : digitsMult) {
            ver2 += n;
        }
        ver2 = (ver2 * 10) % 11;
        if (ver2 == 10) {
            ver2 = 0;
        }

        digits.add(ver2);

        for (Integer n : digits) {
            fakeCpf = fakeCpf.concat(Integer.toString(n));
        }

        fakeCpf = new StringBuilder(fakeCpf)
                .insert(fakeCpf.length() - 2, "-")
                .insert(fakeCpf.length() - 4, ".")
                .insert(fakeCpf.length() - 8, ".")
                .toString();

        System.out.println(fakeCpf);

    }
}



