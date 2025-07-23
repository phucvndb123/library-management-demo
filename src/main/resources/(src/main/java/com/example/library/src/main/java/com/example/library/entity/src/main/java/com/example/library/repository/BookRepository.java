package com.example.library.repository;

import com.example.library.entity.Book;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>, JpaSpecificationExecutor<Book> {
    // Có thể bổ sung custom query nếu cần
}
