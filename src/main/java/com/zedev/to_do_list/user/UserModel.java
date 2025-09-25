package com.zedev.to_do_list.user;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name="tb_users") // PK de ligação com o banco
@Data
public class UserModel {

    @Id // jakarta persistence
    @GeneratedValue(generator = "UUID") // gerador UUID de forma automatica
    private UUID id; // id alfanumerico

    //@Column(name = "usuario")
    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

}