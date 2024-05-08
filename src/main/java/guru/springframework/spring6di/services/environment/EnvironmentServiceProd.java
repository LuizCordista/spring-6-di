package guru.springframework.spring6di.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Prod")
@Service("envService")
public class EnvironmentServiceProd implements EnvironmentService {

    @Override
    public String sayEnv() {
        return "prod";
    }
}
