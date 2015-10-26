package org.vince.japonais.geb

import geb.spock.GebSpec

class JaponaisSpec extends GebSpec {
    def "Access last lessons with link"() {
        given:
        to TocPage

        when:
        lastLessonsLink.click()

        then:
        at LastLessonsPage
    }

    def "Access last lessons and back to TOC with menus"() {
        given:
        to TocPage

        when:
        timelineMenu.click()

        then:
        at LastLessonsPage

        when:
        homeMenu.click()

        then:
        at TocPage
    }
}
