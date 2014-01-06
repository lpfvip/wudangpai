package org.wudang.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wudang.model.Member;
import org.wudang.service.MemberServiceI;


@Controller
public class MemberController {

	private MemberServiceI memberService;
	
	public MemberServiceI getMemberService() {
		return memberService;
	}
	@Autowired
	public void setMemberService(MemberServiceI memberService) {
		this.memberService = memberService;
	}

	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public String login(@ModelAttribute("member") Member member ){
		
		if(this.memberService.Login(member)) return "success";
		else return "fail";
		
	}
}
