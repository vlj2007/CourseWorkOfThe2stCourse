package pro.sky.CourseWorkOfThe2stCourse.examinerservice.service;
import org.springframework.stereotype.Service;
import pro.sky.CourseWorkOfThe2stCourse.examinerservice.domain.Question;

import java.util.HashSet;
import java.util.Random;

import java.util.Collection;
import java.util.Set;
@Service
public class JavaQuestionService implements QuestionService {

    private Set<Question> questions = new HashSet<>();
    Random random = new Random();
    int x = random.nextInt(10);

    @Override
    public Question add(String question, String answer) {
        return add(new Question(question, answer));
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }

    @Override
    public Question getRandomQuestion() {
        return null;
    }
}
