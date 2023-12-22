package pro.sky.CourseWorkOfThe2stCourse.examinerservice.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.CourseWorkOfThe2stCourse.examinerservice.domain.Question;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class JavaQuestionServiceTest {
    JavaQuestionService serviceTest = new JavaQuestionService();

    private static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of("question", "answer"),
                Arguments.of("question1", "answer1"),
                Arguments.of("question2", "answer2"),
                Arguments.of("question3", "answer3")
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void add(String question, String answer) {
        serviceTest.add(question, answer);
        assertTrue(serviceTest.getAll().contains(new Question(question, answer)));
    }

    @Test
    void testAdd() {
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void remove(Question question) {
        Question removeQuestion = serviceTest.remove(question);
        assertTrue(serviceTest.remove(removeQuestion).equals(removeQuestion));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void getAll() {
        serviceTest.getAll();
    }

    @Test
    void getRandomQuestion() {
    }
}