package org.vince.japonais.geb

/**
 * Created by vincent on 05/03/16.
 */
class KanjiPage extends BasePage {
    static url = "/#/kanji/1"

    static at = {
        waitFor { firstKanji }
    }

    static content = {
        firstKanji { $("a", "data-ng-click": "vm.showKanji(char)")[0] }
        kanjiTitle { $(".well h1") }
        kanjiMeaning { $(".well strong") }
        kanjiReadings { $(".well h3").text().trim() }
    }
}
