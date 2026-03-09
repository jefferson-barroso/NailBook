package com.nailbook.nailbook_api.service;

import com.nailbook.nailbook_api.dto.UserResponseDTO;
import com.nailbook.nailbook_api.model.entity.User;
import com.nailbook.nailbook_api.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private UserResponseDTO toDTO(User user){
        return new UserResponseDTO(
                user.getId(),
                user.getEmail(),
                user.getNome(),
                user.getRole().name()
        );
    }

    public List<UserResponseDTO> listAll(){
        return userRepository.findAll().stream().map(this::toDTO).toList();
    }


    public UserResponseDTO findById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        return toDTO(user);
    }

}
