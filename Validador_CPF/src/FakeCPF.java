import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FakeCPF {

static final Random random =new Random();

static int digit1;
static int digit2;
static int m = 10;
static int n = 11;


     public void makeFakeCPF(){
         List<Integer> digits = new ArrayList();
         String faKeCPF="";


                for (int i = 0; i < 9; i++) {
                    digits.add(random.nextInt(9));
                }

                //decorbrir primeiro digito e adiconar aos digitos
                for (Integer x : digits) {
                    digit1 += x * m;
                    --m;
                }
                //se o digito der 10 ele é 0
                digit1 = (digit1 * 10) % 11;
                if (digit1 == 10) {
                    digit1 = 0;
                }
                digits.add(digit1);


                //decobrindo segundo digito e adiconar aos digitos.
                for (Integer y : digits) {
                    digit2 += y * n;
                    --n;
                }
                digit2 = (digit2 * 10) % 11;
                if (digit2 == 10) {
                    digit2 = 0;
                }
                digits.add(digit2);


                //criar string com o novo cpf
                for (Integer z : digits) {
                    faKeCPF = faKeCPF.concat(Integer.toString(z));
                }
                //formata string
//                faKeCPF = new StringBuilder(faKeCPF)
//                        .insert(faKeCPF.length()-2, "-")
//                        .insert(faKeCPF.length()-5, ".")
//                        .insert(faKeCPF.length()-8, ".")
//                        .toString();





         System.out.println(faKeCPF);




            }


    }













