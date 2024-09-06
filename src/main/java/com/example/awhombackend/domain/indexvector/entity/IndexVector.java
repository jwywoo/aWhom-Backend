package com.example.awhombackend.domain.indexvector.entity;

import com.example.awhombackend.domain.persona.entity.Persona;
import com.example.awhombackend.global.entity.Timestamped;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class IndexVector extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "index_url", nullable = false)
    private String indexUrl;

    public IndexVector(Long userId, String indexUrl) {
        this.userId = userId;
        this.indexUrl = indexUrl;
    }
}
