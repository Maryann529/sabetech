package dwit.sabetech.bootstrap;

import dwit.sabetech.domain.Computer;
import dwit.sabetech.repositories.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BootStrapComputer  {

    @Autowired
    private ComputerRepository computerRepository;

    public List<Computer> listAll()
    {
        return computerRepository.findAll();
    }

    public void save(Computer computer)
    {
        computerRepository.save(computer);
    }

    public Computer get(Long id)
    {
        return computerRepository.findById(id).get();
    }

    public void delete(Long id)
    {
        computerRepository.deleteById(id);
    }

}


