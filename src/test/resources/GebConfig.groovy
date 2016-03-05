import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

driver = {
    new ChromeDriver(
            new ChromeOptions(binary: new File('/usr/bin/chromium-browser'))
    )
}

baseUrl = "http://localhost:9000"

reportsDir = "target/reports"