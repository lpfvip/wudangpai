package org.wudang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.wudang.model.LoginResult;
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

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public @ResponseBody LoginResult login(@ModelAttribute("member") Member member) {
		LoginResult lr = new LoginResult();
		if (this.memberService.Login(member)) {
			lr.setError_code(0);
		} else {
			lr.setError_message("invalid_member");
			lr.setError_code(1);
		}
		return lr;

	}

	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public String register(@ModelAttribute("member") Member member) {

		if (this.memberService.Register(member))
			return "success";
		else
			return "fail";

	}
}
