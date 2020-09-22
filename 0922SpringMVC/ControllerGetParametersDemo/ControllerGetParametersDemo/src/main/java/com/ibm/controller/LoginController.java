package com.ibm.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.pojo.User;
import com.ibm.vo.UserVO;
@Controller
public class LoginController {
	    // 通过 HttpServletRequest 和 HttpServletResponse 以及 HTTPSession 来获取请求中的参数
		@RequestMapping("/login")
		public void getParamByReq(HttpServletRequest request, HttpServletResponse response) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			System.out.println("method1-----");
			System.out.println(username);
			System.out.println(password);
		}
		
		 // 通过简单的数据类型来获取请求中的参数
		@RequestMapping("/testBySimple")
		public void getParamBySimple(String username, String password) {
			System.out.println("method2-----");
			System.out.println(username);
			System.out.println(password);
		}
		
		//通过简单的pojo类来接收参数
		@RequestMapping("/testByPojo")
		public void getParamByPojo(User user) {
			System.out.println("method3-----");
			System.out.println(user.getUsername());
			System.out.println(user.getPassword());
		}
		
		// 通过包装类来获取页面信息
		@RequestMapping("/saveUserVO")
		public String saveUserVO(UserVO userVO) {
			System.out.println("method4-----");
			System.out.println("name:"+userVO.getUser().getUsername());
			System.out.println("age:"+userVO.getUser().getAge());
			return "userEdit";
		}
		
		//通过集合类型获取 根据用户id数组批量删除用户
		@RequestMapping("/batchDelUser")
		public String batchDelUser(Integer[] userId) {
			
			for (int i = 0; i < userId.length; i++) {
				System.out.println(userId[i]);
			}
			
			return "userList";
		}

}
