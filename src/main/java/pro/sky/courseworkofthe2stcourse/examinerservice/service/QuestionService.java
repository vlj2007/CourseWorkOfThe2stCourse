package pro.sky.courseworkofthe2stcourse.examinerservice.service;

import pro.sky.courseworkofthe2stcourse.examinerservice.domain.Question;

import java.util.Collection;

public interface QuestionService {

    Question add(String question, String answer);

    Question add(Question question);

    Question remove(Question question);

    Collection<Question> getAll();

    Question getRandomQuestion();

    int size();

    void clear();

    Question find(String question);

}
