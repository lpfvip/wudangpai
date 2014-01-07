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
import org.wudang.model.ResultObject;
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
	public @ResponseBody ResultObject login(@ModelAttribute("member") Member member) {
		ResultObject ro = new ResultObject();
		if (this.memberService.Login(member)) {
			ro.setError_code(0);
		} else {
			ro.setError_message("invalid_member");
			ro.setError_code(1);
		}
		return ro;
	}

	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public @ResponseBody ResultObject register(@ModelAttribute("member") Member member) {
		ResultObject ro = new ResultObject();
		if (this.memberService.Register(member)){
			ro.setError_code(0);
		}
		else{
			ro.setError_message("exist username");
			ro.setError_code(1);
		}
		return ro;
	}
}
