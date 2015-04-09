package main.java.com.home.training.web;

import main.java.com.home.training.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeleteTaskController {
   
	@Autowired
    private TaskService taskService;

	@RequestMapping("/delete/{contactId}")
    public String deleteTask(@PathVariable("taskId") Integer taskId) {

		taskService.deleteTask(taskId);

        return "redirect:/index";
    }
	
    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }
}
