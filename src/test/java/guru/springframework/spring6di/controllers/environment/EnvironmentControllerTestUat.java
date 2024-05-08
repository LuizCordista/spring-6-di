package guru.springframework.spring6di.controllers.environment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"Uat", "PT"})
@SpringBootTest
class EnvironmentControllerTestUat {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void sayEnv() {
        System.out.println(environmentController.sayEnv());
    }
}