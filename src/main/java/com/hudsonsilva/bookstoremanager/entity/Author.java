package com.hudsonsilva.bookstoremanager.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity // INFORMAR QUE É UMA ENTIDADE
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Author{

    @Id // INFORMAR QUE É UMA VARIÁVEL "ID"
    @GeneratedValue(strategy = GenerationType.IDENTITY) //  ANOTAÇÃO QUE INCREMENTA UM ID A CADA INSERÇÃO
    private Long id;

    @Column(nullable = false, unique = true) // SERVE PARA INFORMAR AS CONDIÇÕES DE CADA VARIAVEL (NAME É UMA VARIÁVEL QUE NÃO PODE RECEBER NULL E TBM É UNICA)
    private String name;

    @Column(nullable = false) // NULLABLE  = FALSE :  VARIAVEL NÃO PODE RECEBER NULL
    private Integer age;

}