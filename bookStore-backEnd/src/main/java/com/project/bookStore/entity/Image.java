package com.project.bookStore.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "images")
@Data
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 256)
    private String name;

    @Column
    private boolean isThumbnail;

    @Column
    private String url;

    @Column
    @Lob
    private String dataImage;

    @ManyToOne(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.REFRESH
    })
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
}
