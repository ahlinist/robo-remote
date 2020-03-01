package robo.remote.connection.impl;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import robo.remote.connection.ConnectionHolder;
import robo.remote.connection.Messenger;

import java.net.ServerSocket;
import java.net.Socket;

@Slf4j
@Component
@RequiredArgsConstructor
public class ConnectionHolderImpl implements ConnectionHolder {

    private final ServerSocket serverSocket;
    private final Messenger messenger;

    @Override
    @SneakyThrows
    public void establishConnection() {
        log.info("Awaiting for connection.");
        Socket clientSocket = serverSocket.accept();
        log.info("Connection with a client established.");
        messenger.init(clientSocket.getOutputStream());
    }
}
