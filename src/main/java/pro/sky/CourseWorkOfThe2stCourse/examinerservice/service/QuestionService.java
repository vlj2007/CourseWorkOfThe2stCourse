package pro.sky.CourseWorkOfThe2stCourse.examinerservice.service;

import pro.sky.CourseWorkOfThe2stCourse.examinerservice.domain.Question;

import java.util.Collection;

public interface QuestionService {

    Question add(String question, String answer);
    Question add(Question question);
    Question remove(Question question);
    Collection<Question> getAll();
    Question getRandomQuestion();

}
