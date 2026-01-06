package todo.kowsi.sample.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "todoTABLE")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String task;




}