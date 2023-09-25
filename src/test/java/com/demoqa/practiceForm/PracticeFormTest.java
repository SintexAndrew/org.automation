package com.demoqa.practiceForm;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.demoqa.configuration.browserSettings;
import demoqa.practiceForm.Locators;
import demoqa.practiceForm.PracticeFormPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class PracticeFormTest implements browserSettings {
    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @BeforeClass
    void setConfiguration() {
        browserSettings.chromeBrowserConfiguration(5000, "1920x1080");
        Selenide.open(practiceFormPage.getPracticeUrl());
    }

    @Test
    void practiceFormSmokeTest() {
        practiceFormPage.setFirstName();
        practiceFormPage.setLastName();
        practiceFormPage.setEmail();
        practiceFormPage.getEmailField().shouldHave(Condition.appear);
        practiceFormPage.pressRadioButtonMale();
        practiceFormPage.getRadioButtonMale().shouldBe(Condition.selected);
        practiceFormPage.setMobileNumber();
        practiceFormPage.setDate();
        practiceFormPage.setSubjects();
        practiceFormPage.pressMusicHobbyCheckBox();
        practiceFormPage.pressReadingHobbyCheckBox();
        practiceFormPage.setFile();
        practiceFormPage.setCurrentAddress();
        practiceFormPage.setState();
        practiceFormPage.setCity();
        practiceFormPage.pressSubmitButton();

    }

    @Test(dependsOnMethods = "practiceFormSmokeTest")
    void validationOfTheEnteredFirstNameAndLastName() {
        Assert.assertEquals(practiceFormPage.getActualFirstNameAndLastName(), practiceFormPage.getExpectedFirstNameAndLastName(), "Actual and expected first and last names are not equal.");
    }
    @Test(dependsOnMethods = "practiceFormSmokeTest")
    void validationOfTheEnteredEmail(){
        Assert.assertEquals(practiceFormPage.getActualEmail(),practiceFormPage.getExpectedEmail(),"Actual and expected email is not equal.");
    }
    @Test(dependsOnMethods = "practiceFormSmokeTest")
    void validationOfGender(){
        Assert.assertEquals(practiceFormPage.getActualGender(),practiceFormPage.getExpectedGender(),"Actual and expected gender is not equal.");
    }
    @Test(dependsOnMethods = "practiceFormSmokeTest")
    void validationOfMobile(){
        Assert.assertEquals(practiceFormPage.getActualMobile(),practiceFormPage.getExpectedMobile(),"Actual and expected mobile is not equal.");
    }

}
