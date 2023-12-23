package pro.sky.courseworkofthe2stcourse.examinerservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ListQuestionIsEmptyException extends RuntimeException {

    public ListQuestionIsEmptyException() {
    }

    public ListQuestionIsEmptyException(String message) {
        super(message);
    }

    public ListQuestionIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public ListQuestionIsEmptyException(Throwable cause) {
        super(cause);
    }

    public ListQuestionIsEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
