package comt.test;

import java.io.InputStream;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.UserDao;
import com.service.UserService;
import com.service.impl.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml"})
public class test_01 {
	
	
	@Resource
	private UserService userService=null;
	
	
	@Test
	 public void test1(){
	     System.out.println("--------");
	    System.out.println(userService.getUserById(1));
	 }
	
	 public static void main(String[] args) throws Exception {  
//	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
//	                new String[] { "spring.xml" });  
//	        context.start();  
//	        System.out.println("按任意键退出");  
//	        System.in.read(); 
		 
//		 ApplicationContext context = new ClassPathXmlApplicationContext(
//					"spring.xml");
//		 UserServiceImpl user=context.getBean(UserServiceImpl.class);
//		 System.out.println(user.getUserById(1)); 
		 
	    }  
}
