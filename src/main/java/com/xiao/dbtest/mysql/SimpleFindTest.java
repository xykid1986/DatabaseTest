package com.xiao.dbtest.mysql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.PageRequest;

import com.xiao.dbtest.domain.Crime;
import com.xiao.dbtest.service.CrimeService;

public class SimpleFindTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring/mysql.xml");
		CrimeService ser = ctx.getBean("crimeService",CrimeService.class);
		for(Crime c: ser.findAll(new PageRequest(0,100)).getContent()){
			System.out.println(c);
		}
	}

}
