package dwit.sabetech.controller;

import dwit.sabetech.bootstrap.BootStrapComputer;
import dwit.sabetech.domain.Computer;
import dwit.sabetech.repositories.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class ComputerController {


    @Autowired
    private BootStrapComputer bootStrapComputer;


    @GetMapping("/computer")
    public List<Computer> list() {
        return bootStrapComputer.listAll(); }

    @GetMapping("/computer/{id}")
    public ResponseEntity<Computer> get(@PathVariable Long id)
    {
        try {
            Computer computer = bootStrapComputer.get(id);
            return new ResponseEntity<Computer>(computer, HttpStatus.OK);
        } catch (NoSuchElementException ex)

        {
            return new ResponseEntity<Computer>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/computer")
    public void add(@RequestBody Computer computer) {
        Computer computer1;
        bootStrapComputer.save(computer);
    }

    @PutMapping("/computer/{id}")
    public ResponseEntity<?>update(@RequestBody Computer computer, @PathVariable Long id) {
        try {
            Computer existComputer = bootStrapComputer.get(id);
            bootStrapComputer.save(computer);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public void delete(Long id) {
        bootStrapComputer.delete(id);
    }
}

