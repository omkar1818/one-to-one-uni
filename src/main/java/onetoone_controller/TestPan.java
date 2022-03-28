package onetoone_controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone_dto.Pan;
import onetoone_dto.Person;

public class TestPan {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("omkar");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Pan pan = new Pan();
		Person p = new Person();
		p.setGender('M');
		p.setName("ABCD");
		p.setPhone(5566);
		pan.setP(p);
		pan.setCountry("India");
		pan.setPanNum("XYZ1234");

		et.begin();
		em.persist(p);
		em.persist(pan);
		et.commit();
	}

}
