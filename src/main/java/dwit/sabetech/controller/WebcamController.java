package dwit.sabetech.controller;

import dwit.sabetech.services.BootStrapWebcam;
import dwit.sabetech.models.Webcam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class WebcamController {

    @Autowired
    private BootStrapWebcam bootStrapWebcam;

    @GetMapping("/webcam")
    public List<Webcam> list() {
        return bootStrapWebcam.listAll(); }

    @GetMapping("/webcam/{id}")
    public ResponseEntity<Webcam> get(@PathVariable Long id)
    {
        try {
            Webcam webcam=bootStrapWebcam.get(id);
            return new ResponseEntity<Webcam>(webcam, HttpStatus.OK);
        } catch (NoSuchElementException ex)

        {
            return new ResponseEntity<Webcam>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/webcam")
    public void add(@RequestBody Webcam webcam) {
        bootStrapWebcam.save(webcam);
    }

    @PutMapping("/webcam/{id}")
    public ResponseEntity<?>update(@RequestBody Webcam webcam, @PathVariable Long id) {
        try {
            Webcam existWebcam = bootStrapWebcam.get(id);
            bootStrapWebcam.save(webcam);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public void delete(Long id) {
        bootStrapWebcam.delete(id);
    }
}
