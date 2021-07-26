package com.zjh.aopdemo.annotation;

import com.zjh.aopdemo.annotation.config.SpringConfiguration;
import com.zjh.aopdemo.annotation.service.MyCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationAop {

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(SpringConfiguration.class);
        ac.refresh();
        MyCalculator bean = ac.getBean(MyCalculator.class);
		Integer result = bean.add(1, 1);
		System.out.println(result);
    }
}
