package robo.remote.service

import robo.remote.connection.Messenger
import robo.remote.model.Direction
import robo.remote.service.impl.MotionServiceImpl
import spock.lang.Specification
import spock.lang.Subject

class MotionServiceSpec extends Specification {

    Messenger messenger = Mock Messenger

    @Subject
    MotionService motionService = new MotionServiceImpl(messenger)

    def "test move()"() {
        given:
        Direction direction = Direction.FORWARD
        String message = 'FORWARD'

        when:
        motionService.move(direction)

        then:
        1 * messenger.send(message)
        0 * _
    }
}
