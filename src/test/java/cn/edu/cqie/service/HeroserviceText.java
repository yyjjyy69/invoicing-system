package cn.edu.cqie.service;

import cn.edu.cqie.service.Impl.HeroServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class HeroserviceText {


	/*void contextLoads() {
		//new 方式创建对象

		//根据spring配置文件application.xml创建

		ApplicationContext cxt = new ClassPathXmlApplicationContext(:"applicationContext.xml");
		HeroServiceImpl heroService = (HeroServiceImpl)cxt.getBean("heroService");
		heroService.save();
	}*/
	@Test
	public void Heroservice() {
			ApplicationContext cxt=new ClassPathXmlApplicationContext("applicationContext.xml");
			HeroService heroService = (HeroService)cxt.getBean("heroServcie");
			heroService.save();
	}

}