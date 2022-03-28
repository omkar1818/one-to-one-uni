package onetoone_controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import onetoone_dto.Pan;
import onetoone_dto.Person;

public class TestGetPan {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("omkar");
		EntityManager em = emf.createEntityManager();

		Pan p = em.find(Pan.class, 1);
		Person p1 = p.getP();

		System.out.println("Pan number : " + p.getPanNum());
		System.out.println("Pan issued date : " + p.getDate());
		System.out.println("Pan issued country : " + p.getCountry());
		System.out.println("Person to whome it issued : " + p1.getName());
		System.out.println("Gender  : " + p1.getGender());
		System.out.println("Contact number of the person " + p1.getPhone());
	}

}
