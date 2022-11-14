package dwit.sabetech.bootstrap;

import dwit.sabetech.domain.Keyboard;
import dwit.sabetech.repositories.KeyboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class BootStrapKeyboard {

    @Autowired
    private KeyboardRepository keyboardRepository;

    public List<Keyboard> listAll() {
        return keyboardRepository.findAll();
    }

    public Keyboard get(Long id) {
        return keyboardRepository.findById(id).get();
    }

    public void save(Keyboard keyboard) {
        keyboardRepository.save(keyboard);
    }

    public void delete(Long id) {
        keyboardRepository.deleteById(id);
    }
}


