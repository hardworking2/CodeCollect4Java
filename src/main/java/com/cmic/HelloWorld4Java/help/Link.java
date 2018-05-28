package com.cmic.HelloWorld4Java.help;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 当前该注解标识文件或网页链接，主要是为了解析知识的意义
 */
@Retention(RetentionPolicy.SOURCE) // 注解仅存在于源码中，在class字节码文件中不包含
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.TYPE }) // 定义注解的作用目标**作用范围字段、枚举的常量/方法
@Documented // 说明该注解将被包含在文档中
public @interface Link {

	String link2Where() default "";

	String link4What() default "";
}
