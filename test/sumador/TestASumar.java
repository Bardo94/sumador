package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

	@Test
    public void test() {
        ASumar sumi = new ASumar("155");
        String resultado = sumi.mostrar();
        assertEquals("1 + 3 = 4",resultado );
    }

}
