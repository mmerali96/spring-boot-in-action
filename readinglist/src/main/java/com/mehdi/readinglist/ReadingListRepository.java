package com.mehdi.readinglist;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

// this will persist the reading list to the database
// this interface will be implemented automatically by spring at runtime.
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
