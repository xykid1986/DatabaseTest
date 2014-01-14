package com.xiao.dbtest.mongodb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.xiao.dbtest.domain.Similarity;
import com.xiao.dbtest.service.SimilarityService;

public class ImportDataFromMySQL {

	public static void main(String[] args) {
		ApplicationContext mysqlCtx = new ClassPathXmlApplicationContext("classpath:/spring/mysql.xml");
		AbstractApplicationContext mongoCtx = new ClassPathXmlApplicationContext("classpath:/spring/mongo.xml");
		
		SimilarityService mongoSer = mongoCtx.getBean("similarityService",SimilarityService.class);
		SimilarityService mysqlSer = mysqlCtx.getBean("similarityService",SimilarityService.class);
		
		int pageNum = 0;
		int pageSize = 10000;
		/*
		while(true){
			Page<Crime> current = mysqlSer.findAll(new PageRequest(pageNum, pageSize));
			if(pageNum<=current.getTotalPages()){
				mongoSer.save(current);
			}else{
				break;
			}
			pageNum++;
		}
		*/
		while(true){
			Page<Similarity> current = mysqlSer.findAll(new PageRequest(pageNum, pageSize));
			if(pageNum<=current.getTotalPages()){
				mongoSer.save(current);
			}else{
				break;
			}
			pageNum++;
			System.out.println("Finishing: "+pageNum/((double)current.getTotalPages())*100+"%");
		}
		System.out.println("End");
	}

}
