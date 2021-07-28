package com.zjh.tx.annotation;

import com.zjh.tx.annotation.config.TransactionConfig;
import com.zjh.tx.annotation.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

public class TransactionTest {
	/**
	 * 如果外层方法中包含事务，内层方法是否支持当前事务
	 * 		支持外层事务
	 * 			required：使用当前事务，如果没有，创建一个（默认）
	 * 			supports：如果有，就使用当前事务，如果没有，就不用事务了
	 * 			mandatory：使用当前事务，如果没有的话，就抛异常
	 * 		不支持外层事务
	 * 			required_new：如果存在事务，将事务挂起，自己新建一个
	 * 			not_supports：不需要事务，如果存在就挂起它
	 * 			never：不要事务，如果存在事务就抛异常
	 * 		nested(嵌套)：如果有事务在运行，当前的方法就应该在这个事务的嵌套事务内运行，
	 * 				否则，就启动一个新的事务，并在它自己的事务内运行
	 *
	 * Transactional注解具体的执行方法在 {@link TransactionAspectSupport#invokeWithinTransaction(java.lang.reflect.Method, java.lang.Class, org.springframework.transaction.interceptor.TransactionAspectSupport.InvocationCallback)}
	 *
	 *
	 * @param args
	 */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(TransactionConfig.class);
        applicationContext.refresh();
        BookService bean = applicationContext.getBean(BookService.class);
        bean.checkout("zhangsan",1);
    }
}
