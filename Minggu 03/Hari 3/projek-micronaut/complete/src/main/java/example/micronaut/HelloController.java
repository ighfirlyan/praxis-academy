package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/hello") //	The class is defined as a controller with the @Controller annotation mapped to the path /hello
public class HelloController {
    @Get // 	The @Get annotation is used to map the index method to all requests that use an HTTP GET
    @Produces(MediaType.TEXT_PLAIN) // 	By default a Micronaut’s response uses application/json as Content-Type. We are returning a String not a JSON object. Because of that, we set it to text/plain.
    public String index() {
        return "Hello World"; A String "Hello World" is returned as the result
    }
}