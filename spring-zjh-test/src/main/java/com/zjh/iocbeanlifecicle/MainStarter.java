package com.zjh.iocbeanlifecicle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xsls on 2019/8/15.
 */
public class MainStarter {

	public static void main(String[] args) {
		// 加载spring上下文
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		// 循环依赖
		Object bean = context.getBean("a");
		System.err.println(bean);
		bean = context.getBean("b");
		System.err.println(bean);

//		Car bean = context.getBean(Car.class);
//		System.err.println(bean);
//		Tank tank = context.getBean(Tank.class);
//		System.err.println(tank);

//		Car car = (Car) context.getBean("car");
//		System.out.println(car.getName());
//		MyBeanFactoryPostProcessor bean = context.getBean(MyBeanFactoryPostProcessor.class);
//		System.err.println(bean);
//		Object myFactoryBean = context.getBean("myFactoryBean");
//		System.err.println(myFactoryBean.getClass());
	}







	/*public static void main(String[] args) {
		List<Tank> list=new ArrayList<>();
		Tank tank2=new Tank();
		tank2.setName("坦克2号");
		tank2.setIndex(2);
		list.add(tank2);

		Tank tank=new Tank();
		tank.setName("坦克1号");
		tank.setIndex(1);
		list.add(tank);

		*//*list.sort((o1, o2) -> {
			return Integer.compare(o1.getIndex(), o2.getIndex());
		});*//*

		list.forEach(tank1 -> System.out.println(tank1.getIndex()));
	}*/
}
