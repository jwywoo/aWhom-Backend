package com.example.awhombackend.domain.character.entity;

import com.example.awhombackend.global.entity.Timestamped;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Characteristic extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "character_key", nullable = false)
    private String characterKey;

    @Column(name= "character_value", nullable = false)
    private String characterValue;

    public Characteristic(Long userId, String characterKey, String characterValue) {
        this.userId = userId;
        this.characterKey = characterKey;
        this.characterValue = characterValue;
    }
}
