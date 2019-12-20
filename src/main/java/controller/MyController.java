package controller;

import entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/stu")
    public String student(Model model){
        Student stu1 = new Student("张三",20,"男");
        Student stu2 = new Student("李四",21,"女");
        Student stu3 = new Student("王五",22,"男");
        Student stu4 = new Student("赵六",23,"女");
        List<Student> list = new ArrayList<Student>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        model.addAttribute("my",list);

        return "my";
    }

}
