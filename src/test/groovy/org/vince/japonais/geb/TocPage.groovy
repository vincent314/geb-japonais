package org.vince.japonais.geb

import geb.Page

class TocPage extends BasePage {
    static at = { waitFor { title == "Table des matières" } }

    static content = {
        lastLessonsLink { $('#timelineLink') }
    }
}
