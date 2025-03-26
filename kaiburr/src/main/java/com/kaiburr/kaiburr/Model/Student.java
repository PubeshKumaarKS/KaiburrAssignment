//Pubesh
package com.kaiburr.kaiburr.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "tasks")
@NoArgsConstructor
@AllArgsConstructor

public class Student {
    @Id
    private String id;
    private String name;
    private String owner;
    private String command;
   // private List<TaskExecution> taskExecutions = new ArrayList<>();
}