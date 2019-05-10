package com.softserveinc.training;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;
import java.util.stream.Collectors;

public class PracticeForm {

  @FindBy(how = How.NAME, using = "firstname")
  private SelenideElement firstname;

  @FindBy(how = How.NAME, using = "lastname")
  private SelenideElement lastname;

  @FindBy(how = How.ID, using = "datepicker")
  private SelenideElement datepicker;

  @FindBy(how = How.ID, using = "photo")
  private SelenideElement photo;

  @FindBy(how = How.ID, using = "continents")
  private SelenideElement continents;

  @FindBy(how = How.ID, using = "selenium_commands")
  private SelenideElement seleniumCommands;

  @FindBy(how = How.ID, using = "submit")
  private SelenideElement submit;

  @FindBy(how = How.CSS, using = ".bcd")
  private SelenideElement textFiled;

  public String getFirstname() {
    return firstname.getValue();
  }

  public PracticeForm setFirstname(String firstname) {
    this.firstname.setValue(firstname);
    return this;
  }

  public String getLastname() {
    return lastname.getValue();
  }

  public PracticeForm setLastname(String lastname) {
    this.lastname.setValue(lastname);
    return this;
  }

  public String getDatepicker() {
    return datepicker.getValue();
  }

  public PracticeForm setDatepicker(String datepicker) {
    this.datepicker.setValue(datepicker);
    return this;
  }

  public String getPhoto() {
    return photo.getValue();
  }

  public PracticeForm setPhoto(String photo) {
    this.photo.setValue(photo);
    return this;
  }

  public String getContinents() {
    return continents.getValue();
  }

  public PracticeForm setContinents(String continents) {
    this.continents.selectOption(continents);
    return this;
  }

  public String getSeleniumCommands() {
    return seleniumCommands.getValue();
  }

  public PracticeForm setSeleniumCommands(String seleniumCommands) {
    this.seleniumCommands.selectOption(seleniumCommands);
    return this;
  }

  public PracticeForm submit() {
    submit.click();
    return this;
  }

  public PracticeForm setSex(String sex) {
    $$(byName("sex")).filterBy(value(sex)).first().setSelected(true);
    return this;
  }

  public String getSex() {
    return $$(byName("sex")).filterBy(Condition.selected).first().getValue();
  }

  public PracticeForm setExp(String exp) {
    $$(byName("exp")).filterBy(value(exp)).first().setSelected(true);
    return this;
  }

  public String getExp() {
    return $$(byName("exp")).filterBy(Condition.selected).first().getValue();
  }

  public PracticeForm setProfession(String profession, boolean isSelected) {
    $$(byName("profession")).filterBy(value(profession)).first().setSelected(isSelected);
    return this;
  }

  public List<String> getProfessions() {
    return $$(byName("profession")).filterBy(Condition.selected).stream()
        .map(SelenideElement::getValue)
        .collect(Collectors.toList());
  }

  public PracticeForm setTool(String tool, boolean isSelected) {
    $$(byName("tool")).filterBy(value(tool)).first().setSelected(isSelected);
    return this;
  }

  public List<String> getTools() {
    return $$(byName("tool")).filterBy(Condition.selected).stream()
        .map(SelenideElement::getValue)
        .collect(Collectors.toList());
  }

  public String getTextFiled() {
    return textFiled.getText();
  }
}
