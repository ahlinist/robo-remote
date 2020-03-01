package robo.remote.scheduling

import robo.remote.connection.ConnectionHolder
import spock.lang.Specification
import spock.lang.Subject

class ConnectionBindingJobSpec extends Specification {

    ConnectionHolder connectionHolder = Mock ConnectionHolder

    @Subject
    ConnectionBindingJob connectionBindingJob = new ConnectionBindingJob(connectionHolder)

    def "test connect()"() {
        when:
        connectionBindingJob.connect()

        then:
        1 * connectionHolder.establishConnection()
        0 * _
    }
}
