package com.zjh.aopdemo.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="com.zjh.aopdemo.annotation")
@EnableAspectJAutoProxy
public class SpringConfiguration { }