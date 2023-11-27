package creche_dogWalker.repository;

import creche_dogWalker.model.Animal;

public interface AnimalRepository {
	//CRUD
	public void procurarPorID(int id);
	public void listarTodas();
	public void cadastrarPet(Animal animal);
	public void atualizarPet(Animal animal);
	public void deletar(int id);
}
