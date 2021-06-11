package com.springcore.new_project_1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory factory= new Configuration().configure("/com/springcore/new_project_1/hibernate.cfg.xml").buildSessionFactory();
        //System.out.println(factory);
        CompanyEntity company=new CompanyEntity();
        company.setBoard_of_directors("sunder roni");
        company.setBrief_writeup("this is very good company");
        company.setCEO("tim");
        company.setName("apple");
       // company.se
        company.setTurnover(5000000);
        System.out.println(company);
        Session session = factory.openSession();
        Transaction tx= session.beginTransaction();
        session.save(company);
         tx.commit();
        
        session.close();

    }
}
