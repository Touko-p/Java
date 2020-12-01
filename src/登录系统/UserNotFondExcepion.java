package 登录系统;

public class UserNotFondExcepion extends Exception {
    public UserNotFondExcepion() {
        super();
    }

    public UserNotFondExcepion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public UserNotFondExcepion(Throwable cause) {
        super(cause);
    }

    public UserNotFondExcepion(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotFondExcepion(String message) {
        super(message);
    }
}
