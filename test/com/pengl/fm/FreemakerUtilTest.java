package com.pengl.fm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class FreemakerUtilTest {
	private FreemarkerUtil freemarkerUtil = null;
	@Before
	public void before() {
		freemarkerUtil = new FreemarkerUtil();
	}
	
	@Test
	public void test01(){
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("username","xuanxin");
		freemarkerUtil.print("01.ftl", model);
	}
	
	@Test
	public void test02(){
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("username","xuanxin");
		freemarkerUtil.print("02.ftl", model);
	}
	
	@Test
	public void test03(){
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("user",new User(1, "xuanxin", 24));
		freemarkerUtil.print("03.ftl", model);
	}
	
	@Test
	public void test04(){
		Map<String,Object> model = new HashMap<String,Object>();
		List<User> users = new ArrayList<User>();
		User user1 = new User(1,"Abbey",24);
		User user2 = new User(2,"Banana",34);
		User user3 = new User(3,"Shebby",44);
		User user4 = new User(4,"Orange",54);
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		model.put("users",users);
		freemarkerUtil.print("04.ftl", model);
	}
	
	@Test
	public void test05(){
		Map<String,Object> model = new HashMap<String,Object>();
		User user1 = new User(1,"Abbey",24);
		model.put("user",user1);
		freemarkerUtil.print("06.ftl", model);
	}

	@Test
	public void test06(){
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("upcase",new UpperCaseTransform());
		freemarkerUtil.print("07.ftl", model);
	}
}
