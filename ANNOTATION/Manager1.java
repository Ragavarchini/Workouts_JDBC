package com.main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.dev1.Product;

public class Manager1 {
public static void main(String[] args) {
	AnnotationConfiguration acfg = new AnnotationConfiguration();
	acfg.configure("Resoursec/hibernate.cfg.xml");
	SessionFactory sf = acfg.buildSessionFactory();
	Session session = sf.openSession();
   Transaction tnx=	session.beginTransaction();
   //
	
   Product product = new Product();
   product.setPid(1);
   product.setPname("baby products");
   product.setQty(3);
   session.save(product);
   tnx.commit();
	System.out.println("Done");
}
}
