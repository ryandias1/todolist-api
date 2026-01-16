package br.com.ryan.todolist.task;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "tb_tasks")
public class TaskModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, length = 50)
    private String title;
    private String description;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;
    private LocalDateTime createdAt;
    private UUID userId;

    public void setTitle(String title) throws Exception {
        if (title.length() > 50) throw new Exception("Titulo com mais de 50 caracteres");
        this.title = title;
    }
}
