import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FakeCPFTest {

    @Test
    void makeFakeCPFisvalid() {
        FakeCPF fakeCPF = new FakeCPF();
        fakeCPF.makeFakeCPF();
        String x = fakeCPF.fakeCPFs.replaceAll("[\\.\\-]", "").trim();
        assertEquals(VerificadorCPF.verificador(x), true);
    }


}