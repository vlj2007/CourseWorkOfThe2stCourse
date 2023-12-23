package pro.sky.courseworkofthe2stcourse.examinerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.courseworkofthe2stcourse.examinerservice.domain.Question;
import pro.sky.courseworkofthe2stcourse.examinerservice.service.ExaminerService;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExamController {

    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping(path = "/get/{amount}")
    public Collection<Question> getQuestions(@PathVariable int amount){
        return examinerService.getQuestions(amount);
    }

}
