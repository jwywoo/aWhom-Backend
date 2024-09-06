package com.example.awhombackend.domain.persona.controller;

import com.example.awhombackend.domain.persona.dto.PersonaRequestDto;
import com.example.awhombackend.domain.persona.service.PersonaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j(topic = "Persona Controller")
public class PersonaController {
    private final PersonaService personaService;

    @PostMapping(value="/persona/prompt")
    public String personaPromptUpload(@RequestBody PersonaRequestDto personaRequestDto) {
        return personaService.personaPromptUpload(personaRequestDto);
    }
}
