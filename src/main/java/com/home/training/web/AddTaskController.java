package main.java.com.home.training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.java.com.home.training.entity.Task;
import main.java.com.home.training.service.TaskService;

@Controller
public class AddTaskController {

    @Autowired
    private TaskService taskService;
   
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addTask(@ModelAttribute("task") Task task,
            BindingResult result) {

        taskService.addTask(task);

        return "redirect:/index";
    }
    
    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }
}    
