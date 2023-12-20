package pro.sky.CourseWorkOfThe2stCourse.examinerservice.controller;

import pro.sky.CourseWorkOfThe2stCourse.examinerservice.domain.Question;
import pro.sky.CourseWorkOfThe2stCourse.examinerservice.service.QuestionService;

import java.util.Collection;

public class JavaController {
    QuestionService service;

    public JavaController(QuestionService service) {
        this.service = service;
    }

    Question addQuestion(String question, String answer){
        return null;
    }

    Collection<Question> getQuestions(){
        return null;
    }

    Question removeQuestion(String question, String answer){
        return null;
    }







    //
//    JavaController(QuestionService service);

}
