package com.zjh.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


/**
 * @author zhongjiahua
 * @date 2021-05-16
 * @Description: 用户
 */
//@Service
public class UserServiceImpl {

	@Autowired
	private Car car;


	public void sayHi(){
		System.out.println("Hello Spring！小王");
	}

	@PostConstruct
	public void init() {
		System.err.println("UserServiceImpl 创建后应该做的事");
	}
}
