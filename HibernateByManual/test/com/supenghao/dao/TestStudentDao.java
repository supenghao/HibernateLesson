package com.supenghao.dao;

import org.junit.Test;

public class TestStudentDao {
	
	@Test
	public void testSave() {
		StudentDao dao = new StudentDao();
		dao.saveStudents("manman");
		
	}

}
