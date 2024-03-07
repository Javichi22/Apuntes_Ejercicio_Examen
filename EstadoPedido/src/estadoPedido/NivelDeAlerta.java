package estadoPedido;

public enum NivelDeAlerta {

	BAJO("Se refiere a la persona u objeto que tiene poca altura.", "Nivel de alerta Bajo"),
	
	MEDIO("El término medio, en una de sus acepciones más comunes, representa la mitad de una cosa.", "Nivel de alerta Medio"),
	
	ALTO("que tiene gran estatura o altura alta.", "Nivel de alerta Alto"), 
	
	CRITICO("es una interpretación, usada por Balmes, que principia por proponer una definición de la verdad por correspondencia.", "Nivel de alerta Critico");
	
	private String descripcion;
	private String accionesRecomendadas;
	
	private NivelDeAlerta(String descripcion, String accionesRecomendadas) {
		this.descripcion = descripcion;
		this.accionesRecomendadas = accionesRecomendadas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getAccionesRecomendadas() {
		return accionesRecomendadas;
	}
	
	public NivelDeAlerta escalar() {
		if (this == CRITICO){
			return CRITICO;
		}else {
			return NivelDeAlerta.values()[this.ordinal() + 1];//Esto devuelve un array que contiene todos los valores de la enumeración NivelDeAlerta.
		}	
	}
	
	public NivelDeAlerta desescalar() {
		if (this == BAJO) {
			return BAJO;
		}else {
			return NivelDeAlerta.values()[this.ordinal() - 1];
		}
	}
	
	public static void main(String[] args) {
		NivelDeAlerta PrimerNivel = NivelDeAlerta.BAJO;
		System.out.printf("%s: %s\n", PrimerNivel.name(),PrimerNivel.descripcion);
		System.out.printf("Nivel De Alerta: %s.\n", PrimerNivel.accionesRecomendadas);
		System.out.println();
		
		PrimerNivel = PrimerNivel.escalar();
		System.out.printf("%s: %s\n", PrimerNivel.name(), PrimerNivel.descripcion);
		System.out.printf("Nivel de Alerta: %s\n", PrimerNivel.accionesRecomendadas);
		System.out.println();
		
		PrimerNivel = PrimerNivel.escalar();
		System.out.printf("%s: %s\n", PrimerNivel.name(), PrimerNivel.descripcion);
		System.out.printf("Nivel de Alerta: %s\n", PrimerNivel.accionesRecomendadas);
		System.out.println();
		
		PrimerNivel = PrimerNivel.escalar();
		System.out.printf("%s: %s\n", PrimerNivel.name(), PrimerNivel.descripcion);
		System.out.printf("Nivel de Alerta: %s\n", PrimerNivel.accionesRecomendadas);
		System.out.println();
		
		PrimerNivel = PrimerNivel.desescalar();
		System.out.printf("%s: %s\n", PrimerNivel.name(), PrimerNivel.descripcion);
		System.out.printf("Nivel de Alerta: %s\n", PrimerNivel.accionesRecomendadas);
		System.out.println();
		
		PrimerNivel = PrimerNivel.desescalar();
		System.out.printf("%s: %s\n", PrimerNivel.name(), PrimerNivel.descripcion);
		System.out.printf("Nivel de Alerta: %s\n", PrimerNivel.accionesRecomendadas);
		System.out.println();
		
		PrimerNivel = PrimerNivel.desescalar();
		System.out.printf("%s: %s\n", PrimerNivel.name(), PrimerNivel.descripcion);
		System.out.printf("Nivel de Alerta: %s\n", PrimerNivel.accionesRecomendadas);
		System.out.println();
	}
}
