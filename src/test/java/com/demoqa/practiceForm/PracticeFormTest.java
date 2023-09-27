package com.demoqa.practiceForm;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.demoqa.configuration.browserSettings;
import demoqa.practiceForm.PracticeFormPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


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
    @Test(dependsOnMethods = "practiceFormSmokeTest")
    void validationOfDate(){
        Assert.assertEquals(practiceFormPage.getActualDate(),practiceFormPage.getExpectedDate(),"Actual and expected date is not equal.");
    }
    @Test(dependsOnMethods = "practiceFormSmokeTest")
    void validationOfSubjects(){
        Assert.assertEquals(practiceFormPage.getActualSubjects(),practiceFormPage.getExpectedSubjects(),"Actual and expected subjects are not equal.");
    }
    @Test(dependsOnMethods = "practiceFormSmokeTest")
    void validationOfHobbies(){
        Assert.assertEquals(practiceFormPage.getActualHobbies(),practiceFormPage.getExpectedHobbies(),"Actual and expected hobbies are not equal.");
    }
    @Test(dependsOnMethods = "practiceFormSmokeTest")
    void validationOfPicture(){
        Assert.assertEquals(practiceFormPage.getActualPicture(),practiceFormPage.getExpectedPicture(),"Actual and expected picture are not equal.");
    }
    @Test(dependsOnMethods = "practiceFormSmokeTest")
    void validationOfAdress(){
        Assert.assertEquals(practiceFormPage.getActualAddress(),practiceFormPage.getExpectedAddress(),"Actual and expected picture are not equal.");
    }
    @Test(dependsOnMethods = "practiceFormSmokeTest")
    void validationOfStateAndCity(){
        Assert.assertEquals(practiceFormPage.getActualStateAndCity(),practiceFormPage.getExpectedStateAndCity(),"Actual and expected picture are not equal.");
    }

}
