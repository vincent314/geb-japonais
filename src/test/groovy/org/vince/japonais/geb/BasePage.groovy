package org.vince.japonais.geb

import geb.Page

/**
 * Created by vincent on 26/10/15.
 */
class BasePage extends Page {
    static content = {
        homeMenu { $('#home-menu') }
        timelineMenu { $('#timeline-menu') }
    }
}
