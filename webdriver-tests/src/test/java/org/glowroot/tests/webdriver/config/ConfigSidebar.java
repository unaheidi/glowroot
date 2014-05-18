/*
 * Copyright 2013-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.glowroot.tests.webdriver.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.glowroot.tests.webdriver.Utils;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.linkText;

/**
 * @author Trask Stalnaker
 * @since 0.5
 */
public class ConfigSidebar {

    private final WebDriver driver;

    public ConfigSidebar(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getGeneralLink() {
        return Utils.withWait(driver, getSidebar(), linkText("General"));
    }

    public WebElement getPointcutsLink() {
        return Utils.withWait(driver, getSidebar(), linkText("Adhoc pointcuts"));
    }

    private WebElement getSidebar() {
        return Utils.withWait(driver, cssSelector("div.gt-sidebar"));
    }
}