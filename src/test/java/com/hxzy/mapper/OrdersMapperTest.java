package com.hxzy.mapper;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Ignore;
import org.junit.Test;

import com.hxzy.entity.Orders;
import com.hxzy.entity.OrdersDetail;

public class OrdersMapperTest {

	@Test
	@Ignore
	public void testQueryAll() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		
		OrdersMapper mapper = session.getMapper(OrdersMapper.class);
		
		/*List<Orders> list = mapper.queryAllLazy();
		
		for (Orders o : list) {
			System.out.println(o);
		}*/
		
		Orders queryOne = mapper.queryOne(1);
		System.out.println(queryOne);
		
		session.close();
	}
	
	@Test
	public void testQueryDetailByuserId() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		
		OrdersMapper mapper = session.getMapper(OrdersMapper.class);
		
		List<Orders> list = mapper.queryDetailByuserId(1);
		for (Orders orders : list) {
			System.out.println(orders.getUser());
			System.out.println("¶©µ¥Ö÷¼ü£º" + orders.getId() + "¶©µ¥±àºÅ£º" + orders.getNumber());
			List<OrdersDetail> details = orders.getDetails();
			details.stream().forEach(System.out::println);
			System.out.println("\n\n\n");
		}
		session.close();
		
	}

}
