package com.example.awhombackend.domain.persona.service;

import com.example.awhombackend.domain.characteristic.entity.Characteristic;
import com.example.awhombackend.domain.persona.dto.PersonaCharacteristicRequestDto;
import com.example.awhombackend.domain.persona.dto.PersonaQandARequestDto;
import com.example.awhombackend.domain.qanda.entity.QandA;

import com.opencsv.CSVWriter;
import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j(topic = "Persona Service")
public class PersonaService {

    private final MongoTemplate mongoTemplate;

    public String personaPromptCharacteristicsUpload(PersonaCharacteristicRequestDto requestDto) throws IOException {
        List<Characteristic> characteristics = requestDto.getPersonCharacteristics();
        for (Characteristic characteristic : characteristics) {
            mongoTemplate.insert(characteristic);
        }
        return "Saved on to MongoDB: Persona Characteristics";
    }
    public String personaPromptQandAsUpload(PersonaQandARequestDto requestDto) throws IOException {
        List<QandA> qandAs = requestDto.getPersonaQandAs();
        for (QandA qandA : qandAs) {
            mongoTemplate.insert(qandA);
        }
        return "Saved on to MongoDB: Persona QandA";
    }
}
