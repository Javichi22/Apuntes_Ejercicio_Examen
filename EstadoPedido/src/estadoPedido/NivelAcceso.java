package estadoPedido;

public enum NivelAcceso {

	ADMINISTRADOR ("Puede Crear, editar y eliminar"), EDITOR ("Solo puede editar"), VISITANTE ("Solo puede ver");
	
	
	private String permisos;
	
	private NivelAcceso( String permisos) {
		this.permisos = permisos;
	}

	public String getPermisos() {
		return permisos;
	}

	public boolean puedeEditar() {
		return permisos.contains("editar") ;
	}
	
	public static void main(String[] args) {
		NivelAcceso administrador = NivelAcceso.ADMINISTRADOR;
		System.out.printf("%s: %s.\n",administrador.name(), administrador.getPermisos() );
		System.out.printf("¿Puede editar? %s\n", administrador.puedeEditar() == true ? "Si" : "No");
		
		NivelAcceso editor = NivelAcceso.EDITOR;
		System.out.printf("%s: %s. \n", editor.name(), editor.getPermisos());
		System.out.printf("¡Puede editar!: %s\n",editor.puedeEditar() == true ? "Si" : "No");
	}
}
