package guru.springframework.spring6di.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Uat")
@Service("envService")
public class EnvironmentServiceUat implements EnvironmentService {

    @Override
    public String sayEnv() {
        return "uat";
    }
}
