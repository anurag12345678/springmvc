package com.acc.test.TestHibentateJpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmployeeTest");
	        EntityManager entityManager = factory.createEntityManager();
	        
	        entityManager.getTransaction().begin();
	         
	        Employee newEmp = new Employee();
	        newEmp.setEmail("Anurag.Singh@gmail.com");
	        newEmp.setFname("Anurag Singh");
	        newEmp.setId(103);
	        
	         
	        entityManager.persist(newEmp);
	         
	        entityManager.getTransaction().commit();
	         
	        entityManager.close();
	        factory.close();
	}

}
