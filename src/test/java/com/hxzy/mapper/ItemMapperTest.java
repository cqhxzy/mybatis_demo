package com.hxzy.mapper;


import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.hxzy.entity.Item;
import com.hxzy.util.SqlSessionFactoryInstance;

public class ItemMapperTest {

	@Test
	public void testFindItemById() throws IOException {
		SqlSessionFactory factory = SqlSessionFactoryInstance.getInstance().getSqlSessionFactory();
		SqlSession session = factory.openSession();
		ItemMapper mapper = session.getMapper(ItemMapper.class);
		Item item = mapper.findItemById(1);
		System.out.println(item);
		session.close();
	
	}

}
