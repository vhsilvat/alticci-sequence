package org.victor.hugo;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class AlticciSequenceResourceTest {

	@Test
	void testAlticci() {

		given()
				.pathParam("index", 9)
		.when()
				.get("/alticci/{index}")
		.then()
		.assertThat()
				.statusCode(200)
				.contentType("application/json");
	}
}
