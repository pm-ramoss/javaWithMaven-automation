package com.pedro.ramos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

    public static void pesquisarGoogle() {
        System.setProperty("webdriver.chrome.driver", "src/drive/chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://www.google.com");
    }
}
