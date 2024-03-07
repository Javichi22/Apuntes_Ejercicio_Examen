package estadoPedido;

public enum EstadoPedido {

	PENDIENTE ("PEDIDO PENDIENTE DE CONFIRMACION" , 1), PROCESANDO ("PEDIDO PREPARANDOSE", 2), ENVIADO ("PEDIDO ENVIADO", 3), ENTREGADO ("PEDIDO ENTREGADO", 4);
	
	private String mensaje;
	private int codigo;
	
	
	private EstadoPedido(String mensaje, int codigo) {
		this.mensaje = mensaje;
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public EstadoPedido siguienteEstado () {
		switch (this) {
		case PENDIENTE:
			return PROCESANDO;
		case PROCESANDO:
			return ENVIADO;
		case ENVIADO:
			return ENTREGADO;
		default:
			return this;
		}
	}
	
	public static void main(String[] args) {
		EstadoPedido estadoActual = EstadoPedido.PENDIENTE;
		System.out.printf("Estado %d: %s.",estadoActual.getCodigo(), estadoActual.getMensaje());
		
		EstadoPedido siguienteEstado = estadoActual.siguienteEstado();
		System.out.printf("\nEstado %d: %s.",siguienteEstado.getCodigo() ,siguienteEstado.getMensaje());
		
		EstadoPedido siguienteEstado2 = siguienteEstado.siguienteEstado();
		System.out.printf("\nEstado %d: %s.",siguienteEstado2.getCodigo() , siguienteEstado2.getMensaje());
		
		EstadoPedido Entregado = siguienteEstado2.siguienteEstado();
		System.out.printf("\nEstado %d: %s.", Entregado.getCodigo(), Entregado.siguienteEstado());
	}


}
