package hello.world.rs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ekotova on 10.01.2017.
 */
@RestController
public class HelloWorldRsController {
    private static String text = "Hello, World!";

    @RequestMapping("/get")
    public HelloWorldRsResponse response() {
        return new HelloWorldRsResponse(text);
    }

}
