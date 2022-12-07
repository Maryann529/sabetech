package dwit.sabetech.services;

import dwit.sabetech.models.Webcam;
import dwit.sabetech.repositories.WebcamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BootStrapWebcam {

        @Autowired
        private WebcamRepository webcamRepository;

        public List<Webcam> listAll()
        {
            return webcamRepository.findAll();
        }

        public void save(Webcam webcam)
        {
            webcamRepository.save(webcam);
        }

        public  Webcam get(Long id)
        {
            return webcamRepository.findById(id).get();
        }

        public void delete(Long id)
        {
            webcamRepository.deleteById(id);
        }
}
