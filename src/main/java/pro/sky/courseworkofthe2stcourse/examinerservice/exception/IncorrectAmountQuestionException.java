package pro.sky.courseworkofthe2stcourse.examinerservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IncorrectAmountQuestionException extends RuntimeException {

    public IncorrectAmountQuestionException() {
    }

    public IncorrectAmountQuestionException(String message) {
        super(message);
    }

    public IncorrectAmountQuestionException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectAmountQuestionException(Throwable cause) {
        super(cause);
    }

    public IncorrectAmountQuestionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
