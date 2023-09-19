package com.demoqa.configuration;

import com.codeborne.selenide.Configuration;

public interface browserSettings {
    static void chromeBrowserConfiguration(long timeout, String browserSize){
        Configuration.browser = "chrome";
        Configuration.timeout = timeout;
        Configuration.browserSize = browserSize;
    }
    static void firefoxBrowserConfiguration(long timeout, String browserSize){
        Configuration.browser = "firefox";
        Configuration.timeout = timeout;
        Configuration.browserSize = browserSize;
    }
    static void edgeBrowserConfiguration(long timeout, String browserSize){
        Configuration.browser = "edge";
        Configuration.timeout = timeout;
        Configuration.browserSize = browserSize;
    }
}
