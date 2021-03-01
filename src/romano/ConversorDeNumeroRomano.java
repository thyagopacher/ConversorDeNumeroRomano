/**
 * @author ThyagoHenrique
 *
 * 19 de jun de 2017
 */
package romano;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ThyagoHenrique
 *
 */
public class ConversorDeNumeroRomano {

	private static Map<Character, Integer> tabela = new HashMap<Character, Integer>(){{
		put('I', 1);
		put('V', 5);
		put('X', 10);
		put('L', 50);
		put('C', 100);
		put('D', 500);
		put('M', 1000);
	}};
	
	/**
	 * @param string
	 * @return
	 */
	public int converter(String numeroEmRomano) {
		int acumulador = 0;
		int anterior = 0;
		int qtd = numeroEmRomano.length();
		for(int i = 0; i < qtd; i++){
			char letra = numeroEmRomano.charAt(i);
			int numero = tabela.get(letra);
			if(anterior > 0 && numero > anterior){
				acumulador -= numero;
			}else{
				acumulador += numero;
			}
			anterior = numero;
		}
		if(acumulador < 0){
			acumulador = acumulador * (-1);
		}
		return acumulador;
	}

}
