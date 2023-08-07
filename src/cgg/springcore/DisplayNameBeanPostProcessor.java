package cgg.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In after initilaization method, Bean name is "+beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In before initilaization method, Bean name is "+beanName);
		return bean;
	}

}

//BeanPostProcessor is an extension point for the spring framework and how we can configure 
//the framework for your specific needs using the BeanPostProcessor
//BeanFactoryPostProcessor is another extension poiint.This is a feature
//provided by spring when you want to execute code when the bean factory itself is being
//initialised then you can use beanfactoryprocessor to write your own code



