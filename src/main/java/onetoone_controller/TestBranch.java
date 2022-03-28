package onetoone_controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone_dto.Address;
import onetoone_dto.Branch;

public class TestBranch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("omkar");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Branch b = new Branch();
		Address ad = new Address();
		b.setName("QSP");
		b.setPhoneNum(7788);
		ad.setArea("Deccan");
		ad.setPin(411010);
		ad.setState("Maharashtra");
		b.setAdd(ad);

		et.begin();
		em.persist(ad);
		em.persist(b);
		et.commit();
	}
}
