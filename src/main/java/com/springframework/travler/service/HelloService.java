package com.springframework.travler.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springframework.travler.models.Employees;

@Service
public class HelloService {

	@Autowired
	private SqlSession sqlSession;
	
	public List<Employees> list() {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("P_FIRST_NAME", "Patricio");
		return sqlSession.selectList("employees.list", parameters);
	}
}
