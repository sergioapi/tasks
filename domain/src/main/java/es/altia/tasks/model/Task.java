package es.altia.tasks.model;

import java.time.LocalDateTime;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Task {

    private Long id;
    private String title;
    private String description;
    private LocalDateTime creationDate;
    private boolean completed;

}
