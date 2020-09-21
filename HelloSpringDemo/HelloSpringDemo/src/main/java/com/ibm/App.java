package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.po.Hello;
import com.ibm.po.Hello1;

public class App {
	public static void main(String[] args) {
		// 解析beans.xml文件 , 生成管理相应的Bean对象
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// getBean : 参数即为spring配置文件中bean的id .
		Hello hello = (Hello) context.getBean("helloh");
		hello.show();

		ApplicationContext context1 = new ClassPathXmlApplicationContext("beansCopy.xml");
		// getBean : 参数即为spring配置文件中bean的id .
		Hello1 hello1 = (Hello1) context.getBean("hellobean");
		hello1.show();

	}
}
