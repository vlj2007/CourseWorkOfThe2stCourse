package pro.sky.courseworkofthe2stcourse.examinerservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionNotFound extends RuntimeException{
    public QuestionNotFound() {
    }

    public QuestionNotFound(String message) {
        super(message);
    }

    public QuestionNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionNotFound(Throwable cause) {
        super(cause);
    }

    public QuestionNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
