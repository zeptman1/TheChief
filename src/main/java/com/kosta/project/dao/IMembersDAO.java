package com.kosta.project.dao;

import org.apache.ibatis.annotations.Param;

import com.kosta.project.dto.MembersDTO;
import com.kosta.project.dto.RoleDTO;

public interface IMembersDAO {
	// 회원가입
	public void insert(MembersDTO mdto);
	// role table에 insert(id랑 권한 insert)
	public void insertRole(RoleDTO dto);
	//id check
	public String checkId(@Param("_name") String name, @Param("_email") String email);
	//아이디 얻어오기
	public int getUserid(String id);
}
