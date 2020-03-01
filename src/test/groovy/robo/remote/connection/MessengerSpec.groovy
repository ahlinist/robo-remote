package robo.remote.connection

import robo.remote.connection.impl.MessengerImpl
import spock.lang.Specification
import spock.lang.Subject

class MessengerSpec extends Specification {

    @Subject
    Messenger messenger = new MessengerImpl()

    OutputStream outputStream = Mock OutputStream

    def "test init()"() {
        given:
        messenger.printWriter = null

        when:
        messenger.init(outputStream)

        then:
        messenger.printWriter
    }

    def "test send()"() {
        given:
        String message = 'message'
        PrintWriter printWriter = Mock PrintWriter
        messenger.printWriter = printWriter

        when:
        messenger.send(message)

        then:
        1 * printWriter.println(message)
        0 * _
    }
}
