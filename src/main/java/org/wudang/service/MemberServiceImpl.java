package org.wudang.service;

import org.wudang.dao.MemberMapper;
import org.wudang.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberServiceImpl implements MemberServiceI {

	private MemberMapper memberMapper;

	public MemberMapper getMemberMapper() {
		return memberMapper;
	}

	@Autowired
	public void setMemberMapper(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}

	@Override
	public Member getUserById(Integer id) {
		return memberMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean Login(Member member) {
		if (memberMapper.selectByLogin(member) == null)
			return false;
		return true;
	}

	@Override
	public boolean Register(Member member) {
		if (member == null)
			return false;
		try {
			if (memberMapper.insertSelective(member) == 1)
				return true;
		} catch (Exception e) {
			return false;
		}
		
		return false;
	}

}
