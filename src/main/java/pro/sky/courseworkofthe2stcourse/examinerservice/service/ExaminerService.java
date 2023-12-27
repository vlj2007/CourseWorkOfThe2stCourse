package pro.sky.courseworkofthe2stcourse.examinerservice.service;

import pro.sky.courseworkofthe2stcourse.examinerservice.domain.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestions(int amount);
}
