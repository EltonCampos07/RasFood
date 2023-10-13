package service.test;

import br.com.rasmoo.restaurante.entity.Prato;
import dao.PratoDao;
import util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class PratoService {
  public static void main(String[] args) {
    Prato risoto = new Prato();
    risoto.setNome("Risoto de frutos do mar");
    risoto.setDescricao("Risoto acompanhado de lula, polvo e mariscos");
    risoto.setDisponivel(true);
    risoto.setValor(BigDecimal.valueOf(88.50));

    var entityManager = JPAUtil.getEntityManagerRasfood();
    var pratoDao = new PratoDao(entityManager);

    entityManager.getTransaction().begin();
    pratoDao.cadastrar(risoto);
    entityManager.getTransaction().commit();
    entityManager.close();

  }
}
