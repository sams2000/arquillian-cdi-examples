package com.cdi.example;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.Disposes;

public class ConnectionFactory {

	// Our producer method is annotated with @RequestScoped. This means that for
	// a single HTTP request that injects a Connection instance, the producer
	// method will be called once and the Connection reference will be
	// maintained by the container during the life time of that HTTP request,
	// and consequently will be always used in further Connection injection
	// points.
	@Produces
	@RequestScoped
	@QConnection
	public Connection getConnection() {
		Connection conn = new ConnectionImpl();
		conn.connect();
		return conn;
	}

	// The new element here is the disposer method: closeConnection(). A
	// disposer method must be matched against a producer method, ie. it must
	// have a parameter annotated with @Disposes which type matches a producer
	// method return type (in this case Connection type). This parameter must
	// also have the same qualifiers as the producer method (only if any
	// qualifier was used), in this case the @TestConnection qualifier that we
	// will see next.
	public void closeConnection(@Disposes @QConnection Connection connection) {
		connection.closeConnection();
	}

}
