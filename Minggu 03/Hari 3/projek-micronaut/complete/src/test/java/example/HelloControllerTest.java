package example.micronaut;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest // Annotate the class with @MicronautTest so Micronaut will initialize the application context and the embedded server.
public class HelloControllerTest {

    @Inject
    @Client("/")
    RxHttpClient client; // 	Inject the RxHttpClient bean. It is used the execute an HTTP call to the controller.

    @Test
    public void testHello() {
        HttpRequest<String> request = HttpRequest.GET("/hello"); // 	Creating HTTP Requests is easy thanks to Micronaut’s fluid API.
        String body = client.toBlocking().retrieve(request);

        assertNotNull(body);
        assertEquals("Hello World", body);
    }
}