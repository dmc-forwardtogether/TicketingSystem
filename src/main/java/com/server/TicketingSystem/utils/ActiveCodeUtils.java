package com.server.TicketingSystem.utils;

import java.util.UUID;

public class ActiveCodeUtils {
    /**
     * 生成注册激活码的工具类
     */
    public static String createActiveCode() {
        return UUID.randomUUID().toString();
    }
}
