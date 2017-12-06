package com.liuchuang.push.consumer;

import java.util.Random;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import com.alibaba.fastjson.JSON;
import com.liuchuang.push.bean.Info;
import com.liuchuang.push.utils.PushUtil;

public class ConsumerMessageListener implements MessageListener{

	@Override
	public void onMessage(Message message) {
		
		TextMessage textMessage = (TextMessage) message;
		
		try {
			String json = textMessage.getText();
			System.out.println("接受消息：" + json);
			Info info = JSON.parseObject(json,Info.class);
			PushUtil.sendMessageToAlias(info.getTitle(), info.toString(), info.toString(), "liuchuang", new Random().nextInt(Integer.MAX_VALUE));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
