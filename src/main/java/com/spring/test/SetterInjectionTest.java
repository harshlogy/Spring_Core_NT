package com.spring.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.spring.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		FileSystemResource resource = new FileSystemResource("com/spring/cfgs/applicationContext.xml");
		
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		
		Object object = factory.getBean("wmg");
		
		WishMessageGenerator generator = (WishMessageGenerator)object;
		
		String msg = generator.generateMessage("Akshay");
	}

}
