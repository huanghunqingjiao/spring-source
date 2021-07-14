package com.zjh.start;

import com.zjh.bean.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhongjiahua
 * @date 2021-05-16
 * @Description: 开始
 */
@Configuration
@ComponentScan(value = "com.zjh.bean")
public class MainStart {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainStart.class);
		UserServiceImpl bean = applicationContext.getBean(UserServiceImpl.class);
		bean.sayHi();
//		Object myFactoryBean = applicationContext.getBean("myFactoryBean");
//		System.err.println(myFactoryBean.getClass());

//		System.err.println("...");

		// 自定义cglib
//		Enhancer enhancer = new Enhancer();
//		enhancer.setSuperclass(UserServiceImpl.class);
//		enhancer.setUseFactory(false);
////		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
//		MethodInterceptor proxy = new MethodInterceptor() {
//			@Override
//			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//				System.err.println("proxy");
//
//				return methodProxy.invokeSuper(o, objects);
//			}
//		};
//		enhancer.setCallbackType(proxy.getClass());
//		enhancer.setCallback(proxy);
//		UserServiceImpl o = null;
//		o = (UserServiceImpl) enhancer.create();
//		o.sayHi();
	}

//	@Bean
//	public UserServiceImpl userService() {
//		return new UserServiceImpl();
//	}
}
