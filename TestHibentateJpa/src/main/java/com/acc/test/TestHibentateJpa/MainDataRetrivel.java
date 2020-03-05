package com.acc.test.TestHibentateJpa;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

public class MainDataRetrivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration conf=new Configuration().configure();
		SessionFactory sf=(SessionFactory) conf.buildSessionFactory();
		Session session=((org.hibernate.SessionFactory) sf).openSession();
		Transaction tx=(Transaction) session.beginTransaction();
		
		Employee emp=(Employee)session.load(Employee.class, 101);
		System.out.println(emp);
	}

}
