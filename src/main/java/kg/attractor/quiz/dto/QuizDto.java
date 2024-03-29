package kg.attractor.quiz.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuizDto {
    private int id;
    @NotBlank(message = "Title cannot be blank")
    private String title;
    @NotBlank(message = "Description cannot be blank")
    private String description;
    private int creation_id;
}
