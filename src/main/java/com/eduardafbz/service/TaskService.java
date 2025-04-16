package com.eduardafbz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardafbz.model.Task;
import com.eduardafbz.repository.TaskRepository;

@Service
public class TaskService {
    
    @Autowired
    public final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task add(Task t) {
        return taskRepository.save(t);
    }

    public List<Task> get_all() {
        return taskRepository.findAll();
    }

    public Optional<Task> get_by_id(Long id) {
        return taskRepository.findById(id);
    }

    public void delete_all() {
        taskRepository.deleteAll();
    }

    public void delete_by_id(Long id) {
        taskRepository.deleteById(id);
    }

}
