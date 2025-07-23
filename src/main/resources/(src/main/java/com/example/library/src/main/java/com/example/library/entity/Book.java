package com.example.library.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "books")
@NamedQueries({
    @NamedQuery(name = "Book.findTop10New", query = "FROM Book b ORDER BY b.publishYear DESC"),
    @NamedQuery(name = "Book.findMostBorrowed", query = "FROM Book b ORDER BY b.borrowCount DESC")
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;

    private String genre;

    @Column(name = "publish_year")
    private Integer publishYear;

    private String status; // AVAILABLE, BORROWED, DAMAGED, etc.

    @Column(name = "borrow_count")
    private Integer borrowCount;
}
