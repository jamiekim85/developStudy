package com.radcns.decaplus.test.service;

import com.radcns.decaplus.test.dto.UserDTO;
import com.radcns.decaplus.test.entity.UserEntity;
import com.radcns.decaplus.test.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void save(UserDTO userDTO){
        UserEntity userEntity = UserEntity.toMemberEntity(userDTO);
        userRepository.save(userEntity);
    }
}
