package robo.remote.controller;

import lombok.SneakyThrows;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import robo.remote.dto.MotionDto;

@Controller
public class GreetingController {

    @SneakyThrows
    @MessageMapping("/direction")
    @SendTo("/topic/greetings")
    public MotionDto direction(MotionDto message) {
        System.out.println(message);
        return new MotionDto(message.getDirection());
    }
}
