package cgg.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPP implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("My Bean Factory Post processor is Called...");
		
	}

}
//this is the method that spring is going to run before the beanfactory 
//itselfs is being initialized and what argument we get is the beanFactory itselfs
//what spring going to dod is call postProcessorBeanFactory() of all the
//classes that's declared in spring.xml which implements BeanFactpryPostProcessor
//when the beanfactory is being initialized then this method of this class is being called

//when spring initializes beanfactory the first thing it does is intializes all
//the singleton beans(default behavior).
//beanfactorypostproceesor is first called then the beanfactory is initialized
//and then all the singleton beans are initailized this is the order in which execution goes
//this is the handy way in which we can plugin extra functionality if
//you want to override some of the default behavior when the beanfactory is initialized

//one example of beanfactorypostprocessor that comes out of the box is called
//propertyplaceholder configurer
//what it helps us to do is if we want to have some kind of placeholder for
//bean configuration

//inorder to let spring know that these values have to be substituted over here
//use out of the box beanfactorypostprocessor that spring provides which is called 
//PropertyPlaceHolderConfigurer
//inorder to define any beanfactorypostprocessor all we need to do is
//write a simple bean tag.
//if we were to write our own beanfactorypostprocessor we have to write the class 
//and add it to spring.xml
//if you are using out of the box beanfactortpostproceessor dont even wrute the class spring
//is already providing that class just add classname in spring.xml

//PropertyPlaceHolderConfigurer
//This class is going to look at the properties file and then going to look at 
//spring.xml  then where ever you have the placeholders its going to loojup the properties
//and then substitute it.
//this gets executed before the beanfactory gets executed so the
//beanfactory will not see the placeholder.the beanfactory will have the completely
//substituted xml file ready








