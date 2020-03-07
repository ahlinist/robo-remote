package robo.remote.controller;

import lombok.SneakyThrows;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import robo.remote.dto.MotionDto;

@Controller
public class GreetingController {

    @SneakyThrows
    @MessageMapping("/server/direction")
    @SendTo("/client/direction")
    public MotionDto direction(MotionDto message) {
        System.out.println(message);
        return message;
    }
}
