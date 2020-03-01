package robo.remote.controller

import robo.remote.dto.MotionDto
import robo.remote.model.Direction
import robo.remote.service.MotionService
import spock.lang.Specification
import spock.lang.Subject

class MotionControllerSpec extends Specification {

    MotionService motionService = Mock MotionService

    @Subject
    MotionController motionController = new MotionController(motionService)

    MotionDto motionDto = Mock MotionDto

    def "test move()"() {
        given:
        Direction direction = Direction.RIGHT

        when:
        motionController.move(motionDto)

        then:
        1 * motionDto.direction >> direction
        1 * motionService.move(direction)
        0 * _
    }
}
