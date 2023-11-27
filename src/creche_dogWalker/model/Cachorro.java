package creche_dogWalker.model;

public class Cachorro extends Animal{
	private String raca;

	public Cachorro(int id, String tutor, String telefone, String nome, int idade, int tipo, String raca) {
		super(id, tutor, telefone, nome, idade, tipo);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void visualizar() {
			super.visualizar();
			System.out.println("*	Raca: " + this.raca + "			*");
			System.out.println( "*************************************************\n\n");
	}
}
