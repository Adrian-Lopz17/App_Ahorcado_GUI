package appGUI_Ahorcado;

/**
 * Clase Calculo 
 * 1º DAW, grupoA 31/01/2021
 * 
 * @author Adrian López Soto
 */

public class Calculo {
	// VARIABLES:
	private String palabraAleatoria;
	private StringBuilder encriptacion;
	private Integer vidas;

	
	// CONSTRUCTOR:
	public Calculo() {
		this.palabraAleatoria = getGeneraPalabraAleatoria();
		this.encriptacion = getGeneraEncriptacion(palabraAleatoria);
		this.vidas = 6;
	}

	
	// GETTERS
	public String getPalabraAleatoria() {
		return palabraAleatoria;
	}

	public StringBuilder getEncriptacion() {
		return encriptacion;
	}

	public Integer getVidas() {
		return vidas;
	}

	
	// SETTERS
	public void setPalabraAleatoria(String palabraAleatoria) {
		this.palabraAleatoria = palabraAleatoria;
	}

	public void setEncriptacion(StringBuilder encriptacion) {
		this.encriptacion = encriptacion;
	}

	public void setVidas(Integer vidas) {
		this.vidas = vidas;
	}

	
	// MÉTODOS:

	public String getGeneraPalabraAleatoria() {
		// Método que selecciona la palabra Random para jugar de un array:
		String lista[] = { "murcielago", "caballo", "hipopotamo", "delfin", "murcielago", "ballena", "hormiga",
				"edificio", "patata", "escritorio", " ordenador", "farola", "coche", "trofeo", "cortina", "pupitre",
				"zapatilla", "chaqueta", "suelo", "almohada" };

		int random = 0;
		random = (int) (Math.random() * lista.length);
		palabraAleatoria = lista[random];

		// Devuelve la palabra aleatoria del Array para el juego:
		return palabraAleatoria;
	}

	public StringBuilder getGeneraEncriptacion(String palabra) {
		// Método que encripta con asteriscosla palabra Random para jugar:
		encriptacion = new StringBuilder(palabra);

		for (int i = 0; i < encriptacion.length(); i++) {
			encriptacion.setCharAt(i, '*');
		}

		// Devuelve la palabra aleatoria encriptada:
		return encriptacion;
	}

	public boolean esVictoria() {
		// Condiciones para ver si se ha ganado o perdido la partida
		boolean victoria = false;

		if (encriptacion.toString().equals(palabraAleatoria)) {
			victoria = true;
		}

		return victoria;
	}

	public boolean esFinJuego() {
		boolean derrota = false;
		boolean esFinJuego = false;

		if (vidas == 0) {
			derrota = true;
		}

		// La partida solo llega a su final si se gana o se pierde
		if (esVictoria() || derrota) {
			esFinJuego = true;
		}

		return esFinJuego;
	}

	public String getJuego(char letraJugador) {
		// Método principal para jugar
		int posicionLetra = 0;
		boolean aciertoLetra = false;
		boolean esFinRonda = false;

		// Bucle principal para comprobar si has ganado o perdido
		while (!esFinJuego() && !esFinRonda) {
			posicionLetra = 0;
			// recorremos cada posicion "*" buscando coincidencia con letra introducida en
			// caso de que exista.
			// en caso de que se encuentre coincidencia, cambiar "*" por letraJugador en esa
			// posicion
			while (posicionLetra < encriptacion.length()) {
				Character.toString(letraJugador).indexOf(palabraAleatoria.charAt(posicionLetra));
				if (letraJugador == palabraAleatoria.charAt(posicionLetra)) {
					aciertoLetra = true;
					encriptacion.setCharAt(posicionLetra, letraJugador);
				}
				posicionLetra++;
			}

			// Resto una vida por cada fallo, en caso de acierto de letra no se resta nada
			if (aciertoLetra == false) {
				vidas--;
			}

			// Reseteamos de nuevo el boolean a "false" para que no guarde valor true en
			// posteriores búsquedas
			aciertoLetra = false;

			// Acabamos la ronda después de comprobar la letra introducida en todas las
			// posiciones de la palabra a adivinar
			esFinRonda = true;
			esVictoria();
			esFinJuego();
		}
		return encriptacion.toString();
	}

}