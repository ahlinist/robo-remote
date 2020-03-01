package robo.remote.controller;

import lombok.RequiredArgsConstructor;
import robo.remote.dto.MotionDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import robo.remote.model.Direction;
import robo.remote.service.MotionService;

@RestController
@RequiredArgsConstructor
public class MotionController {

    private final MotionService motionService;

    @PostMapping("/move")
    public void move(@RequestBody MotionDto motionDto) {
        Direction direction = motionDto.getDirection();
        motionService.move(direction);
    }
}
