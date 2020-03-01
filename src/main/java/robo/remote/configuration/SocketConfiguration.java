package robo.remote.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.net.ServerSocket;

@Configuration
public class SocketConfiguration {

    @Value("${socket.port}")
    private int port;

    @Bean
    public ServerSocket serverSocket() throws IOException {
        return new ServerSocket(port);
    }
}
