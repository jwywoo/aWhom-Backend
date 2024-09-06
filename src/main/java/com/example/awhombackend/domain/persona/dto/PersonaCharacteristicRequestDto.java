package com.example.awhombackend.domain.persona.dto;

import com.example.awhombackend.domain.characteristic.entity.Characteristic;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class PersonaCharacteristicRequestDto {
    private List<Characteristic> personCharacteristics;
}
