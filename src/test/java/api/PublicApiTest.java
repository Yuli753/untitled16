package api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class PublicApiTest {

    @Test
    void getPostById() {
        RestAssured
                .given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts/2")
                .then()
                .statusCode(200)
                .body("id", equalTo(2));
    }
}