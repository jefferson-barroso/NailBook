package com.nailbook.nailbook_api.controller;

import com.nailbook.nailbook_api.dto.UserResponseDTO;
import com.nailbook.nailbook_api.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/buscarTodosUsuarios")
    public ResponseEntity<List<UserResponseDTO>> listAll(){
        return ResponseEntity.ok(userService.listAll());
    }

    @GetMapping("/buscarUserPorId/{id}")
    public ResponseEntity<UserResponseDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok(userService.findById(id));
    }
}
