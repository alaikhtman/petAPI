package api.qa.testTeam;
import io.restassured.RestAssured;

import org.junit.jupiter.api.BeforeAll;

import static testSteps.apiRequests.Configuration.URI;

public class BaseTest {


    public String token;

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = URI;
    }

}
