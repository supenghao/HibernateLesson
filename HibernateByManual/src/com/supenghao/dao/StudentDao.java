package com.supenghao.dao;

import org.hibernate.Session;

import com.supenghao.model.Student;
import com.supenghao.util.HibernateUtil;

public class StudentDao {
	
	public void saveStudents(String name){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Student student = new Student();
		student.setName(name);
		session.save(student);
		
		session.getTransaction().commit();
		
	}

}
