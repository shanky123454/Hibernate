package in.com.test;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.hibernate.query.NativeQuery;

import in.com.model.Student2;
import in.com.util.Util;

public class select4 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Session session =null;
	
	try {
		session= Util.getSession();
		if(session!=null)
		{
		 Criteria criteria = session.createCriteria(Student2.class);
		 
		 Criterion c1 = Restrictions.ge("sage",25);
		 Criterion c2 = Restrictions.le("sage",40);
		 Criterion c3 = Restrictions.between("sid", 3, 5);
		 Criterion c4 = Restrictions.in("sname", "Bajju","Maruti");
		 Criterion c5 = Restrictions.or(Restrictions.and(c1,c2),c3);
		 
		 criteria.add(c5);
		 
	    List<Object[]> list = criteria.list();
	    
	    list.forEach(row->{
	                         for (Object student2 : row) {
								System.out.println(student2);
							}
	                         System.out.println();
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
