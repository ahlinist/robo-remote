package robo.remote.controller

import spock.lang.Specification
import spock.lang.Subject

class UIControllerSpec extends Specification {

    @Subject
    UIController uiController = new UIController()

    def "test index()"() {
        expect:
        uiController.index() == 'index.html'
    }
}
