package guru.springframework.spring6di.controllers.environment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.plaf.synth.SynthTextAreaUI;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EnvironmentControllerTestDev {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void sayEnv() {
        System.out.println(environmentController.sayEnv());
    }
}