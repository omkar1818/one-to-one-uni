package onetoone_controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import onetoone_dto.Address;
import onetoone_dto.Branch;

public class TestGetBranch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("omkar");
		EntityManager em = emf.createEntityManager();

		Branch b = em.find(Branch.class, 8);
		// it will return branch object in the branch object we also have address
		// object so thats why we are able to get the data of the object
		// with the help of getter method we get address object.
		Address ad = b.getAdd();

		display(ad, b);
	}

	static void display(Address ad, Branch b) {
		System.out.println("Branch Name : " + b.getName());
		System.out.println("Branch phone number : " + b.getPhoneNum());
		System.out.println("Branch Address");
		System.out.println("Area : " + ad.getArea());
		System.out.println("Pin code : " + ad.getPin());
		System.out.println("State : " + ad.getState());
	}
}
