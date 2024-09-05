package com.example.awhombackend.domain.personaCharacter.entity;

import com.example.awhombackend.domain.personaCharacter.dto.PersonaCharacterRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name="personaCharacter")
public class PersonaCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "character_key", nullable = false)
    private String characterKey;

    @Column(name= "character_value", nullable = false)
    private String characterValue;

    public PersonaCharacter(PersonaCharacterRequestDto personaCharacterRequestDto) {
        this.userId = personaCharacterRequestDto.getUserId();
        this.characterKey = personaCharacterRequestDto.getContentKey();
        this.characterValue = personaCharacterRequestDto.getContentValue();
    }
}
