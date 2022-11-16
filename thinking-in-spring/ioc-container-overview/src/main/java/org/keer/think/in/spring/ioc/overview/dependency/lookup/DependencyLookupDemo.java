package org.keer.think.in.spring.ioc.overview.dependency.lookup;

import org.keer.think.in.spring.ioc.overview.dependency.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huangjunyi
 * @date 2022/11/16 17:22:04
 */
public class DependencyLookupDemo {
    public static void main(String[] args) {
        //配置 xml文件
        //启动 spring 应用上下文
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-lookup-context.xml");
        User user = (User) beanFactory.getBean("user");
        System.out.println(user);

    }
}
