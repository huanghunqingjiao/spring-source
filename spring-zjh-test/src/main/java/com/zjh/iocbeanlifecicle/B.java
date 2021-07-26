package com.zjh.iocbeanlifecicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhongjiahua
 * @date 2021-07-19
 * @Description:
 */
@Component
public class B {
	@Autowired
	private A a;
}
