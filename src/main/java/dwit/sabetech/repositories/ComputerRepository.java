package dwit.sabetech.repositories;

import dwit.sabetech.domain.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computer, Long> {

}
