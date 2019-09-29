package hibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ecomm.model.Category;

public class hibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Category user=new Category(); 
     user.setCategoryId(1);
     user.setCategoryName("first Check");
     SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
     Session session = sessionFactory.openSession();
     session.beginTransaction();
     session.save(user);
     session.getTransaction().commit();
	}

}
