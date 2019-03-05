package com.hxzy.mapper;


import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.hxzy.entity.OrdersDetail;
import com.hxzy.util.SqlSessionFactoryInstance;

public class OrdersDetailMapperTest {

	@Test
	public void testFindDetailById() throws IOException {
		SqlSessionFactory factory = SqlSessionFactoryInstance.getInstance().getSqlSessionFactory();
		SqlSession session = factory.openSession();		
		OrdersDetailMapper mapper = session.getMapper(OrdersDetailMapper.class);
		OrdersDetail detail = mapper.findDetailById(1);
		System.out.println(detail);
		session.close();
	}

}
