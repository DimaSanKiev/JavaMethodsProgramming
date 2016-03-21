package design_patterns._03_structural._07_proxy._02_connection_pool_example;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// unsafe connection pool
public class ConnectionPool {
    private BlockingQueue<Connection> connectionQueue;

    public ConnectionPool(final int POOL_SIZE) throws SQLException {
        connectionQueue = new ArrayBlockingQueue<Connection>(POOL_SIZE);
        for (int i = 0; i < POOL_SIZE; i++) {
            Connection connection = null; // create connection
            connectionQueue.offer(connection);
        }
    }

    public Connection getConnection() throws InterruptedException {
        Connection connection;
        connection = connectionQueue.take();
        return connection;
    }

    public void closeConnection(Connection connection) {
        connectionQueue.offer(connection);
    }
}
