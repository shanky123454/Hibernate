package in.com.test;

import org.hibernate.Session;

import org.hibernate.Transaction;

import in.com.model.Student2;
import in.com.util.Util;

public class insert{

	public static void main(String[] args) {
		Session session =null;
		Transaction transaction = null;
		Integer id =null;
	try {
		session= Util.getSession();
	
		Student2 s1 = new Student2();
		s1.setAge(55);
		s1.setSaddress("bokaro");
		s1.setSid(6);
		s1.setSname("chutiya jitendra");
		
		
		Student2 s2 = new Student2();
		s1.setAge(50);
		s1.setSaddress("delhi");
		s1.setSid(7);
		s1.setSname("mahendra");
	
		
		transaction= session.beginTransaction();
  
	     id =  (Integer) session.save(s1); 
	     id =  (Integer) session.save(s2); 
	 
	     System.out.println(id);

	}catch(Exception e)
	{
		e.printStackTrace();
	}finally {
		if(id!=null)
		{
			 transaction.commit();
		}
		else{
			transaction.rollback();
		}
	Util.closeSession(session);
	Util.closeSessionFactory();
	
	}
}
}
