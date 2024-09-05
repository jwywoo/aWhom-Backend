package com.example.awhombackend.domain.personaCharacter.dto;

import lombok.Getter;

@Getter
public class PersonaCharacterRequestDto {
    private Long userId;
    private String contentKey;
    private String contentValue;
}
