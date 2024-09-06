package com.example.awhombackend.domain.relations.entity;

import com.example.awhombackend.domain.persona.entity.Persona;
import com.example.awhombackend.domain.qanda.entity.QandA;
import com.example.awhombackend.global.entity.Timestamped;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class PersonaQandA extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @ManyToOne
    @JoinColumn(name="qanda_id")
    private QandA qandA;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;
}
