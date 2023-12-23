package pro.sky.courseworkofthe2stcourse.examinerservice.service;

import org.springframework.stereotype.Service;
import pro.sky.courseworkofthe2stcourse.examinerservice.domain.Question;
import pro.sky.courseworkofthe2stcourse.examinerservice.exception.IncorrectAmountQuestionException;

import java.util.Collection;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements  ExaminerService{
    private Random random;
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount <= 0 || amount > questionService.getAll().size()){
            throw new IncorrectAmountQuestionException();
        }

        Set<Question> resultQuestions = new HashSet<>();
        while (resultQuestions.size() < amount) {
            resultQuestions.add(questionService.getRandomQuestion());
        }
        return resultQuestions;
    }
}
