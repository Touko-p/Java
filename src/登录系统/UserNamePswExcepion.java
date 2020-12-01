package 登录系统;

public class UserNamePswExcepion extends Exception{
    public UserNamePswExcepion() {
        super();
    }

    public UserNamePswExcepion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public UserNamePswExcepion(Throwable cause) {
        super(cause);
    }

    public UserNamePswExcepion(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNamePswExcepion(String message) {
        super(message);
    }
}
