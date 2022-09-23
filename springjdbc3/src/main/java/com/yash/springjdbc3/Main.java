package com.yash.springjdbc3;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springjdbc3.dao.StudentDao;

import springjdbc3.entities.Student;

public class Main {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/yash/springjdbc3/applicationcontext.xml");
        		StudentDao stdao=context.getBean("StudentDao",StudentDao.class);
        	
        		//Student s=new Student(); 
        		//s.setId(107);
        		//s.setName("Nishi Tawde");
        		//int r=stdao.insert(s);//insert the details
        		//int r=stdao.updatedetails(s);/update the details
        		//System.out.println(r + "Student added Successfully ");
        		//System.out.println(r + "Student details updated ");
        		//int r=stdao.deletedetails(104);//delete the details
        		//Student s=stdao.selectDetails(108);
        		//System.out.println(s);
        		List<Student> stu=stdao.getAllDetails();
        		for(Student s:stu)
        		{
        			System.out.println(s);
        		}
    }
}
