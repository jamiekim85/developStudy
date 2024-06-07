package com.radcns.decaplus.test.dto;

import com.radcns.decaplus.test.entity.UserEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserDTO {
    private int id;
    private String email;
    private String password;
    private String image;
    private String created_at;
    private String updated_at;

    public static UserDTO toUserDTO(UserEntity userEntity){
        UserDTO userDTO = new UserDTO();

        userDTO.setId(userEntity.getId());
        userDTO.setEmail(userEntity.getEmail());
        userDTO.setPassword(userEntity.getPassword());
        userDTO.setImage(userEntity.getImage());
        userDTO.setCreated_at(userEntity.getCreated_at());
        userDTO.setUpdated_at(userEntity.getUpdated_at());

        return userDTO;
    }
}
