package creche_dogWalker;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

import creche_dogWalker.model.Cachorro;
import creche_dogWalker.model.Gato;

public class Menu {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int id, opcao=0;
		String nome, raca, tutor, sexo, tipo;
		float valor;
		
		Cachorro c1 = new Cachorro(1, "Andressa", "(11)99999-8888", "Max", 5, 1,"Lhasa Apso");
		c1.visualizar();
		
		Gato g1 = new Gato(2, "Vinicius", "(11)88888-9999", "Nino", 8, 2,"Persa  ");
		g1.visualizar();
		
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
				
				keyPress();
				break;
			case 2:
				System.out.println("*************************************************");
				System.out.println("*         	  Listar Aulunos			*");
				System.out.println("*************************************************");
				
				keyPress();
				break;
			case 3:
				System.out.println("*************************************************");
				System.out.println("*         	  Atualizar Cadastro			*");
				System.out.println("*************************************************");
				
				keyPress();
				break;
			case 4:
				System.out.println("*************************************************");
				System.out.println("*         	  Apagar Cadastro			*");
				System.out.println("*************************************************");
				
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
