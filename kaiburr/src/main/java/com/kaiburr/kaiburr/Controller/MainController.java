//Pubesh
package com.kaiburr.kaiburr.Controller;

import com.kaiburr.kaiburr.Model.Student;
import com.kaiburr.kaiburr.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

@Autowired
    StudentRepo studentrepo;
    @PostMapping("/addTask")
    public void addTask(@RequestBody Student task){
        studentrepo.save(task);

    }
    @GetMapping("/fetchTask")
    public List <Student> fetchTask(){
        return studentrepo.findAll();

    }
    @GetMapping("/getTask/{id}")
    public  Student getTask(@PathVariable String id){
        return studentrepo.findById(id).orElse(null);

    }
    @DeleteMapping("/deleteTask/{id}")
    public void deleteTask(@PathVariable String id){
        studentrepo.deleteById(id);

    }
}
