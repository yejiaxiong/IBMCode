package com.ibm.demo.config;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.ibm.demo.model.Cattle;

@Component
@PropertySource(value = { "classpath:yjx.yml" }, factory = PropertySourceFactory.class)
@ConfigurationProperties(prefix = "person")
public class YmlPerson {
	private String lastName;
	private String sex;
	private Integer age;
	private Date birth;
	private Map<String, String> map;
	private List<Object> list;
	private Cattle cattle;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public Cattle getCattle() {
		return cattle;
	}

	public void setCattle(Cattle cattle) {
		this.cattle = cattle;
	}

}
