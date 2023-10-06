package org.example.test;

import org.example.dao.UserDao;
import org.example.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanFactoryTest {

    public static void main(String[] args) {
        testGetBean();
    }

    public static void testGetBean() {
        // 1.创建工厂对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.创建读取器（xml文件）
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

        // 3.读取器绑定工厂，加载配置文件
        reader.loadBeanDefinitions("beans.xml");

        // 4.获取Bean实例对象（主要此处beanFactory.getBean中参数name实际上是beans.xml文件中的beanId）
        UserService userService = (UserService) beanFactory.getBean("userService");
        UserDao userDao = (UserDao) beanFactory.getBean("userDao");

        // 5.测试是否正常获取
//        System.out.println(userService);
//        System.out.println(userDao);
    }
}
