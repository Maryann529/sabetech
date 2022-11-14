package dwit.sabetech.controller;

import dwit.sabetech.bootstrap.BootStrapKeyboard;
import dwit.sabetech.domain.Keyboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;


@RestController
public class KeyboardController {

    @Autowired
    private BootStrapKeyboard bootStrapKeyboard;


    @GetMapping("/keyboard")
    public List<Keyboard> list() {
        return bootStrapKeyboard.listAll(); }

    @GetMapping("/keyboard/{id}")
    public ResponseEntity<Keyboard>get(@PathVariable Long id)
    {
        try {
            Keyboard keyboard=bootStrapKeyboard.get(id);
            return new ResponseEntity<Keyboard>(keyboard, HttpStatus.OK);
        } catch (NoSuchElementException ex)

        {
            return new ResponseEntity<Keyboard>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/keyboard")
    public void add(@RequestBody Keyboard keyboard) {
        bootStrapKeyboard.save(keyboard);
    }

    @PutMapping("/keyboard/{id}")
    public ResponseEntity<?>update(@RequestBody Keyboard keyboard, @PathVariable Long id) {
        try {
            Keyboard existkeyboard = bootStrapKeyboard.get(id);
            bootStrapKeyboard.save(keyboard);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    public void delete(Long id) {
        bootStrapKeyboard.delete(id);
    }
}
