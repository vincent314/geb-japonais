import org.openqa.selenium.firefox.FirefoxDriver

driver = { new FirefoxDriver()
//    new ChromeDriver(
//            new ChromeOptions(binary: new File('/usr/bin/chromium-browser'))
//    )
}

environments {
    development {
        baseUrl = "http://localhost:9000"
    }

    prod {
        baseUrl = "http://japonais.ovh"
    }
}

reportsDir = "target/reports"

test= "toto"