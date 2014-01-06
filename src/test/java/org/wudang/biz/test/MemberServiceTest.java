package org.wudang.biz.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wudang.model.Member;
import org.wudang.service.MemberServiceI;

import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class MemberServiceTest {
	private static final Logger logger = Logger.getLogger(MemberServiceTest.class);
	private MemberServiceI memberService;

	public MemberServiceI getMemberService() {
		return memberService;
	}
	@Autowired
	public void setMemberService(MemberServiceI memberService) {
		this.memberService = memberService;
	}
	
	@Test
	public void test1() {
		Member m = memberService.getUserById(1);
		logger.info(JSON.toJSONStringWithDateFormat(m, "yyyy-MM-dd HH:mm:ss"));
	}
	
	@Test
	public void testLogin(){
		Member m=new Member();
		m.setUsername("petrie");
		m.setPassword("123123");
		boolean result=memberService.Login(m);
		logger.info(JSON.toJSONStringWithDateFormat(result, "yyyy-MM-dd HH:mm:ss"));
	}
	
	
	public void testRegister(){
		Member m=new Member();
		m.setUsername("ruirui");
		m.setPassword("123123");
		boolean result=memberService.Register(m);
		logger.info(JSON.toJSONStringWithDateFormat(result, "yyyy-MM-dd HH:mm:ss"));
	}
}
