package com.zjh.bean;

import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author zhongjiahua
 * @date 2021-06-07
 * @Description:
 */
@Component
public class MyFactoryBean implements SmartFactoryBean<com.zjh.bean.Car> {
	@Override
	public com.zjh.bean.Car getObject() throws Exception {
		return new com.zjh.bean.Car();
	}

	@Override
	public Class<?> getObjectType() {
		return com.zjh.bean.Car.class;
	}

	@Override
	public boolean isEagerInit() {
		return true;
	}
}
