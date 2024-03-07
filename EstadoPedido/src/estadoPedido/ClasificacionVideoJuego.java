package estadoPedido;

public enum ClasificacionVideoJuego {

	ACCION ("Un videojuego de acción es un videojuego en el que el jugador debe usar su velocidad, destreza y tiempo de reacción.", "Adultos", "Multijugador"),
	
	AVENTURA("Los videojuegos de aventura son un género de videojuegos, caracterizados por la investigación, exploración, la solución de rompecabezas, la interacción con personajes del videojuego, y un enfoque en el relato en vez de desafíos basados en reflejos .", "Menores", "Individual"),
	
	ESTRATEGIA ("Juegos de estrategia son aquellos juegos o entretenimientos en los que, el factor de la inteligencia, habilidades técnicas, planificación y despliegue, pueden hacer predominar o impulsar al jugador hacia la victoria del juego.", "Mayores", "Multijugador"),
	SIMULACION("Puedes recrear acontecimientos emocionantes de la vida, probar diferentes carreras, y perfeccionar tus habilidades en nuestros desafíos de simulación.", "Todos" , "Menores" ),
	DEPORTES("En los juegos de deporte debes competir contra uno o más jugadores en desafíos tácticos que pondrán a prueba tu precisión, exactitud y estrategia.", "Todos", "Individul");
	
	private String descripcion;
	private String rangoEdad;
	private String tipoDeJugabilidad;
	
	private ClasificacionVideoJuego(String descripcion, String rangoEdad, String tipoDeJugabilidad) {
		this.descripcion = descripcion;
		this.rangoEdad = rangoEdad;
		this.tipoDeJugabilidad = tipoDeJugabilidad;

	}


	public String getDescripcion() {
		return descripcion;
	}


	public String getRangoEdad() {
		return rangoEdad;
	}


	public String getTipoDeJugabilidad() {
		return tipoDeJugabilidad;
	}


	public boolean esAptoParaMenores() {
	return rangoEdad.contains("Adultos");
	
	}
	
	public boolean esMultijugador() {
		return tipoDeJugabilidad.contains("Multijugador");
	}
	
	public static void main(String[] args) {
		ClasificacionVideoJuego clasi = ClasificacionVideoJuego.ACCION;
		System.out.printf("%s: %s Es: %s, y %s\n", clasi.name(), clasi.descripcion, clasi.rangoEdad, clasi.tipoDeJugabilidad);
		System.out.printf("%s: ¿Es Apto para Adultos? %s\n", clasi.name(),clasi.esAptoParaMenores() ? "Si" : "No");
		System.out.printf("%s: ¿Es Multijugador %s", clasi.name(), clasi.esMultijugador() ? "Si" : "No");
	}
}
