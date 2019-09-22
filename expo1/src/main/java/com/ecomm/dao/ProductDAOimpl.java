package com.ecomm.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.model.Product;
import com.ecomm.model.Supplier;

@Repository("ProductDAO")
@Transactional
public class ProductDAOimpl implements ProductDAO 
{

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(product);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(product);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(product);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Product");
		List<Product> listProducts=query.list();
		session.close();
		return listProducts;
	}

	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Product product=(Product) session.get(Product.class, productId);
		session.close();
		return product;
	
	}

	public List<Product> listProductsCategoryWise(int categoryId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Category where categoryId :=catid");
		query.setParameter("catid",categoryId);
		List<Product> listProducts=query.list();
		session.close();
		return listProducts;
	}

}