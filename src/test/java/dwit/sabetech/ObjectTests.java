package dwit.sabetech;

import dwit.sabetech.models.Computer;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.junit.jupiter.InjectSoftAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@DataJpaTest
public class ObjectTests {

    @Test
    void test_2_Equal_Computers_Return_True(){
        Computer computer1 = new Computer(12L,"HP","1.6GHz",4, 3, 2, 2);
        Computer computer2 = new Computer(12L,"HP","1.6GHz",4, 3, 2, 2);
        Assertions.assertThat(computer1.equals(computer2)).isTrue();
    }

    @Test
    void test_2_UnEqual_Computers_Return_False(){
        Computer computer1 = new Computer(12L,"HP","1.6GHz",4, 3, 2, 2);
        Computer computer2 = new Computer(12L,"Lenovo","1.6GHz",4, 3, 2, 2);
        Assertions.assertThat(computer1.equals(computer2)).isFalse();
    }
}
