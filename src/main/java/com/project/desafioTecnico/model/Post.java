package com.project.desafioTecnico.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String texto;

    private LocalDateTime dataPostagem;

    private Integer upvote;

    public Post(String texto, Integer upvote, LocalDateTime dataPostagem) {
        this.texto = texto;
        this.upvote = 0;
        this.dataPostagem = LocalDateTime.now();
    }
}
