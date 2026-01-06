package todo.kowsi.sample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import todo.kowsi.sample.models.Todo;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    // GET all
    @GetMapping("/totaltodos")
    public ResponseEntity<List<Todo>> getAllTodos() {
        return ResponseEntity.ok(todoService.getAllTodos());
    }

    // GET by id
    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodo(@PathVariable Long id) {
        Todo todo = todoService.getTodoById(id);
        if (todo == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(todo);
    }

    // POST create
    @PostMapping("/create")
    public ResponseEntity<Todo> addTodo(@RequestBody Todo todo) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(todoService.addTodo(todo));
    }

    // PUT update
    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateTodo(
            @PathVariable Long id,
            @RequestBody Todo todo) {

        try {
            return ResponseEntity.ok(todoService.updateTodo(id, todo));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTodo(@PathVariable Long id) {
        boolean deleted = todoService.deleteTodo(id);
        if (!deleted) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Todo not found");
        }
        return ResponseEntity.ok("Todo deleted successfully");
    }
}
