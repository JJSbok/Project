package org.example.service;

import lombok.AllArgsConstructor;
import org.example.model.TodoEntity;
import org.example.model.TodoRequest;
import org.example.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class TodoService {
    private final TodoRepository todoRepository;

    // 추가
    public TodoEntity add(TodoRequest request){
        TodoEntity todoEntity = new TodoEntity();
        todoEntity.setTitle(request.getTitle());
        todoEntity.setOrder(request.getOrder());
        todoEntity.setCompleted(request.getCompleted());
        return this.todoRepository.save(todoEntity);
    }


    public TodoEntity searchById(Long id){
        return this.todoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시물이 존재하지 않습니다."));

    }
    public List<TodoEntity> searchAll(){
        return this.todoRepository.findAll();
    }

    public TodoEntity updateById(Long id, TodoRequest request){
        TodoEntity todoEntity = this.searchById(id);
        if(request.getTitle() != null){
            todoEntity.setTitle(request.getTitle());
        }
        if (request.getOrder() != null){
            todoEntity.setOrder(request.getOrder());
        }
        if (request.getCompleted() != null){
            todoEntity.setCompleted(request.getCompleted());
        }
        return this.todoRepository.save(todoEntity);
    }

    public void deleteById(Long id){
    this.todoRepository.deleteById(id);
    }

    public void deleteAll(){
this.todoRepository.deleteAll();
    }
}
