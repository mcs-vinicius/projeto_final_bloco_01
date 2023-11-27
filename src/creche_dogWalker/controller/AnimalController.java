package creche_dogWalker.controller;
import java.util.ArrayList;
import java.util.Optional;

import creche_dogWalker.model.Animal;
import creche_dogWalker.repository.AnimalRepository;
public class AnimalController implements AnimalRepository{
	private ArrayList<Animal> listAnimal = new ArrayList<Animal>();
	private int numero;

	@Override
	public void procurarPorID(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTodas() {
		if (listAnimal.isEmpty()) {
			System.out.println("Nenhuma conta encontrada.");
		} 
			for (var lAnimais : listAnimal) {
				lAnimais.visualizar();
			}
		
	}

	@Override
	public void cadastrarPet(Animal animal) {
		listAnimal.add(animal);
	}

	@Override
	public void atualizarPet(Animal animal) {
		Optional<Animal> buscaAnimal = buscarNaCollection(animal.getId());
		if (buscaAnimal.isPresent()) {
			listAnimal.set(listAnimal.indexOf(buscaAnimal.get()), animal);
			System.out.println("A Conta Numero: " + animal.getId() + " Atualizada com sucesso!");
		} else {
			System.out.println("A Conta número: " + animal.getId() + "não foi encontrada!");
		}
	}

	@Override
	public void deletar(int id) {
		Optional<Animal> animal = buscarNaCollection(id);
		if (animal.isPresent()) {
			if (listAnimal.remove(animal.get()) == true) {
				System.out.println("A Conta Numero: " + id + " Foi excluida com sucesso!");
			}
		} else {
			System.out.println("A Conta número: " + numero + "não foi encontrada!");
		}
		
	}
	public int gerarNumero() {
		return ++numero;
	}
	public Optional<Animal> buscarNaCollection(int id) {
		for (var cadastro : listAnimal) {
			if (cadastro.getId() == id) {
				return Optional.of(cadastro);
			}
		}
		return Optional.empty();
	}
}
