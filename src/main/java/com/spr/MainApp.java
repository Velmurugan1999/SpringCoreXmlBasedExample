package com.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("AppCon.xml");
		MessageCls obj=(MessageCls)context.getBean("hellomsg");
		String msg=obj.getMessage();
		System.out.println("The message is: "+msg);
		Student stud1=(Student) context.getBean("student1");
		Student stud2=(Student) context.getBean("student2");
		System.out.println(stud1);
		System.out.println(stud2);
		//Singleton Scope
		ApplicationContext context1=new ClassPathXmlApplicationContext("SingletonContext.xml");
		MessageCls mobj=(MessageCls) context1.getBean("msg1");
		System.err.println("\n"+mobj.getMessage());
		Teacher t1=(Teacher) context1.getBean("teacher");
		t1.setId(12);
		t1.setDepartment("IT");
		t1.setName("Vimal");
		Teacher t2=(Teacher) context1.getBean("teacher");
		t2.setName("Kavin");
		t2.setDepartment("ECE");
		System.out.println(t1);
		System.out.println(t2);
		
		
		//Prototype scope
		MessageCls mobj2=(MessageCls) context1.getBean("msg2");
		System.err.println("\n"+mobj2.getMessage());
		Teacher t3=(Teacher) context1.getBean("teacher2");
		t3.setId(55);
		t3.setDepartment("Mechanical");
		t3.setName("Kumar");
		Teacher t4=(Teacher) context1.getBean("teacher2");
		t4.setId(77);
		t4.setName("Ashoke");
		t4.setDepartment("CSE");
		System.out.println(t3);
		System.out.println(t4);
		
		
		System.out.println("Contructor based injection !!!!!!!!!!!!!!!!!!!!!!!!!");
		ApplicationContext context2=new ClassPathXmlApplicationContext("ConstructDI.xml");
		Student cObj=(Student)context2.getBean("student1");
		System.out.println(cObj);
		((AbstractApplicationContext) context).registerShutdownHook();
		((AbstractApplicationContext) context1).registerShutdownHook();
		((AbstractApplicationContext) context2).registerShutdownHook();
	}

}
