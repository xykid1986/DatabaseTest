package com.xiao.dbtest.mongodb;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.xiao.dbtest.domain.Product;
import com.xiao.dbtest.service.ProductService;

public class SimpleTest {

	public static void main(String[] args) {
		Product p = new Product("nexus",100);
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring/mongo.xml");
		
		MongoTemplate tem = ctx.getBean("mongoTemplate",MongoTemplate.class);
		//tem.save(p);
		//ctx.destroy();
		
		ProductService ser = ctx.getBean("productService",ProductService.class);
		//ser.save(p);
		Page<Product> page = ser.findAll(new PageRequest(0,20));
		for(Product product: page.getContent()){
			System.out.println(product.getName()+" :"+product.getPrice());
		}
	}

}
