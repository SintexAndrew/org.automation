package com.demoqa.practiceForm;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.demoqa.configuration.browserSettings;
import demoqa.practiceForm.PracticeFormPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeFormTest implements browserSettings {
    PracticeFormPage practiceFormPage = new PracticeFormPage();
@BeforeTest
        void setConfiguration() {
    browserSettings.chromeBrowserConfiguration(5000,"1920x1080");
    Selenide.open(practiceFormPage.getPracticeUrl());
}
@Test

    void practiceFormTest(){
    practiceFormPage.setFirstName();
    practiceFormPage.setLastName();
    practiceFormPage.setEmail();
    practiceFormPage.pressRadioButtonMale();
    practiceFormPage.getRadioButtonMale().shouldBe(Condition.selected);
    practiceFormPage.setMobileNumber();
    practiceFormPage.setDate();
    practiceFormPage.setSubjects();
    practiceFormPage.pressMusicHobbyCheckBox();
    practiceFormPage.pressReadingHobbyCheckBox();
    practiceFormPage.setFile();   //Unable to locate element !
    practiceFormPage.setCurrentAddress();
    practiceFormPage.setState();
    practiceFormPage.setCity();
    practiceFormPage.pressSubmitButton();

}
}
