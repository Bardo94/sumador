package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

	@Test
    public void testUnaCifra() {
        ASumar sumi = new ASumar("5");
        String resultado = sumi.mostrar();
        assertEquals("5 = 5",resultado );
    }
	
	@Test
    public void testCifraNegativa() {
        ASumar sumi = new ASumar("-5");
        String resultado = sumi.mostrar();
        assertEquals("-5 = -5",resultado );
    }
	
	@Test
    public void testMultiplesCifras() {
        ASumar sumi = new ASumar("15");
        String resultado = sumi.mostrar();
        assertEquals("1 + 5 = 6",resultado );
    }
}