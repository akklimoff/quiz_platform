package kg.attractor.quiz.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Option {
    private int id;
    private int question_id;
    private String option_text;
    private boolean isCorrect;
}
