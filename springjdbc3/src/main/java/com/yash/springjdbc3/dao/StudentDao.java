package com.yash.springjdbc3.dao;

import java.util.List;

import springjdbc3.entities.Student;

public interface StudentDao {
	public int insert(Student stu);
	public int updatedetails(Student stu);
	public int deletedetails(int stuid);
	public Student selectDetails(int stuid);
	public List<Student> getAllDetails();
}
