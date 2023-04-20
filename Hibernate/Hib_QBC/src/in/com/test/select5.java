package in.com.test;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import in.com.model.Student2;
import in.com.util.Util;

public class select5 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Session session =null;
		
		
		
	
	try {
		session= Util.getSession();
		if(session!=null)
		{
		 Criteria criteria = session.createCriteria(Student2.class);
		 
	     Criterion c5= Restrictions.eq("sname", "Maruti");
		 
		 criteria.add(c5);
		 
		 ProjectionList list1 = Projections.projectionList();
		 list1.add(Projections.property("sage"));
		 list1.add(Projections.property("sname"));
		 
		 criteria.setProjection(list1);
//		 
//		 List<Integer> list = criteria.list();
//		 
//		 list.forEach(System.out::println);
		 
   List<Object[]> list = criteria.list();
    
    list.forEach(row->{
                         for (Object student2 : row) {
							System.out.println(student2);
						}


                    System.out.println("ajit");
			
	    
	    
	    
	     System.out.println("shanky");
	   
	    
	    System.out.println("tanya");


	    
	    System.out.println("madhu");


	System.out.println("mitthu");


	    
	 
	
	    System.out.println("mamu");


                     }
    		);
		 }		
	}catch(Exception e)
	{
		e.printStackTrace();
	}finally {
	Util.closeSession(session);
	Util.closeSessionFactory();
	
	}
}
}
