package robo.remote.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import robo.remote.connection.Messenger;
import robo.remote.model.Direction;
import robo.remote.service.MotionService;

@Service
@RequiredArgsConstructor
public class MotionServiceImpl implements MotionService {

    private final Messenger messenger;

    @Override
    public void move(Direction direction) {
        String message = direction.name();
        messenger.send(message);
    }
}
