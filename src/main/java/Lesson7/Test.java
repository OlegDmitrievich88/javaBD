package Lesson7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //во время выполнения кода (когла выполняется)
@Target(ElementType.METHOD)     //относится к методу (к чему относится)
public @interface Test {       //сделал аннотацию тест
    int priority() default 5;   //для приоритета (дефолтный приоритет 5)
}
