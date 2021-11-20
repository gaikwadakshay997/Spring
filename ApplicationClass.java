package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationClass {

	public static void main(String[] args) 
	{
		try
		{
			ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
			
			Actor act = (Actor)ac.getBean("actr");
			
			act.display();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
