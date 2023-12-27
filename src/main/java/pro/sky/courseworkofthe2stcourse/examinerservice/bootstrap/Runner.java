package pro.sky.courseworkofthe2stcourse.examinerservice.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.sky.courseworkofthe2stcourse.examinerservice.domain.Question;

import java.util.HashSet;
import java.util.Set;
import org.springframework.boot.CommandLineRunner;
import pro.sky.courseworkofthe2stcourse.examinerservice.service.QuestionService;
@Component
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
        questions.add(new Question("Инициализация", "присваивание какого-то значения переменной."));
        questions.add(new Question("Javac", "оптимизирующий компилятор языка java, включенный в состав многих Java Development Kit (JDK)"));
        questions.add(new Question("индекс", "Порядковый номер элемента массива называется индексом."));
        questions.add(new Question("Stream", "Объект для универсальной работы с данными."));
        questions.add(new Question("branch (Ветка)", "обособленная копия проекта, в которой хранится код и история его изменений."));
        questions.add(new Question("инкапсуляция", "сокрытие полей внутри объекта с целью защиты данных от внешнего, бесконтрольного изменения со стороны других объектов."));
        questions.add(new Question("Библиотеки в Java", "набор классов, позволяющих упростить и ускорить работу разработчика в написании шаблонного кода."));
        questions.add(new Question("maven", "фреймворк для автоматизации сборки проектов на основе описания их структуры в файлах."));
        questions.add(new Question("Controller", "сущность, которая получает запрос и обрабатывает его."));
    }


}
