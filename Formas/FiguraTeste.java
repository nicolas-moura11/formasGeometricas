package Formas;

import static org.junit.Assert.*;
import org.junit.Test;

public class FiguraTeste {

	 @Test
	    public void testCirculo() {
	        Circulo circulo = new Circulo(5);
	        assertEquals(78.53981633974483, circulo.calcularArea(), 0.5);
	        assertEquals(31.41592653589793, circulo.calcularPerimetro(),0.5);
	    }

	    @Test
	    public void testQuadrado() {
	        Quadrado quadrado = new Quadrado(4);
	        assertEquals(16.0, quadrado.calcularArea(), 0.5);
	        assertEquals(16.0, quadrado.calcularPerimetro(), 0.5);
	    }

	    @Test
	    public void testRetangulo() {
	        Retangulo retangulo = new Retangulo(6, 8);
	        assertEquals(48.0, retangulo.calcularArea(), 0.5);
	        assertEquals(28.0, retangulo.calcularPerimetro(), 0.5);
	    }
}
