package dwit.sabetech.controller;

import dwit.sabetech.services.MonitorService;
import dwit.sabetech.models.Monitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class MonitorController {

    @Autowired
    private MonitorService bootStrapMonitor;

    @GetMapping("/monitor")
    public List<Monitor> list() {
        return bootStrapMonitor.listAll(); }

    @GetMapping("/monitor/{id}")
    public ResponseEntity<Monitor> get(@PathVariable Long id)
    {
        try {
            Monitor monitor=bootStrapMonitor.get(id);
            return new ResponseEntity<Monitor>(monitor, HttpStatus.OK);
        } catch (NoSuchElementException ex)

        {
            return new ResponseEntity<Monitor>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/monitor")
    public void add(@RequestBody Monitor monitor) {
        bootStrapMonitor.save(monitor);
    }

    @PutMapping("/monitor/{id}")
    public ResponseEntity<?>update(@RequestBody Monitor monitor, @PathVariable Long id) {
        try {
            Monitor existmonitor = bootStrapMonitor.get(id);
            bootStrapMonitor.save(monitor);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public void delete(Long id) {
        bootStrapMonitor.delete(id);
    }
}