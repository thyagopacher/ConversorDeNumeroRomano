/**
 * @author ThyagoHenrique
 *
 * 19 de jun de 2017
 */
package romano;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author ThyagoHenrique
 *
 */
public class ConversorDeNumeroRomanoTest {

	@Test
	public void deveEntenderOSimboloI() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converter("I");
		Assert.assertEquals(1, numero);
	}

	@Test
	public void deveEntenderOSimboloV() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converter("V");
		Assert.assertEquals(5, numero);
	}

	@Test
	public void deveEntenderOSimboloXII() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converter("XII");
		Assert.assertEquals(12, numero);
	}	

	@Test
	public void deveEntenderOSimboloIX() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converter("IX");
		Assert.assertEquals(9, numero);
	}		

	@Test
	public void deveEntenderOSimboloCC() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converter("CC");
		Assert.assertEquals(200, numero);
	}	

	@Test
	public void deveEntenderOSimboloMM() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converter("MM");
		Assert.assertEquals(2000, numero);
	}		
}
