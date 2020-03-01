package robo.remote

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import spock.lang.Specification

@SpringBootTest
class RoboRemoteApplicationSpec extends Specification{

    @Autowired
    ApplicationContext context

    def "test context loads"() {
        expect:
        context != null
        context.containsBean("serverSocket")
    }
}
