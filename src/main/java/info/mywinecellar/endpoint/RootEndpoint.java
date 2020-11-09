package info.mywinecellar.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootEndpoint {

    @GetMapping(value = "/")
    public String baseEndpoint() {
        return "Hello world";
    }
}
