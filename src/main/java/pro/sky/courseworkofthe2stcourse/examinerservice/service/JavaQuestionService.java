package pro.sky.courseworkofthe2stcourse.examinerservice.service;
import org.springframework.stereotype.Service;
import pro.sky.courseworkofthe2stcourse.examinerservice.domain.Question;
import pro.sky.courseworkofthe2stcourse.examinerservice.exception.ListQuestionIsEmptyException;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    Random random = new Random();

    private Set<Question> questions = new HashSet<>(Set.of(
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

    public void clear() {
        questions.clear();
    }

    public void size() {
        int resultSize = questions.size();
    }


    @Override
    public Question getRandomQuestion() {
        if (questions.isEmpty()) {
            throw new ListQuestionIsEmptyException("Вопросы отсутствуют в списке");
        }
        return new ArrayList<>(questions).get(random.nextInt(questions.size()));

    }


}
