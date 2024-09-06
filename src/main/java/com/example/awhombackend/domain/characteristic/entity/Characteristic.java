package com.example.awhombackend.domain.characteristic.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Getter
@NoArgsConstructor
@Document("characteristics_prompt")
public class Characteristic{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "character_key", nullable = false)
    private String characterKey;

    @Column(name= "character_value", nullable = false)
    private String characterValue;
}
