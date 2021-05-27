package com.hudsonsilva.bookstoremanager.entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor


public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer pages;

    @Column(nullable = false)
    private Integer chapters;

    @Column(nullable = false)
    private String isbn;

    @Column(name = "Publisher_Name", nullable = false, unique = true) // NAME = "PUBLISHER_NAME" : MAPEAMENTO PARA O BD, AO INVER DE IR PUBLISHERNAME, VAI IR PUBLISHER_NAME
    private String publisherName;

    // ANOTAÇÃO PARA O RELACIONAMETO DAS ENTIDADES, UM UNICO AUTOR PARA UM UNICO LIVRO
    //Cascade serve para inserir(PERSIST), atualizar(MERGE) e remover(REMOVE) tudo de uma vez só
    @ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}) //LAZY OTIMIZA AS CONSULTAS
    @JoinColumn(name = "author_id")
    private Author author;



}
