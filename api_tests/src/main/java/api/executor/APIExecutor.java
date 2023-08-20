package api.executor;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class APIExecutor {

    public Response get(String endpoint) {
        return given()
                .log().everything()
                .when()
                .get(endpoint);
    }
}
