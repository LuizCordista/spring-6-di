package guru.springframework.spring6di.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Qa")
@Service("envService")
public class EnvironmentServiceQa implements EnvironmentService {

    @Override
    public String sayEnv() {
        return "qa";
    }
}
