package robo.remote.connection.impl;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import robo.remote.connection.Messenger;

import java.io.OutputStream;
import java.io.PrintWriter;

@Component
public class MessengerImpl implements Messenger {

    private static final boolean AUTO_FLUSH = true;

    @Getter
    @Setter
    private PrintWriter printWriter;

    @Override
    public void init(OutputStream outputStream) {
        printWriter = new PrintWriter(outputStream, AUTO_FLUSH);
    }

    @Override
    public void send(String message) {
        printWriter.println(message);
    }
}
