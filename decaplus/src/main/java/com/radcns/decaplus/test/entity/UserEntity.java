package com.radcns.decaplus.test.entity;

import com.radcns.decaplus.test.dto.UserDTO;
import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;

@Entity
@Setter
@Getter
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String image;

    @Column
    private String created_at;

    @Column
    private String updated_at;

    public static UserEntity toMemberEntity(UserDTO userDTO){
        UserEntity userEntity = new UserEntity();

        userEntity.setId(userDTO.getId());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setImage(userDTO.getImage());
        userEntity.setCreated_at(userDTO.getCreated_at());
        userEntity.setUpdated_at(userDTO.getUpdated_at());

        return userEntity;
    }
}
