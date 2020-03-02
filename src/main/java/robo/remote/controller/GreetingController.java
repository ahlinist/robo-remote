package robo.remote.controller;

import lombok.SneakyThrows;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import robo.remote.dto.MotionDto;

@Controller
public class GreetingController {

    @SneakyThrows
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public MotionDto greeting(MotionDto message) {
        System.out.println(message);
        return new MotionDto(message.getDirection());
    }
}
