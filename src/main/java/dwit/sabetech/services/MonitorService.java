package dwit.sabetech.services;

import dwit.sabetech.models.Monitor;
import dwit.sabetech.repositories.MonitorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorService {
    //Bean ->
//Controller->Service->Data/Repository->DB

        private  MonitorRepository monitorRepository;

    public MonitorService(MonitorRepository monitorRepository) {
        this.monitorRepository = monitorRepository;
    }

    public List<Monitor> listAll()
        {
           return monitorRepository.findAll();
        }

        public void save(Monitor monitor)
        {
            monitorRepository.save(monitor);
        }

        public  Monitor get(Long id)
        {
            return monitorRepository.findById(id).get();
        }

        public void delete(Long id) {
            monitorRepository.deleteById(id);
        }

}

