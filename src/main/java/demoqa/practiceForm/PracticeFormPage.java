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
    private final String textPicture = "Textpicture.jpg";
    private final String testMonth = "April";


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

}
