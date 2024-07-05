package com.main;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.bean.College;
import com.bean.Student;

public class Manager {
	public static void main(String[] args) {
		
		
		
		Student student1 = new Student();
		student1.setS_id(10);
		student1.setName("APJ");
		student1.setAddress("chennai");
		student1.setMarks(100);
		
		
		Configuration cfg = new Configuration();
		cfg.configure("Resoursec/hibernate.cfg.xml");
		SessionFactory session = cfg.buildSessionFactory();
		Session sess = session.openSession();
		Transaction trns = sess.beginTransaction();		
		
		sess.save(student1);
		//trns.commit();
		
		
		College college = new College();
		college.setCadd("karur");
		college.setCname("kg");
		college.setId(1001);
		sess.save(college);
		trns.commit();		
		System.out.println("done");
		
		}
}
