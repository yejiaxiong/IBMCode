package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.po.Student;
import com.ibm.po.User;
import com.ibm.po.UserC;
import com.ibm.po.UserP;
import com.ibm.po.UserT;
import com.ibm.po.annotation.TestObject;
import com.ibm.po.annotation.UserController;
import com.ibm.po.annotation.UserController2;
import com.ibm.po.annotation.UserRepository;
import com.ibm.po.annotation.UserService;
import com.ibm.po.aop.Calculator;
import com.ibm.po.aopxml.Calculator2;
import com.ibm.po.autowire.Address;
import com.ibm.po.autowire.Person;
import com.ibm.po.newannotation.AppConfig;
import com.ibm.po.newannotation.NewPerson;
import com.ibm.po.scope.Car;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    
	//测试通过无参构造方法来创建
	public void test(){
	   ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
	   //在执行getBean的时候, user已经创建好了 , 通过无参构造
	   User user = (User) context.getBean("user");
	   //调用对象的方法 .
	   user.show();
	}
	
	//有参构造方法来创建
	public void testT(){
		   ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		   UserT user = (UserT) context.getBean("userT");
		   user.show();
		}
	
	    //别名配置测试
		public void testTalias(){
			   ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
			   UserT user = (UserT) context.getBean("userNew");//别名获取
			   user.show();
			}
	
		
		//测试属性Bean注入
		public void testSetBean(){
		     ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextBean.xml");
		 
		     Student student = (Student) context.getBean("student");
		     student.show();
		 
		 }
		
		//数组注入
		public void testSetArray(){
		     ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextArray.xml");
		 
		     Student student = (Student) context.getBean("student");
		     student.show();
		 
		 }
		
		//List注入
		public void testSetList(){
		     ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextList.xml");
		 
		     Student student = (Student) context.getBean("student");
		     student.show();
		 
		 }
		
		//Map注入
		public void testSetMap(){
		     ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextMap.xml");
		 
		     Student student = (Student) context.getBean("student");
		     student.show();
				 
		}
		
		//All注入
		public void testSetAll(){
		     ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		     Student student = (Student) context.getBean("student");
		     student.show();
				 
		}
		
		//P命名空间注入
		public void testPName(){
		     ApplicationContext context = new ClassPathXmlApplicationContext("beansP.xml");
		 
		     UserP u = (UserP) context.getBean("user");
		     System.out.println("user Name:"+u.getName());
		     
				 
		}
		
		
		//C命名空间注入
		public void testCName(){
		     ApplicationContext context = new ClassPathXmlApplicationContext("beansC.xml");
		     UserC u = (UserC) context.getBean("user");
		     System.out.println("user Name:"+u.getName());  
				 
		}
		
		//autowireByName
		public void testAutowireByName(){
			ApplicationContext ctx =
	                new ClassPathXmlApplicationContext("applicationContext_autowire.xml");
	        Person person = (Person) ctx.getBean("person");

	        System.out.println(person);  
				 
		}
		
		//autowireByType
		public void testAutowireByType(){
			ApplicationContext ctx =
	                new ClassPathXmlApplicationContext("applicationContext_autowire.xml");
	        Person person = (Person) ctx.getBean("person2");
	        System.out.println(person);  		 
		}
		
		
		public void testRelation01(){
			ApplicationContext ctx =
	                new ClassPathXmlApplicationContext("applicationContext_relation.xml");
	        Address address = (Address) ctx.getBean("address");
	        Address address2 = (Address) ctx.getBean("address2");
	        System.out.println(address); 
	        System.out.println(address2); 	 
		}
		
		public void testRelation02(){
			ApplicationContext ctx =
	                new ClassPathXmlApplicationContext("applicationContext_relation.xml");
	        Address address3 = (Address) ctx.getBean("address3");
	        System.out.println(address3); 	 
		}
		
		public void testRelation03(){
			ApplicationContext ctx =
	                new ClassPathXmlApplicationContext("applicationContext_relation.xml");
	        Address address4 = (Address) ctx.getBean("address4");
	        System.out.println(address4); 	 
		}
		
		public void testRelation04(){
			ApplicationContext ctx =
	                new ClassPathXmlApplicationContext("applicationContext_relation.xml");
			 Person person = (Person) ctx.getBean("person");
	        System.out.println(person); 	 
		}
		
		public void testScopeSingleton(){
			 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext_scope.xml");        
			 Car car = (Car) ctx.getBean("car");        
			 Car car2 = (Car) ctx.getBean("car");        
			 System.out.println("car == car2--》" + (car == car2));        
		 	  	 
		}
		public void testScopePrototype(){
			 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext_scope.xml");        
			 Car car = (Car) ctx.getBean("car2");        
			 Car car2 = (Car) ctx.getBean("car2");        
			 System.out.println("car == car2--》" + (car == car2));        
		 	  	 
		}
		
		public void testCycle(){
			ClassPathXmlApplicationContext ctx = 
					new ClassPathXmlApplicationContext("applicationContext_cycle.xml");        
			 com.ibm.po.cycle.Car car = (com.ibm.po.cycle.Car) ctx.getBean("car");             
			 System.out.println(car);        
		 	 ctx.close();//关闭容器
		}
 
		public void testAnnotation(){
	        ApplicationContext ctx =
	                new ClassPathXmlApplicationContext("applicationContext_annotation.xml");
	        TestObject testObject = (TestObject) ctx.getBean("testObject");
	        System.out.println(testObject);
	        UserController userController = (UserController) ctx.getBean("userController");
	        System.out.println(userController);
	        UserService userService = (UserService) ctx.getBean("userService");
	        System.out.println(userService);
	        UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");
	        System.out.println(userRepository);
		}	
		
		public void testAnnotationAutowire(){
	        ApplicationContext ctx =
	                new ClassPathXmlApplicationContext("applicationContext_annotation.xml");
	        UserController2 userController = 
	        		(UserController2) ctx.getBean("userController2");
	        System.out.println(userController);
	        userController.execute();
		}
		
		public void testNewAnnotation(){
			ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
			NewPerson person = (NewPerson) ctx.getBean("newPerson");
	        System.out.println(person);
		}
		
		public void testAOP(){
			ApplicationContext ctx =
	                new ClassPathXmlApplicationContext("applicationContext_aop.xml");
	        Calculator calculator = (Calculator) ctx.getBean("calculator");
	        calculator.division(20, 4); // 测试时，将被除数换成0，可以测试@AfterReturning ， @After 和 @AfterThrowing
		}
		
		public void testAOPException(){
			ApplicationContext ctx =
	                new ClassPathXmlApplicationContext("applicationContext_aop.xml");
	        Calculator calculator = (Calculator) ctx.getBean("calculator");
	        calculator.division(20, 0); 
		}
		
		public void testAOPXml(){
			ApplicationContext ctx =
	                new ClassPathXmlApplicationContext("applicationContext_aopxml.xml");
	        Calculator2 calculator = (Calculator2) ctx.getBean("calculator");
	        calculator.division2(20, 4); 
		}


		
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
  
}
