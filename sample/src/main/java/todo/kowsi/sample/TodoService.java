package todo.kowsi.sample;

import org.springframework.stereotype.Service;
import todo.kowsi.sample.models.Todo;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    // GET all
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    // GET by id
    public Todo getTodoById(Long id) {
        return todoRepository.findById(id).orElse(null);
    }

    // POST create
    public Todo addTodo(Todo todo) {
        todo.setId(null); // force INSERT
        return todoRepository.save(todo);
    }

    // PUT update
    public Todo updateTodo(Long id, Todo todo) {
        Todo existing = todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found"));

        existing.setTask(todo.getTask());
        return todoRepository.save(existing);
    }

    // DELETE
    public boolean deleteTodo(Long id) {
        if (todoRepository.existsById(id)) {
            todoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
