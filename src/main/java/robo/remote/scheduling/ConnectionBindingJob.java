package robo.remote.scheduling;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import robo.remote.connection.ConnectionHolder;

@Component
@RequiredArgsConstructor
public class ConnectionBindingJob {

    private final ConnectionHolder connectionHolder;

    @SneakyThrows
    @Scheduled(fixedRate = 1000)
    public void connect() {
        connectionHolder.establishConnection();
    }
}
