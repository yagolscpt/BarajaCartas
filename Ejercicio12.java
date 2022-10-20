package boletin_entregar;
/*
***Ejercicio 12
Escribe un programa que genere una secuencia de 5 cartas de la baraja
española y que sume los puntos según el juego de la brisca. 
El valor de las cartas se debe guardar en una 
estructura HashMap que debe contener parejas (figura, valor), por ejemplo (“caballo”, 3). 
La secuencia de cartas debe ser una estructura de la clase ArrayList que contiene objetos de la clase Carta. 
El valor de las cartas es el siguiente:
 as -> 11, tres -> 10, sota -> 2, caballo -> 3, rey -> 4; 
 el resto de cartas no vale nada.

Ejemplo:
as de oros
cinco de bastos
caballo de espadas
sota de copas
tres de oros
Tienes 26 puntos
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ejercicio12 {
	
	public static List<CartaN> darMano() {
		CartaN nueva;
		List<CartaN> mano = new ArrayList<CartaN>();
		// metodo estatico que esta en el constructor de CartaN
		// CartaN.rellenaMapa();

		do {
			nueva = new CartaN();

			if (!mano.contains(nueva)) {
				mano.add(nueva);
			}

		} while (mano.size() < 5);

		Collections.sort(mano);
		for (CartaN car : mano) {
			System.out.println(car);
		}
		return mano;
	}
	
	
	static HashMap<String,Integer> puntos =new HashMap<>();
	
	static void puntosBrisca(){
		puntos.put("AS", 11);
		puntos.put("TRES", 10);
		puntos.put("REY", 4);
		puntos.put("CABALLO", 3);
		puntos.put("SOTA", 2);
		puntos.put("SIETE", 0);
		puntos.put("SEIS", 0);
		puntos.put("CINCO", 0);
		puntos.put("CUATRO", 0);
		puntos.put("DOS", 0);
		
		
	}
	
	static String darPuntuacion(List<CartaN> j) {
		int tanteo = 0;
		
		for(CartaN c : j) {
			tanteo+=   puntos.get(c.getValor());
		}
		
		return "LOS PUNTOS OPTENIDOS SON "+ tanteo;
	}
	
	
public static void main(String[] args) {
	
	puntosBrisca();
	List<CartaN> jugada = darMano();
	System.out.println(darPuntuacion(jugada));
}
}
