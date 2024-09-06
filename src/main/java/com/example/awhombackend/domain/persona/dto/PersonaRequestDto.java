package com.example.awhombackend.domain.persona.dto;

import com.example.awhombackend.domain.character.entity.Characteristic;
import com.example.awhombackend.domain.qanda.entity.QandA;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@RequiredArgsConstructor
@Setter
public class PersonaRequestDto {
    private List<Characteristic> characteristicList;
    private List<QandA> questionAndAnswerList;
}
