package com.wx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {

		System.setProperty("spring", "-user");

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext${spring}.xml");
		SysUser sysUser = (SysUser) context.getBean("sysUser");
		System.out.println(sysUser.toString());
	}
}
