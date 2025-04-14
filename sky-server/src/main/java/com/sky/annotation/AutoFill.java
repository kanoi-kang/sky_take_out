package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解：用于标识某个方法需要进行功能字段自动填充处理
 */
@Target(ElementType.METHOD)//是 @Target 注解的一个参数值，表示自定义注解只能用于方法上。
@Retention(RetentionPolicy.RUNTIME)//是 @Retention 注解的一个参数值，表示自定义注解在运行时也保留，可以通过反射机制读取。
public @interface AutoFill {
    //数据库操作类型：UPDATE INSERT
    OperationType value();

}
