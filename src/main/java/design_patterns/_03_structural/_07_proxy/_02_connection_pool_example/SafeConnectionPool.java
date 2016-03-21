package design_patterns._03_structural._07_proxy._02_connection_pool_example;

import java.sql.SQLException;
import java.util.concurrent.ArrayBlockingQueue;

// safe connection pool
public class SafeConnectionPool<T> {
    private ArrayBlockingQueue<T> connectionQueue;

    public SafeConnectionPool(final int POOL_SIZE) throws SQLException {
        connectionQueue = new ArrayBlockingQueue<T>(POOL_SIZE);
        for (int i = 0; i < POOL_SIZE; i++) {
            T connection = null;    // create connection
            connectionQueue.offer(connection);
        }
    }

    public T getConnection() throws InterruptedException {
        T connection;
        connection = connectionQueue.take();
        return connection;
    }

    public void closeConnection(T connection) {
        connectionQueue.offer(connection);      // possible connections leaks
    }

    // more methods
}
