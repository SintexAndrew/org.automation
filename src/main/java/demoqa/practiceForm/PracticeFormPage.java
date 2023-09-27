package demoqa.practiceForm;
import com.codeborne.selenide.*;
import org.openqa.selenium.Keys;
import java.io.File;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage extends Locators {
    // Test Data
    private final String practiceUrl = "https://demoqa.com/automation-practice-form";
    private final String firstName = "TestFirstName";
    private final String lastName = "TestLastName";
    private final String email = "testemail@test.com";
    private final String mobileNumber = "0123456789";
    private final String subjects = "Maths";
    private final String currentAddress = "Test address str. 15";
    private final String state = "NCR";
    private final String city = "Delhi";
    File file = new File("src/main/resources/TextPicture.jpg");
    private final String textPicture = "TextPicture.jpg";
    private final String testMonth = "April";
    private final String expectedResultForGender = "Male";
    private final String expectedResultForHobbies = "Music, Reading";
    private final String expectedTestDate = "15 April,2023";


    public String getTestMonth() {
        return testMonth;
    }

    public String getExpectedTestDate() {
        return expectedTestDate;
    }

    public String getTextPicture() {
        return textPicture;
    }
    //Test logic

    public String getExpectedResultForGender() {
        return expectedResultForGender;
    }

    public String getExpectedResultForHobbies() {
        return expectedResultForHobbies;
    }

    public String getPracticeUrl() {
        return practiceUrl;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getSubjects() {
        return subjects;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public File getFile() {
        return file;
    }

    public void setFile() {
        $(getUploadPicturePath()).uploadFromClasspath(textPicture);
    }

    public void setFirstName() {
        getFirstNameField().val(firstName);
    }

    public void setLastName() {
        getLastNameField().val(lastName);
    }

    public void setEmail() {
        getEmailField().val(email);
    }

    public void pressRadioButtonMale() {
        getRadioButtonMale().click(ClickOptions.usingJavaScript());
    }

    public void pressRadioButtonFemale() {
        getRadioButtonFemale().click(ClickOptions.usingJavaScript());
    }

    public void pressRadioButtonOther() {
        getRadioButtonOther().click(ClickOptions.usingJavaScript());
    }

    public void setMobileNumber() {
        getMobilePhoneField().val(mobileNumber);
    }

    public void setCurrentAddress() {
        getCurrentAddressField().val(currentAddress);
    }

    public void setState() {
        getStateSelect().val(state).sendKeys(Keys.ENTER);
    }

    public void setCity() {
        getCitySelect().val(city).sendKeys(Keys.ENTER);
    }

    public void pressSportsHobbyCheckbox() {
        getHobbyCheckBoxSports().click(ClickOptions.usingJavaScript());
    }

    public void pressReadingHobbyCheckBox() {
        getHobbiesCheckBoxReading().click(ClickOptions.usingJavaScript());
    }

    public void pressMusicHobbyCheckBox() {
        getHobbyCheckBoxMusic().click(ClickOptions.usingJavaScript());
    }

    public void setDate() {
        chooseDatePickerForm();
        chooseYear();
        chooseMonth();
        chooseDate();
    }

    private void chooseDatePickerForm() {
        getDateOfBirthField().click(ClickOptions.usingJavaScript());
    }

    private void chooseDate() {
        getDatePickerDay().click(ClickOptions.usingJavaScript());
    }

    private void chooseMonth() {
        SelenideElement element = getDatePickerMonth().click(ClickOptions.usingJavaScript());
        element.selectOptionContainingText(testMonth);
    }

    private void chooseYear() {
        getDatePickerYear().click(ClickOptions.usingJavaScript());
    }

    public void setSubjects() {
        SelenideElement element = getSubjectAutoForm().click(ClickOptions.usingJavaScript());
        element.val(subjects);
        getSubjectsInput().sendKeys(Keys.ENTER);

    }

    public void pressSubmitButton() {
        getSubmitButton().click(ClickOptions.usingJavaScript());
    }

    public String getExpectedFirstNameAndLastName() {
        String firstName = getFirstName();
        String lastName = getLastName();
        return firstName + " " + lastName;
    }

    public String getActualFirstNameAndLastName() {
        return getStudentResultNameFieldValue().getText();
    }
    public String getExpectedEmail() {
        return getEmail();
    }
    public String getActualEmail() {
        return getStudentResultEmailFieldValue().getText();
    }
    public String getExpectedGender() {
        return getExpectedResultForGender();
    }
    public String getActualGender() {
        return getGenderResultFieldValue().getText();
    }
    public String getExpectedMobile() {
        return getMobileNumber();
    }
    public String getActualMobile() {
        return getMobileResultFieldValue().getText();
    }
    public String getExpectedDate() {
        return getExpectedTestDate();
    }
    public String getActualDate() {
        return getDateResultFieldValue().getText();
    }
    public String getExpectedSubjects() {
        return getSubjects();
    }
    public String getActualSubjects() {
        return getSubjectResultFieldValue().getText();
    }
    public String getExpectedHobbies() {
        return getExpectedResultForHobbies();
    }
    public String getActualHobbies() {
        return getHobbiesResultFieldValue().getText();
    }
    public String getExpectedPicture() {
        return getTextPicture();
    }
    public String getActualPicture() {
        return getPictureResultFieldValue().getText();
    }
    public String getExpectedAddress() {
        return getCurrentAddress();
    }
    public String getActualAddress() {
        return getAddressResultFieldValue().getText();
    }
    public String getExpectedStateAndCity() {
        return getState() + " " + getCity();
    }
    public String getActualStateAndCity() {
        return getStateAndCityResultFieldValue().getText();
    }
}
