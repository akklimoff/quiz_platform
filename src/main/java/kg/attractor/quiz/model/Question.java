package kg.attractor.quiz.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Question {
    private int id;
    private int quiz_id;
    private String question_text;
}
