package Test;

import javax.annotation.Resource;

import cn.lishaoran.service.UserService;

public class Test {
	@Resource(name="userService")
	static
	UserService userService;
	public static void main(String[] args) {
		int a=userService.userCount();
		System.out.println(a);
	}
}
