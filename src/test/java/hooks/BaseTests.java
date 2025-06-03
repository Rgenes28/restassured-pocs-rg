package hooks;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.jupiter.api.BeforeEach;

import static io.restassured.RestAssured.given;
import static restassured.Utils.Constantes.*;
import static restassured.Utils.Constantes.CONTENT_TYPE;

public abstract class BaseTests {

    @BeforeEach
    public void setup(){
        RestAssured.baseURI = BASE_URL;
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        RestAssured.requestSpecification = given()
                .header(HEADER_KEY, HEADER_VALUE)
                .contentType(CONTENT_TYPE);
    }
}
