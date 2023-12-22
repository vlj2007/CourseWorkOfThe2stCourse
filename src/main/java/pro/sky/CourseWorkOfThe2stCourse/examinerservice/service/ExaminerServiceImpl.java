package pro.sky.CourseWorkOfThe2stCourse.examinerservice.service;

import org.springframework.stereotype.Service;
import pro.sky.CourseWorkOfThe2stCourse.examinerservice.domain.Question;

import java.util.Collection;
import java.util.Random;

@Service
public class ExaminerServiceImpl implements  ExaminerService{
//    private Random random;
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        return null;
    }


}
