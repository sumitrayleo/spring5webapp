package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publisher;
import guru.springframework.spring5webapp.repository.AuthorRepository;
import guru.springframework.spring5webapp.repository.BookRepository;
import guru.springframework.spring5webapp.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public DataInitializer(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started bootstrap .... ");

        Publisher publisher = new Publisher("Blackwell", "London", "London", "12345");
        publisherRepository.save(publisher);
        System.out.println("Number of Publishers added = " + publisherRepository.count());

        Author author1 = new Author("Sumit Ray");
        Book book1 = new Book("Java with no brains");
        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);
        book1.setPublisher(publisher);
        publisher.getBooks().add(book1);

        authorRepository.save(author1);
        bookRepository.save(book1);
        publisherRepository.save(publisher);

        Author author2 = new Author("Roli");
        Book book2 = new Book("Ecology with emotion");
        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);
        book2.setPublisher(publisher);
        publisher.getBooks().add(book2);

        authorRepository.save(author2);
        bookRepository.save(book2);
        publisherRepository.save(publisher);

        System.out.println("Number of Books added = " + bookRepository.count());
        System.out.println("Number of Books for Publisher = " + publisher.getBooks().size());
    }
}
