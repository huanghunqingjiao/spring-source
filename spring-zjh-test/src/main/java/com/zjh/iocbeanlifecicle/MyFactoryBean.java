package com.zjh.iocbeanlifecicle;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author zhongjiahua
 * @date 2021-06-07
 * @Description:
 */
public class MyFactoryBean implements FactoryBean<Car> {
	@Override
	public Car getObject() throws Exception {
		return new Car();
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}
}
