package com.server.TicketingSystem.exception;

/**
 * 注册异常类:它的作用就是用来标志注册的异常信息
 * @author qxq
 */
public class ActiveUserException extends Exception {
    private static final long serialVersionUID = 1L;

    public ActiveUserException() {
        super();
    }

    public ActiveUserException(String message, Throwable cause) {
        super(message, cause);
    }

    public ActiveUserException(String message) {
        super(message);
    }

    public ActiveUserException(Throwable cause) {
        super(cause);
    }

}
