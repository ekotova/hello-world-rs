package hello.world.rs;

/**
 * Created by ekotova on 10.01.2017.
 */
public class HelloWorldRsResponse {
    private String text;

    public HelloWorldRsResponse(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
