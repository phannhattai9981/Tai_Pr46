package mvc.service;

import mvc.entity.BookEntity;
import mvc.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Object findAll() {
        return bookRepository.findAll();
    }


    public List<BookEntity> findByNameContainingOrAuthorContaining(String searchInput, String searchInput1) {
        return bookRepository.findByNameContainingOrAuthorContaining(searchInput,searchInput1);
    }

    public BookEntity save(BookEntity book) {
        return bookRepository.save(book);
    }


    public BookEntity getByID(int id) {
        return bookRepository.getByID(id);

    }


    public  BookEntity deleteById(int id) {
       return bookRepository.deleteById(id);
    }
}
