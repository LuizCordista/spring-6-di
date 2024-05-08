package guru.springframework.spring6di.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("envService")
public class EnvironmentServiceDev implements EnvironmentService {

    @Override
    public String sayEnv() {
        return "dev";
    }
}
