package com.example.awhombackend.domain.persona.service;

import com.example.awhombackend.domain.character.entity.Characteristic;
import com.example.awhombackend.domain.persona.dto.PersonaCharacteristicRequestDto;
import com.example.awhombackend.domain.persona.dto.PersonaQandARequestDto;
import com.example.awhombackend.domain.qanda.entity.QandA;
import com.opencsv.CSVWriter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j(topic = "Persona Service")
public class PersonaService {
    public String personaPromptCharacteristicsUpload(PersonaCharacteristicRequestDto requestDto) throws IOException {
        List<Characteristic> characteristics = requestDto.getPersonCharacteristics();
        String filepath = "characteristics_data.csv";
        try (CSVWriter writer = new CSVWriter(new FileWriter(filepath))) {
            String[] header = {"id", "user_id","content_key", "content_value"};
            writer.writeNext(header);
            for (Characteristic characteristic: characteristics) {
                String[] row = {
                        characteristic.getId().toString(),
                        characteristic.getUserId().toString(),
                        characteristic.getCharacterKey(),
                        characteristic.getCharacterValue()
                };
                writer.writeNext(row);
            }
        }
        return filepath;
    }
    public String personaPromptQandAsUpload(PersonaQandARequestDto requestDto) throws IOException {
        List<QandA> qandAs = requestDto.getPersonaQandAs();
        String filepath = "qandA_data.csv";
        try (CSVWriter writer = new CSVWriter(new FileWriter(filepath))){
            String[] header = {"id", "user_id","question", "answer"};
            writer.writeNext(header);
            for (QandA qandA : qandAs) {
                String[] row = {
                        qandA.getId().toString(),
                        qandA.getUserId().toString(),
                        qandA.getQuestion(),
                        qandA.getAnswer()
                };
                writer.writeNext(row);
            }
        }
        return filepath;
    }
}
