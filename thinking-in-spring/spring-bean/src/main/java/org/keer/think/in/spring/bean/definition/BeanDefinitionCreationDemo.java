package org.keer.think.in.spring.bean.definition;

import org.keer.think.in.spring.ioc.overview.dependency.domain.User;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @author huangjunyi
 * @date 2022/11/17 22:33:31
 */
public class BeanDefinitionCreationDemo {
    public static void main(String[] args) {

        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(User.class);
        beanDefinitionBuilder.addPropertyValue("id", 1);
        beanDefinitionBuilder.addPropertyValue("name", "kaer");
        BeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();

        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClass(User.class);
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.addPropertyValue("id", 2);
        propertyValues.addPropertyValue("name", "kaer");
        propertyValues.add("id", 2).add("name", "kaer");
        genericBeanDefinition.setPropertyValues(propertyValues);


    }
}
