package project.projectspring.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String pw;

    public User() {
    }

    public User(String name, String email, String pw) {
        this.name = name;
        this.email = email;
        this.pw = pw;
    }
}
