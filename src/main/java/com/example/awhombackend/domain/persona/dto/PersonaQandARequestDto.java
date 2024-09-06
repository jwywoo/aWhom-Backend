package com.example.awhombackend.domain.persona.dto;

import com.example.awhombackend.domain.qanda.entity.QandA;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class PersonaQandARequestDto {
    private List<QandA> personaQandAs;
}
