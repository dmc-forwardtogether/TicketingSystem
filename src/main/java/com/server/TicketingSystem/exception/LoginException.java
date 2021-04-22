package com.server.TicketingSystem.exception;

/**
 * 注册异常类:它的作用就是用来标志注册的异常信息
 *
 * @author qxq
 */
public class LoginException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public LoginException() {
        super();

    }

    public LoginException(String message, Throwable cause) {
        super(message, cause);

    }

    public LoginException(String message) {
        super(message);

    }

    public LoginException(Throwable cause) {
        super(cause);

    }
}
