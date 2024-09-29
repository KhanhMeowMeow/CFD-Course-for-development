package source.webcfd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "User_Classes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class classEntity;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDateTime enrolledAt = LocalDateTime.now();
}

