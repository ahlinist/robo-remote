package robo.remote.connection;

import java.io.OutputStream;

public interface Messenger {

    void init(OutputStream outputStream);

    void send(String message);
}
