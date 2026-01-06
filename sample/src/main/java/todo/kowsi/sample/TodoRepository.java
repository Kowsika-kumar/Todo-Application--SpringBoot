package todo.kowsi.sample;

import org.springframework.data.jpa.repository.JpaRepository;
import todo.kowsi.sample.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
