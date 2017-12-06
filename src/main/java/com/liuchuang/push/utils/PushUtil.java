package com.liuchuang.push.utils;

import com.xiaomi.xmpush.server.Constants;
import com.xiaomi.xmpush.server.Message;
import com.xiaomi.xmpush.server.Sender;

public class PushUtil {
	private static final String MY_PACKAGE_NAME = "com.liuchuang.story";
	private static final String APP_SECRET_KEY = "z7uY2lB+1Mw6Wyazza+B+g==";

	public static void sendMessageToAlias(String title, String description, String messagePayload, String alias, int id)
			throws Exception {
		Constants.useOfficial();
		Sender sender = new Sender(APP_SECRET_KEY);
		Message message = new Message.Builder() //
				.title(title) //
				.description(description) //
				.payload(messagePayload) //
				.restrictedPackageName(MY_PACKAGE_NAME) //
				.notifyId(id) //
				.notifyType(1) // 使用默认提示音提示
				.build();
		sender.sendToAlias(message, alias, 3); // 根据alias, 发送消息到指定设备上
	}
}
