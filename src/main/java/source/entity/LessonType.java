package source.webcfd.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Lesson_Types")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LessonType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String typeName;

    @OneToMany(mappedBy = "lessonType")
    private List<Lesson> lessons;
}

