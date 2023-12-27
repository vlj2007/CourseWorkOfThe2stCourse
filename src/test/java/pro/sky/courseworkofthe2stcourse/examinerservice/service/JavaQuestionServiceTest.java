package pro.sky.courseworkofthe2stcourse.examinerservice.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.courseworkofthe2stcourse.examinerservice.domain.Question;
import pro.sky.courseworkofthe2stcourse.examinerservice.exception.IllegalArgumentException;
import pro.sky.courseworkofthe2stcourse.examinerservice.exception.QuestionNotFoundException;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class JavaQuestionServiceTest {
    JavaQuestionService serviceTest = new JavaQuestionService();

    @AfterEach
    void after() {
        serviceTest.clear();
    }

    private static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of("Pull request", "запрос на слияние (иногда называется merge request) двух веток"),
                Arguments.of("Commit", "запись в истории изменений, которая содержит commit message (описание внесенных изменений), а также обновленные файлы, подвергшиеся изменениям."),
                Arguments.of("Цикл", "конструкция кода, которая повторяет одно и то же действие несколько (столько, сколько нам потребуется) раз."),
                Arguments.of("Инициализация", "присваивание какого-то значения переменной.")
        );
    }


    private static Stream<Arguments> provideParamsForTestTwo() {
        return Stream.of(
                Arguments.of(new Question ("Pull request", "запрос на слияние (иногда называется merge request) двух веток")),
                Arguments.of(new Question ("Commit", "запись в истории изменений, которая содержит commit message (описание внесенных изменений), а также обновленные файлы, подвергшиеся изменениям.")),
                Arguments.of(new Question ("Цикл", "конструкция кода, которая повторяет одно и то же действие несколько (столько, сколько нам потребуется) раз.")),
                Arguments.of(new Question ("Инициализация", "присваивание какого-то значения переменной."))
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void add(String question, String answer) {
        serviceTest.add("Spring Boot", "фреймворка");
        assertTrue(serviceTest.getAll().contains(new Question("Spring Boot", "фреймворка")));
    }


    @ParameterizedTest
    @MethodSource("provideParamsForTestTwo")
    void add4(Question question) {
        serviceTest.add("Spring Boot", "фреймворка");
        assertFalse(serviceTest.getAll().contains(question));
    }



    @Test
    void findNegativeTest() {
        serviceTest.add("Вопрос3", "Ответ3");
        assertThrows(QuestionNotFoundException.class,
                () -> serviceTest.find("Вопрос2")
        );
    }

    @Test
    void findPositiveTest() {
        serviceTest.add("Вопрос3", "Ответ3");
        Question q1 = new Question("Вопрос3", "Ответ3");
        assertEquals(q1, serviceTest.find("Вопрос3"));
    }


    @Test
    public void testAdd() {
        serviceTest.add("Вопрос4", "Ответ4");
        assertThrows(IllegalArgumentException.class,
                () ->
                        serviceTest.add("Вопрос4", "Ответ4")
        );
    }


    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void removeCorrectlyQuestionsTest(String question, String answer) {
        serviceTest.add("Spring Boot", "фреймворка");
        Question question1 = new Question("Spring Boot", "фреймворка");
        assertEquals(serviceTest.remove(question1), question1);
        assertThrows(QuestionNotFoundException.class, () -> serviceTest.find(question));
    }

    @Test
    void getRandomQuestion() {
        for (int i = 0; i < 10; i++) {
            Assertions.assertThat(serviceTest.getAll()).contains(serviceTest.getRandomQuestion());
        }
    }
}