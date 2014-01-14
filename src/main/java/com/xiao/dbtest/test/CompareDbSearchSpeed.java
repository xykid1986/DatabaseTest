package com.xiao.dbtest.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.xiao.dbtest.service.SimilarityService;


/**
 * The result indicates that Mongodb does a better job in case of index searching, including returning all documents.
 * Mysql does a better job at field searching, no matter exact or fuzzy.  
 * @author yi
 *
 */
public class CompareDbSearchSpeed {

	public static void main(String[] args) {
		ApplicationContext mysqlCtx = new ClassPathXmlApplicationContext("classpath:/spring/mysql.xml");
		AbstractApplicationContext mongoCtx = new ClassPathXmlApplicationContext("classpath:/spring/mongo.xml");
		
		SimilarityService mongoSer = mongoCtx.getBean("similarityService",SimilarityService.class);
		SimilarityService mysqlSer = mysqlCtx.getBean("similarityService",SimilarityService.class);

		String test1 = "Find mongo: ";
		String test2 = "Find mysql: ";
		String requestId = "01232009.022250.866.AX";
		Pageable page = new PageRequest(0,100);
		
		long start = System.currentTimeMillis();
		mongoSer.findByRequestIdStartingWith(requestId, page);//1400ms
		//mongoSer.findById(100);//45ms
		//mongoSer.findAll(page);//80ms
		//mongoSer.findByRequestId(requestId, page);//1447ms
		System.out.println(test1+" used "+(System.currentTimeMillis()-start)+" milliseconds");
		
		start = System.currentTimeMillis();
		mysqlSer.findByRequestIdStartingWith(requestId, page);//233ms
		//mysqlSer.findById(100);//114ms
		//mysqlSer.findAll(page);//1400ms
		//mysqlSer.findByRequestId(requestId, page);//217ms
		System.out.println(test2+" used "+(System.currentTimeMillis()-start)+" milliseconds");
	}

}
