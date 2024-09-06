package com.example.awhombackend.domain.relations.entity;

import com.example.awhombackend.domain.character.entity.Characteristic;
import com.example.awhombackend.domain.persona.entity.Persona;
import com.example.awhombackend.global.entity.Timestamped;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class PersonaCharacter extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "character_id")
    private Characteristic character;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;
}
