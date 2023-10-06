package org.example.test;

import org.example.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanFactoryTest {

    public static void main(String[] args) {

    }

    public void testGetBean() {
        // 1.创建工厂对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.创建读取器（xml文件）
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

        // 3.读取器绑定工厂，加载配置文件
        reader.loadBeanDefinitions("beans.xml");

        // 4.获取Bean实例对象
        UserService userService = (UserService) beanFactory.getBean("userService");

        // 5.测试是否正常获取
        System.out.println(userService);
    }
}
