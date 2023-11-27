package creche_dogWalker;

import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

import creche_dogWalker.controller.AnimalController;
import creche_dogWalker.model.Animal;
import creche_dogWalker.model.Cachorro;
import creche_dogWalker.model.Gato;

public class Menu {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		AnimalController animais = new AnimalController();
		int id, opcao=0, idade, tipo;
		String nome, raca, tutor, telefone;

		
		Cachorro c1 = new Cachorro(animais.gerarNumero(), "Andressa", "(11)99999-8888", "Max", 5, 1,"Lhasa Apso");
		animais.cadastrarPet(c1);
		
		Gato g1 = new Gato(animais.gerarNumero(), "Vinicius", "(11)88888-9999", "Nino", 8, 2,"Persa  ");
		animais.cadastrarPet(g1);
		
		while (true) {
			System.out.println("*************************************************");
			System.out.println("*              Creche DogWalker			*");
			System.out.println("*************************************************");
			System.out.println("*						*");
			System.out.println("*	1 - Cadastrar pet			*");
			System.out.println("*	2 - Listar Relação de Aulunos		*");
			System.out.println("*	3 - Atualizar Dados do Cadastro		*");
			System.out.println("*	4 - Apagar Cadastro			*");
			System.out.println("*	0 - Sair				*");
			System.out.println("*						*");
			System.out.println("*************************************************");
			System.out.println("Entre com a opção desejada:                      ");
			opcao = leia.nextInt();

			if (opcao == 0) {
				sobre();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("*************************************************");
				System.out.println("*         	  Cadastrar Pet			*");
				System.out.println("*************************************************");
				System.out.println("Tutor: ");
				tutor = leia.nextLine();
				
				System.out.println("Telefone: ");
				leia.skip("\\R");
				telefone = leia.nextLine();
				
				System.out.println("Nome do Pet: ");
				nome = leia.nextLine();
				
				System.out.println("Idade: ");
				idade = leia.nextInt();
				
				System.out.println("Tipo(1-Cachorro ou 2-Gato): ");
				tipo = leia.nextInt();
				
				switch (tipo) {
				case 1 -> {
					System.out.println("Raça: ");
					raca = leia.nextLine();
					animais.cadastrarPet(new Cachorro(animais.gerarNumero(), tutor, telefone, nome, idade, tipo, raca));
				}
				case 2 -> {
					System.out.println("Raça: ");
					raca = leia.nextLine();
					
					animais.cadastrarPet(new Gato(animais.gerarNumero(), tutor, telefone, nome, idade, tipo, raca));
				}
			}
				
				System.out.println("Cadastro efetuado com sucesso!");
				keyPress();
				break;
			case 2:
				System.out.println("*************************************************");
				System.out.println("*         	  Listar Aulunos		*");
				System.out.println("*************************************************");
				animais.listarTodas();
				keyPress();
				break;
			case 3:
				System.out.println("*************************************************");
				System.out.println("*         	  Atualizar Cadastro		*");
				System.out.println("*************************************************");
				
				System.out.println("\nDigite o numero da Matricula: " );
				id = leia.nextInt();

				Optional<Animal> animal = animais.buscarNaCollection(id);
				if (animal.isPresent()) {
					System.out.println("Tutor: ");
					leia.skip("\\R");
					tutor = leia.nextLine();
					
					System.out.println("Telefone: ");
					telefone = leia.nextLine();
					
					System.out.println("Nome do Pet: ");
					nome = leia.nextLine();
					
					System.out.println("Idade: ");
					idade = leia.nextInt();
					
					System.out.println("Tipo(1-Cachorro ou 2-Gato): ");
					tipo = leia.nextInt();

					switch (tipo) {
					case 1 -> {
						System.out.println("Raça: ");
						leia.skip("\\R");
						raca = leia.nextLine();
						animais.cadastrarPet(new Cachorro(animais.gerarNumero(), tutor, telefone, nome, idade, tipo, raca));
					}
					case 2 -> {
						System.out.println("Raça: ");
						leia.skip("\\R");
						raca = leia.nextLine();
						animais.cadastrarPet(new Gato(animais.gerarNumero(), tutor, telefone, nome, idade, tipo, raca));
					}
				}
				} else {
					System.out.println("A Conta: " + id + " não foi encontrada!");
				}
				System.out.println("Cadastro atualizado com sucesso!");
				
				keyPress();
				break;
			case 4:
				System.out.println("*************************************************");
				System.out.println("*         	  Apagar Cadastro			*");
				System.out.println("*************************************************");
				System.out.println("\nDigite a matricula:");
				id = leia.nextInt();

				animais.procurarPorID(id);
				animais.deletar(id);
				keyPress();
				break;
			
			default:
				System.out.println("*************************************************");
				System.out.println("*   Opção invalida, Digite uma opção valida.    *");
				System.out.println("*************************************************\n");
				keyPress();
				break;
			}
		}
	}

	static void sobre() {
		System.out.println( "*************************************************");
		System.out.println("*		Sistema Finalizado!		*");
		System.out.println("*************************************************");
		System.out.println("*						*");
		System.out.println("*	     Projeto -  Creche DogWalker		*");
		System.out.println("*	     By: Vinicius M C Silva		*");
		System.out.println("*						*");
		System.out.println("*************************************************");
	}


	public static void keyPress() {
		try {
			System.out.println("Pressione a tecla Enter para continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você precionou uma tecla invalida.");
		}
	}
}
