package pro.sky.courseworkofthe2stcourse.examinerservice.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.courseworkofthe2stcourse.examinerservice.domain.Question;
import pro.sky.courseworkofthe2stcourse.examinerservice.exception.IncorrectAmountQuestionException;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    @Mock
    private QuestionService questionService;

    @InjectMocks
    private ExaminerServiceImpl examinerServiceMock;

        public static final Question QUESTION_1 = new Question("Вопрос1", "Ответ1");
        private static final Question QUESTION_2 = new Question("Вопрос2", "Ответ2");
        public static final Question QUESTION_3 = new Question("Вопрос3", "Ответ3");
        public static final Question QUESTION_4 = new Question("Вопрос4", "Ответ4");
        private static final Question QUESTION_5 = new Question("Вопрос5", "Ответ5");

        @Test
        public void getQuestionTestOnThrow() {
        when(questionService.size()).thenReturn(5);
        assertThrows(IncorrectAmountQuestionException.class, () -> examinerServiceMock.getQuestions(7));
    }

    @Test
    public void getQuestionTest() {
            when(questionService.getRandomQuestion())
                    .thenReturn(QUESTION_1, QUESTION_2, QUESTION_3, QUESTION_4, QUESTION_5);
            when(questionService.size()).thenReturn(10);
            assertEquals(examinerServiceMock.getQuestions(5).size(),5);
    }
    @Test
    public void getQuestionTestOnContains() {
        when(questionService.getRandomQuestion())
                .thenReturn(QUESTION_1, QUESTION_2, QUESTION_3, QUESTION_4, QUESTION_5);
        when(questionService.size()).thenReturn(10);
        assertTrue(examinerServiceMock.getQuestions(5).contains(QUESTION_3));

    }

    @Test
    void getQuestions() {
        when(questionService.getRandomQuestion())
                .thenReturn(QUESTION_1, QUESTION_2, QUESTION_3, QUESTION_4, QUESTION_5);
        assertTrue(examinerServiceMock.getQuestions(5).contains(QUESTION_3));
    }
}