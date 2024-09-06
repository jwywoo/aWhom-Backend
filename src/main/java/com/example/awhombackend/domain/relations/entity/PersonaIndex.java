package com.example.awhombackend.domain.relations.entity;

import com.example.awhombackend.domain.indexvector.entity.IndexVector;
import com.example.awhombackend.domain.persona.entity.Persona;
import com.example.awhombackend.domain.qanda.entity.QandA;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class PersonaIndex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @ManyToOne
    @JoinColumn(name="indexvector_id")
    private IndexVector indexVector;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;
}
