import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VerificadorCPFTest {

    @Test
    void verificadoristrue() {
        VerificadorCPF ver = new VerificadorCPF();
        assertEquals(ver.verificador("42127117883"), true);

    }

    @Test
    void verificadorisfalse() {
        VerificadorCPF ver = new VerificadorCPF();
        assertEquals(ver.verificador("42127117892"), false);

    }


}