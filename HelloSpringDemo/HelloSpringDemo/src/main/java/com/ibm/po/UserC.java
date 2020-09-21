package com.ibm.po;
public class UserC {
	private String name;
    private int age;   
//    public UserC(String name,int age) {   //先注释后测试报错后 放开测试即可
//    	this.name=name;
//    	this.age=age;
//    }         
    public void setName(String name) {
        this.name = name;
   }
    public void setAge(int age) {
        this.age = age;
   }
    public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
   }
}
