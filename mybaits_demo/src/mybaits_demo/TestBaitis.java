package mybaits_demo;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import hd.User;


public class TestBaitis {
	public static void main(String[] args) throws IOException
	{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory =
		  new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession session = sqlSessionFactory.openSession();
		try {
			mybaits_demo.User user = session.selectOne(
		    "selectUser", 0);
			
			System.out.print(user.getAddress());
			
			
			User user1 = new User("Sky","333","409169399@qq.com","batis");
			
			session.insert("insert",user1);
			
			session.commit();
			
		} finally {
		  session.close();
		}
	}

}
