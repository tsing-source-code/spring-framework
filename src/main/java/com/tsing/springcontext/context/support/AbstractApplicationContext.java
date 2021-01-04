package com.tsing.springcontext.context.support;

import com.tsing.springcontext.context.ConfigurableApplicationContext;

public abstract class AbstractApplicationContext implements ConfigurableApplicationContext {

    @Override
    public void refresh() {
        //这个地方有 synchronized

        /**
         * 第一：
         * 准备工作包括设置启动时间，是否激活标识位
         * 初始化属性源配置
         */
//        prepareRefresh();

        /**
         * 第二：
         * 返回一个factory 为啥需要返回一个工厂？
         * 因为需要对工厂初始化
         */
//        ConfigurableListableBeanFactory beanFactory = obtainFreshBeanFactory();

        /**
         * 第三
         * 准备工厂
         */
//        prepareBeanFactory(beanFactory);

        /**
         * 第四
         * 这个里面啥也没做
         */
//        postProcessBeanFactory(beanFactory);

//        StartupStep beanPostProcess = this.applicationStartup.start("spring.context.beans.post-process");
        // Invoke factory processors registered as beans in the context.

        /**
         * 第五
         * 在spring的环境中执行已经被注册的 factory processors
         * 设置执行自定义的ProcessBeanFactory和spring内部自己定义的
         */
//        invokeBeanFactoryPostProcessors(beanFactory);

        // Register bean processors that intercept bean creation.
        /**
         * 第六
         * 注册beanPostProcessor
         */
//        registerBeanPostProcessors(beanFactory);
//        beanPostProcess.end();

        // Initialize message source for this context.
        /**
         * 第七
         */
//        initMessageSource();

        // Initialize event multicaster for this context.
        /**
         * 第八
         * 初始化应用事件广播器
         */
//        initApplicationEventMulticaster();

        // Initialize other special beans in specific context subclasses.
        /**
         * 第九
         */
//        onRefresh();

        // Check for listener beans and register them.
        /**
         * 第十
         */
//        registerListeners();

        // Instantiate all remaining (non-lazy-init) singletons.
        /**
         * 第十一
         */
//        finishBeanFactoryInitialization(beanFactory);

        // Last step: publish corresponding event.
        /**
         * 第十二
         */
//        finishRefresh();

    }

}
