package kg.attractor.quiz.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Quiz {
    private int id;
    private String title;
    private String description;
    private int creation_id;
}
