package pro.sky.courseworkofthe2stcourse.examinerservice.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.courseworkofthe2stcourse.examinerservice.domain.Question;

import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class JavaQuestionServiceTest {
    JavaQuestionService serviceTest = new JavaQuestionService();

    private static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of("Pull request", "запрос на слияние (иногда называется merge request) двух веток"),
                Arguments.of("Commit", "запись в истории изменений, которая содержит commit message (описание внесенных изменений), а также обновленные файлы, подвергшиеся изменениям."),
                Arguments.of("Цикл", "конструкция кода, которая повторяет одно и то же действие несколько (столько, сколько нам потребуется) раз."),
                Arguments.of("Инициализация", "присваивание какого-то значения переменной.")
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void add(String question, String answer) {
        serviceTest.add(question, answer);
        assertTrue(serviceTest.getAll().contains(new Question(question, answer)));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void testAdd(Question question) {
        serviceTest.add(question);
        assertEquals(serviceTest.getAll().contains(Question));
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