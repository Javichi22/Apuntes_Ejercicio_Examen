package estadoPedido;

public enum GeneroLiterario {

	FICCION("Se denomina ficción a la simulación "),
	NO_FICCION(" En contraste, una historia cuyo creador explícitamente deja abierto si y cómo el trabajo se refiere a la realidad generalmente se clasifica como ficción.​​ "),
	POESIA("La poesía es un género literario"), 
	BIOGRAFICA("Los Vengadores");

	private String descripcion;
	private int paginas;

	private GeneroLiterario(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public boolean esFiccion() {
		return this == FICCION;
	}

	public boolean esAptoParaÑinos() {
		if (this == FICCION || this == NO_FICCION) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		GeneroLiterario fici = GeneroLiterario.POESIA;
		System.out.printf("%s: %s \n", fici.name(), fici.getDescripcion());
		System.out.printf("%s: ¿Es Apto para niños? %s",POESIA, fici.esAptoParaÑinos() ? "Si" : "No");
	}
}
