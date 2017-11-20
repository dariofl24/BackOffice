package com.app.hibernate.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.app.hibernate.dao.AbstractDao;
import com.app.hibernate.dao.CategoryDao;
import com.app.hibernate.srcs.Category;

@Repository("CategoryDao")
public class CategoryDaoImpl extends AbstractDao implements CategoryDao {

	public void saveCategory(Category category) {
		persist(category);
	}

	public List<Category> findAllCategories() {
		Criteria criteria = getSession().createCriteria(Category.class);
        return (List<Category>) criteria.list();
	}

	public void deleteById(String categoryId) {
		Query query = getSession().createSQLQuery("delete from Category where categoryId = :categoryId");
        query.setString("categoryId", categoryId);
        query.executeUpdate();
	}

	public Category findById(String categoryId) {
		Criteria criteria = getSession().createCriteria(Category.class);
        criteria.add(Restrictions.eq("categoryId",categoryId));
        return (Category) criteria.uniqueResult();
	}

	public void updateCategory(Category category) {
		this.getSession().update(category);
	}

	

}
