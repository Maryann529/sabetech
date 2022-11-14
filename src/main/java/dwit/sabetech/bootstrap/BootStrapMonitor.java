package dwit.sabetech.bootstrap;

import dwit.sabetech.domain.Monitor;
import dwit.sabetech.repositories.MonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BootStrapMonitor {

        @Autowired
        private  MonitorRepository monitorRepository;

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

