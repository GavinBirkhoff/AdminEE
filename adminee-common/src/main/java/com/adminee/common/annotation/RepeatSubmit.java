package com.adminee.common.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解防止表单重复提交
 * 
 * @author gavin
 *
 */
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RepeatSubmit
{

}
