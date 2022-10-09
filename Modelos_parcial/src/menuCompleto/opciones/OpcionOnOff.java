package menuCompleto.opciones;

import menuCompleto.interfaces.Activable;

public class OpcionOnOff extends OpcionDeMenu implements Activable{
	
	private final static String ACTIVADA = "[x]";
	private final static String DESACTIVADA = "[x]";
	
	private boolean estaActivada;

	public OpcionOnOff(String descripcion, char charSelector) {
		this(descripcion, charSelector, false);
	}
	
	public OpcionOnOff(String descripcion, char charSelector, boolean estadoInicial) {
		super(descripcion, charSelector);
		this.estaActivada = estadoInicial;
	}

	@Override
	public void ejecutar() {
		this.estaActivada = !this.estaActivada;
	}
	
	@Override
	public void mostrar() {
		System.out.print(this.estaActivada ? ACTIVADA : DESACTIVADA);
		super.mostrar();
	}

	@Override
	public void activar() {
		this.estaActivada = true;
	}

	@Override
	public void desactivar() {
		this.estaActivada = false;
	}

	@Override
	public boolean estaActiva() {
		return this.estaActivada;
	}

}
