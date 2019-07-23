package com.example.demo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringJUnit4ClassRunner.class)
/*@SpringApplicationConfiguration(classes=DemoApplication.class)
@WebIntegrationTest(randomPort=true)*/
class Demotest {
    private static FirefoxDriver browser;
    @Value("${local.server.port}")
    private int port;
    @BeforeClass
    public static void openBrowser() {
        browser = new FirefoxDriver();
        browser.manage().timeouts()
                .implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterClass
    public static void closeBrowser() {
        browser.quit();
    }
}
