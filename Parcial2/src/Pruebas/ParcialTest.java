package Pruebas;

import logica.Parcial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParcialTest {
	private Parcial parcial;
	
	@BeforeEach
	public void setUp() {
		parcial=new Parcial();
	}
	
	@Test
	public void testPotenciaBaseyExponenteCero () {
		assertEquals(1, parcial.potencia(0, 0));
	}
	
	@Test
	public void testPotenciaEXPcero() {
		assertEquals(1, parcial.potencia(4, 0));
	}
	
	 @Test
	    public void testPotenciaNormal() {
	        assertEquals(256, parcial.potencia(4, 4));
	    }

	 @Test
	   	public void testPotenciaUno() {
		 assertEquals(4, parcial.potencia(4, 1));
	    }
	 
	 @Test
	 public void testExponenteNegativo() {
		 Exception e = assertThrows(IllegalArgumentException.class, () -> parcial.potencia(4, -1));
		 assertEquals("e no puede ser negativo", e.getMessage());
	   	}
}
