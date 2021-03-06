package guru.springframework.spring5webapp.controller;

import guru.springframework.spring5webapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping(value = "/api/books")
    public String getBooks(Model model){
        model.addAttribute("books", bookRepository.findAll());
        return "books/list";
    }
}
