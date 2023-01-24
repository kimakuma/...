package project.projectspring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.projectspring.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    // SignUp
   /* public User createUser(UserCreationRequest request) {
        User user = new User(request.name, request.phone, request.email, request.pw);
        BeanUtils.copyProperties(request, user);
        return userRepository.save(user);
    }*/
}
