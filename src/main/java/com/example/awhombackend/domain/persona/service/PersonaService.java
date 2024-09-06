package com.example.awhombackend.domain.persona.service;

import com.example.awhombackend.domain.persona.dto.PersonaRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j(topic = "Persona Service")
public class PersonaService {
    public String personaPromptUpload(PersonaRequestDto personaRequestDto) {
        return "Success!";
    }
}
