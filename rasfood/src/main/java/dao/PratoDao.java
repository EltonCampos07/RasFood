package dao;

import br.com.rasmoo.restaurante.entity.Prato;

import javax.persistence.EntityManager;

public class PratoDao {
  private final EntityManager entityManager;

  public PratoDao(EntityManager entityManager){
    this.entityManager = entityManager;
  }

  public void cadastrar(Prato prato){
    this.entityManager.persist(prato);
    System.out.println("Entidade cadastrada com sucesso: " + prato);
  }
}
