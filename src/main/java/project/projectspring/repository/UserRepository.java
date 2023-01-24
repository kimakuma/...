package project.projectspring.repository;
import org.springframework.stereotype.Repository;
import project.projectspring.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}