package com.liuchuang.push.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liuchuang.push.producer.ProducerService;
import com.liuchuang.push.producer.ProducerServiceImpl;

public class AppProducer {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
		
		ProducerService service = context.getBean(ProducerServiceImpl.class);

		for (int i = 0; i <= 100; i++) {
			service.sendMessage("test" + i);
		}
		
		context.close();
	}
}
