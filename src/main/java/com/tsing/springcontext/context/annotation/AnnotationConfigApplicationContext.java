package com.tsing.springcontext.context.annotation;

import com.tsing.springcontext.context.support.GenericApplicationContext;

public class AnnotationConfigApplicationContext extends GenericApplicationContext {

    public AnnotationConfigApplicationContext() {
        System.out.println("空参构造");
    }

    public AnnotationConfigApplicationContext(Class<?>... componentClasses) {
        this(); //调用空参构造
//        register(componentClasses);
        refresh();
    }

}
