package pro.sky.courseworkofthe2stcourse.examinerservice.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import pro.sky.courseworkofthe2stcourse.examinerservice.domain.Question;

import java.util.HashSet;
import java.util.Set;
import org.springframework.boot.CommandLineRunner;
import pro.sky.courseworkofthe2stcourse.examinerservice.service.QuestionService;
public class Runner implements CommandLineRunner{
    @Autowired
    private QuestionService questions;

    @Override
    public void run(String... args) throws Exception {
        questions.add(new Question("Pull request", "запрос на слияние (иногда называется merge request) двух веток"));
        questions.add(new Question("Commit", "запись в истории изменений, которая содержит commit message (описание внесенных изменений), а также обновленные файлы, подвергшиеся изменениям."));
        questions.add(new Question("var / variable", "это универсальный тип переменной, в которую мы можем записывать любое значение"));
        questions.add(new Question("Массив", "это структура данных, которая позволяет хранить несколько значений одного типа."));
        questions.add(new Question("Цикл", "конструкция кода, которая повторяет одно и то же действие несколько (столько, сколько нам потребуется) раз."));


    }


}
