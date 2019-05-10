package com.softserveinc.training;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class PracticeTest {

  @Test
  public void PracticeTest() {
    PracticeForm form = open("https://www.toolsqa.com/automation-practice-form/",
        PracticeForm.class);
    WebDriverRunner.getWebDriver().manage().window().maximize();

    form.setFirstname("Homer")
        .setLastname("Simpson")
        .setDatepicker("12.05.1956")
        .setProfession("Manual Tester", true)
        .setProfession("Automation Tester", true)
        .setPhoto("C:/temp/homer-simpson.jpg")
        .setTool("Selenium IDE", true)
        .setTool("Selenium Webdriver", true)
        .setContinents("Europe")
        .setSeleniumCommands("WebElement Commands")
        .setSeleniumCommands("Wait Commands")
        .submit();

    assertThat(form.getTextFiled(), is("Text1"));
  }
}

