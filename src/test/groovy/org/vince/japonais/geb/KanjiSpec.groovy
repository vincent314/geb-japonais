package org.vince.japonais.geb

import geb.spock.GebReportingSpec

/**
 * Created by vincent on 05/03/16.
 */
class KanjiSpec extends GebReportingSpec {

    def "Access Kanji page"() {
        given:
        to KanjiPage

        when:
        firstKanji.click()

        then:
        kanjiTitle.text() == "木"
        kanjiMeaning.text() == "arbre, bois"
        kanjiReadings == "ボク   モク   き   こ"
    }

}