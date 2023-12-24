package pro.sky.courseworkofthe2stcourse.examinerservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IllegelArgumentException extends RuntimeException{

    public IllegelArgumentException() {
    }

    public IllegelArgumentException(String message) {
        super(message);
    }

    public IllegelArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegelArgumentException(Throwable cause) {
        super(cause);
    }

    public IllegelArgumentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
