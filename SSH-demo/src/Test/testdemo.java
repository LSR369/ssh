package Test;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import cn.lishaoran.service.UserService;
@ContextConfiguration(locations = { "classpath*:/spring*.xml"})
//@ContextConfiguration(locations = {
//"classpath*:/conf/applicationContext*.xml",
//"classpath*:/META-INF/*-service-reference.xml" })


public class testdemo {
//	@Resource(name="userService")
//	private UserService userService;
	
	@Test
	public void test() {
		UserService userService=new UserService();
		int a=userService.userCount();
		System.out.println(a);
	}

}
