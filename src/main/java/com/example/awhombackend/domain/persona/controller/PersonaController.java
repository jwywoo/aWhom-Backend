package com.example.awhombackend.domain.persona.controller;

import com.example.awhombackend.domain.persona.dto.PersonaCharacteristicRequestDto;
import com.example.awhombackend.domain.persona.dto.PersonaQandARequestDto;
import com.example.awhombackend.domain.persona.service.PersonaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.IIOException;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j(topic = "Persona Controller")
public class PersonaController {
    private final PersonaService personaService;

    @PostMapping(value="/persona/prompt/characteristic")
    public String personaPromptCharacteristicUpload(@RequestBody PersonaCharacteristicRequestDto requestDto) throws IIOException {
        try {
            return personaService.personaPromptCharacteristicsUpload(requestDto);
        } catch (Exception e) {
            throw new IIOException(e.getMessage());
        }
    }

    @PostMapping(value="/persona/prompt/qanda")
    public String personaPromptQandAUpload(@RequestBody PersonaQandARequestDto requestDto) throws IIOException {
        try {
            return personaService.personaPromptQandAsUpload(requestDto);
        } catch (Exception e) {
            throw new IIOException(e.getMessage());
        }
    }
}
