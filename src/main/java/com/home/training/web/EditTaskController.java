package main.java.com.home.training.web;

import main.java.com.home.training.entity.Task;
import main.java.com.home.training.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EditTaskController {

    @Autowired
    private TaskService taskService;
   
    
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editTask(@ModelAttribute("task") Task task,
            BindingResult result) {

        taskService.updateTask(task);

        return "redirect:/index";
    }
    
    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }
    
}
