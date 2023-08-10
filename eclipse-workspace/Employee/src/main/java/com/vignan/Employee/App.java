package com.vignan.Employee;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Scanner sc = new Scanner(System.in);
        int a,id;
        String fname,lname;
        System.out.println("Enter no of people");
        a=sc.nextInt();		
        for(int i=0;i<a;i++) {
        System.out.println("Enter id");	
        id = sc.nextInt();
        System.out.println("Enter fname");	
        fname = sc.next();
        System.out.println("Enter lname");	
        lname = sc.next();
        Employee e1 = new Employee(id, fname, lname);
		System.out.println(e1);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.persist(e1);
		tx.commit();
        }
		factory.close(); 
	}
}
