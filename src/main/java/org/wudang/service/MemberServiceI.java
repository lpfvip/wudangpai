package org.wudang.service;

import org.wudang.dao.MemberMapper;
import org.wudang.model.Member;



public interface MemberServiceI {
	public Member getUserById(Integer id);
	public boolean Login(Member member);
	public boolean Register(Member member);
}
