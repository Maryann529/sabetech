package dwit.sabetech.services;
import dwit.sabetech.models.Mouse;
import dwit.sabetech.repositories.MouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BootStrapMouse {

    @Autowired
    private MouseRepository mouseRepository;

    public List<Mouse> listAll() {
        return mouseRepository.findAll();
    }

    public void save(Mouse mouse) {
        mouseRepository.save(mouse);
    }

    public Mouse get(Long id) {
        return mouseRepository.findById(id).get();
    }

    public void delete(Long id) {
        mouseRepository.deleteById(id);
    }
}



