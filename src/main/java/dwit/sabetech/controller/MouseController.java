package dwit.sabetech.controller;

import dwit.sabetech.services.BootStrapMouse;
import dwit.sabetech.models.Mouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class MouseController {


    @Autowired
    private BootStrapMouse bootStrapMouse;

    @GetMapping("/mouse")
    public List<Mouse> list() {
        return bootStrapMouse.listAll(); }

    @GetMapping("/mouse/{id}")
    public ResponseEntity<Mouse> get(@PathVariable Long id)
    {
        try {
            Mouse mouse=bootStrapMouse.get(id);
            return new ResponseEntity<Mouse>(mouse, HttpStatus.OK);
        } catch (NoSuchElementException ex)

        {
            return new ResponseEntity<Mouse>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/mouse")
    public void add(@RequestBody Mouse mouse) {
        bootStrapMouse.save(mouse);
    }

    @PutMapping("/mouse/{id}")
    public ResponseEntity<?>update(@RequestBody Mouse mouse, @PathVariable Long id) {
        try {
            Mouse existmouse = bootStrapMouse.get(id);
            bootStrapMouse.save(mouse);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public void delete(Long id) {
        bootStrapMouse.delete(id);
    }
}