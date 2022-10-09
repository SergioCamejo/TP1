package menu.clases;

public class OpcionAccesoAMenu extends OpcionDeMenu {
	
	private Menu menuSecundario;

	public OpcionAccesoAMenu(String descripcion, char caracter, Menu menuSecundario) {
		super(descripcion, caracter);
		this.menuSecundario = menuSecundario;
	}
	
	public Menu getMenuSecundario() {
		return this.menuSecundario;
	}

	@Override
	public void ejecutar() {		
		if (menuSecundario != null) {
			this.menuSecundario.ejecutar();			
		}
	}

}