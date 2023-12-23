package pro.sky.courseworkofthe2stcourse.examinerservice.bootstrap;

import pro.sky.courseworkofthe2stcourse.examinerservice.domain.Question;

import java.util.HashSet;
import java.util.Set;
import org.springframework.boot.CommandLineRunner;
import pro.sky.courseworkofthe2stcourse.examinerservice.service.QuestionService;
public class Runner implements CommandLineRunner{

    public Runner (QuestionService service){
    }

    private QuestionService questions;

    @Override
    public void run(String... args) throws Exception {
        Set<Question> questions = new HashSet<>(Set.of(
                new Question("Pull request", "запрос на слияние (иногда называется merge request) двух веток"),
                new Question("Commit", "запись в истории изменений, которая содержит commit message (описание внесенных изменений), а также обновленные файлы, подвергшиеся изменениям."),
                new Question("var / variable", "это универсальный тип переменной, в которую мы можем записывать любое значение"),
                new Question("Массив", "это структура данных, которая позволяет хранить несколько значений одного типа."),
                new Question("Цикл", "конструкция кода, которая повторяет одно и то же действие несколько (столько, сколько нам потребуется) раз."),
                new Question("Инициализация", "присваивание какого-то значения переменной."),
                new Question("Javac", "оптимизирующий компилятор языка java, включенный в состав многих Java Development Kit (JDK)"),
                new Question("индекс", "Порядковый номер элемента массива называется индексом."),
                new Question("Stream", "Объект для универсальной работы с данными."),
                new Question("branch (Ветка)", "обособленная копия проекта, в которой хранится код и история его изменений."),
                new Question("инкапсуляция", "сокрытие полей внутри объекта с целью защиты данных от внешнего, бесконтрольного изменения со стороны других объектов."),
                new Question("Библиотеки в Java", "набор классов, позволяющих упростить и ускорить работу разработчика в написании шаблонного кода."),
                new Question("maven", "фреймворк для автоматизации сборки проектов на основе описания их структуры в файлах."),
                new Question("Controller", "сущность, которая получает запрос и обрабатывает его.")
        ));

    }


}
