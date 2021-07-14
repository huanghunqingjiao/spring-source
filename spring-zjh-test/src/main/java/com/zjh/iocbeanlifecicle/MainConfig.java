package com.zjh.iocbeanlifecicle;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xsls on 2019/8/15.
 */
@Configuration
@ComponentScan(basePackages = {"com.zjh.iocbeanlifecicle"})
        //excludeFilters={@ComponentScan.Filter(type=FilterType.ANNOTATION,value={Controller.class})})

public class MainConfig {

//	public static void main(String[] args) {
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(com.zjh.event.MainConfig.class);
//
//		Car bean = ctx.getBean(Car.class);
//		System.err.println(bean);
//	}

    /*@Bean("car")
    public Car car(){

        Car car = new Car();
        car.setName("xushu");
        car.setTank(tank());
        // 如果不去ioc 容器中拿   是不是每次都会创建新的
        // 都会先根据方法名  getBean("car")
        return car;
    }

    @Bean
    public Tank tank(){
        return new Tank();
    }*/
}
