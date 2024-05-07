package guru.springframework.spring6di.services.i18n;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PT")
@Service("i18NService")
public class PortugueseGreetingService implements GreetingService {
    @Override
    public String sayGreeting() { return "Olá mundo"; }
}
