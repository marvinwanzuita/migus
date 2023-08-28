package com.mawit.migus.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_gostos")
@Data
public class Gosto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
}
