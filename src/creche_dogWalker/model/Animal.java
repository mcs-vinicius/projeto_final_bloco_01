package creche_dogWalker.model;

public abstract class Animal {
	private int id;	
	private String tutor;
	private String telefone;
	private String nome;
	private int idade;
	private int tipo;
	public Animal(int id, String tutor, String telefone, String nome, int idade, int tipo) {
		this.id = id;
		this.tutor = tutor;
		this.telefone = telefone;
		this.nome = nome;
		this.idade = idade;
		this.tipo = tipo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTutor() {
		return tutor;
	}
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public void visualizar() {
		String tipo = "";
		switch(this.tipo) {
		case 1 -> tipo = "Cachorro";
		case 2 -> tipo = "Gato";
		}
		System.out.println( "*************************************************");
		System.out.println("*              Dados da Conta			*");
		System.out.println("*************************************************");
		System.out.println("*	Matricula: " + this.id+ "				*");
		System.out.println("*	Tutor: " + this.tutor + "				*");
		System.out.println("*	Telefone: " + this.telefone + "		*");
		System.out.println("*	Nome do Pet: " + this.nome+ "			*");
		System.out.println("*	Idade: " + this.idade + "				*");
		System.out.println("*	Tipo: " + tipo + "				*");
		
	}
	
}

