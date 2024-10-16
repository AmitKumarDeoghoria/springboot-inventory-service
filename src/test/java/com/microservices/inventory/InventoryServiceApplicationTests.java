package com.microservices.inventory;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Import;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.shaded.org.hamcrest.Matchers;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@Import(TestcontainersConfiguration.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class InventoryServiceApplicationTests {
	@LocalServerPort
	private Integer port;

	@ServiceConnection
	private static MySQLContainer db=new MySQLContainer("mysql:8.3.0");

	@BeforeEach
	public void setup()
	{
		RestAssured.baseURI="http://localhost";
		RestAssured.port=port;

	}
  static
  {
	  db.start();
  }
	@Test
	void CheckIfInStock()
	{
		RestAssured.given().when()
				.get("/api/inventory?sku_code=iphone-10&quantity=5")
				.then()
				.statusCode(200)
				.body(equalTo("true"));

	}

}
