package pro.sky.courseworkofthe2stcourse.examinerservice.service;

import org.springframework.stereotype.Service;
import pro.sky.courseworkofthe2stcourse.examinerservice.domain.Question;
import pro.sky.courseworkofthe2stcourse.examinerservice.exception.ListQuestionIsEmptyException;
import pro.sky.courseworkofthe2stcourse.examinerservice.exception.IllegalArgumentException;
import pro.sky.courseworkofthe2stcourse.examinerservice.exception.QuestionNotFoundException;


import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {

    private Set<Question> questions = new HashSet<>();

    @Override
    public Question add(String question, String answer) {
        Question q = new Question(question, answer);
        if (questions.contains(q)) {
            throw new IllegalArgumentException("Вопрос существует в списке");
        }
        return add(new Question(question, answer));
    }

    @Override
    public Question add(Question question) {
        if (questions.contains(question)) {
            throw new IllegalArgumentException("Вопрос существует в списке");
        }
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (questions.remove(question)) {
            return question;
        }
        throw new QuestionNotFoundException("Элемент не найден в спискен");

    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableSet(questions);
    }

    @Override
    public void clear() {
        questions.clear();
    }

    @Override
    public int size() {
        return questions.size();
    }


    @Override
    public Question find(String question) {
        return questions.stream()
                .filter(e -> e.getQuestion().equals(question))
                .findFirst()
                .orElseThrow(QuestionNotFoundException::new);
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        if (questions.isEmpty()) {
            throw new ListQuestionIsEmptyException("Вопросы отсутствуют в списке");
        }
        return new ArrayList<>(questions).get(random.nextInt(questions.size()));
    }


}
