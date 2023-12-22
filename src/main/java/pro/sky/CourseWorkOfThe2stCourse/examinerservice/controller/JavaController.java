package pro.sky.CourseWorkOfThe2stCourse.examinerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.CourseWorkOfThe2stCourse.examinerservice.domain.Question;
import pro.sky.CourseWorkOfThe2stCourse.examinerservice.service.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/exam")

public class JavaController {
    QuestionService service;

    public JavaController(QuestionService service) {
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
