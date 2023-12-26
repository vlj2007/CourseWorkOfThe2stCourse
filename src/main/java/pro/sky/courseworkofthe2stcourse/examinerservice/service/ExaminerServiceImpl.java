package pro.sky.courseworkofthe2stcourse.examinerservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pro.sky.courseworkofthe2stcourse.examinerservice.domain.Question;
import pro.sky.courseworkofthe2stcourse.examinerservice.exception.IncorrectAmountQuestionException;

import java.util.Collection;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ExaminerServiceImpl implements ExaminerService {
    private final Random random = new Random();
    private final QuestionService questionService;

    @Override
    public Set<Question> getQuestions(int amount) {
        if (amount > questionService.size()) {
            throw new IncorrectAmountQuestionException("Список не содержить столько вопросов");
        }

        Set<Question> resultQuestions = new HashSet<>();
        while (resultQuestions.size() < amount) {
            resultQuestions.add(questionService.getRandomQuestion());
        }
        return resultQuestions;
    }
}
