package pro.sky.CourseWorkOfThe2stCourse.examinerservice.service;

import pro.sky.CourseWorkOfThe2stCourse.examinerservice.domain.Question;

import java.util.Collection;
import java.util.Random;

public interface ExaminerService {

    Collection<Question> getQuestions(int amount);
}
