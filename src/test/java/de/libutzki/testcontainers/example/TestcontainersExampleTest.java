package de.libutzki.testcontainers.example;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
public class TestcontainersExampleTest {

	@Container
	private final PostgreSQLContainer<?> postgresqlContainer = new PostgreSQLContainer<>( "postgres:12.4" )
			.withDatabaseName( "foo" )
			.withUsername( "foo" )
			.withPassword( "secret" )
			.withNetworkMode( "devops-net" );

	@Test
	public void test( ) {
		assertTrue( postgresqlContainer.isRunning( ) );
	}
}