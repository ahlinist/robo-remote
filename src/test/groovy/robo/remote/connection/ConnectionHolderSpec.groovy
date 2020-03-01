package robo.remote.connection

import robo.remote.connection.impl.ConnectionHolderImpl
import spock.lang.Specification
import spock.lang.Subject

class ConnectionHolderSpec extends Specification {

    ServerSocket serverSocket = Mock ServerSocket
    Messenger messenger = Mock Messenger

    @Subject
    ConnectionHolder connectionHolder = new ConnectionHolderImpl(serverSocket, messenger)

    Socket clientSocket = Mock Socket
    OutputStream outputStream = Mock OutputStream

    def "test establishConnection()"() {
        when:
        connectionHolder.establishConnection()

        then:
        1 * serverSocket.accept() >> clientSocket
        1 * clientSocket.outputStream >> outputStream
        1 * messenger.init(outputStream)
        0 * _
    }
}
