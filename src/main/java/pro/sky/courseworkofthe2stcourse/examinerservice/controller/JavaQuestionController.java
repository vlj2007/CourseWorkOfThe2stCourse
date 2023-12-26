package pro.sky.courseworkofthe2stcourse.examinerservice.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.courseworkofthe2stcourse.examinerservice.domain.Question;
import pro.sky.courseworkofthe2stcourse.examinerservice.service.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/exam")

public class JavaQuestionController {
    private final QuestionService service;

    public JavaQuestionController(QuestionService service) {
        this.service = service;
    }

    @GetMapping(path = "/java/add")
    public Question addQuestion(@RequestParam String question, @RequestParam String answer){
        return service.add(question, answer);
    }

    @GetMapping(path = "/java/find")
    public Collection<Question> getQuestions(){
        return service.getAll();
    }
    @GetMapping(path = "/java/remove")
    public Question removeQuestion(@RequestParam  Question question){
        return  service.remove(question);
    }




}
