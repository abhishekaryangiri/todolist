package com.todo.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/")
    public String index(Model model) {
        List<Task> tasks = taskRepository.findAll();
        model.addAttribute("tasks", tasks);
        model.addAttribute("task", new Task()); // Add an empty task object for form submission
        return "index";
    }
}

//@Controller
//public class TaskController {
//
//    @Autowired
//    private TaskRepository taskRepository;
//
//    @GetMapping("/")
//    public String index(Model model) {
//        List<Task> tasks = taskRepository.findAll();
//        model.addAttribute("tasks", tasks);
//        model.addAttribute("task", new Task()); 
//        return "index";
//    }
//
//    @PostMapping("/add")
//    public String addTask(Task task) {
//        taskRepository.save(task);
//        return "redirect:/";
//    }

    // Add more methods for editing, deleting, completing tasks, etc.
//}