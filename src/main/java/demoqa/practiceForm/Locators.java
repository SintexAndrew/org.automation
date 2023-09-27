package demoqa.practiceForm;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Locators {
    private final SelenideElement firstNameField = $(By.id("firstName"));
    private final SelenideElement lastNameField = $(By.id("lastName"));
    private final SelenideElement emailField = $(By.id("userEmail"));

    private final SelenideElement radioButtonMale = $x("//input[@id = 'gender-radio-1']");
    private final SelenideElement radioButtonFemale = $x("//input[@id = 'gender-radio-2']");
    private final SelenideElement radioButtonOther = $x("//input[@id = 'gender-radio-3']");
    private final SelenideElement mobilePhoneField = $(By.id("userNumber"));

    private final SelenideElement dateOfBirthField = $(By.id("dateOfBirthInput"));
    private final SelenideElement datePickerYear = $x("//select[@class = 'react-datepicker__year-select']");
    private final SelenideElement datePickerMonth = $x("//select[@class = 'react-datepicker__month-select']");
    private final SelenideElement subjectAutoForm = $(By.id("subjectsInput"));
    private final SelenideElement subjectsInput = $(By.id("subjectsInput"));
    private final SelenideElement uploadPicturePath = $(By.id("uploadPicture"));
    private final SelenideElement currentAddressField = $(By.id("currentAddress"));

    public SelenideElement getSubjectsInput() {
        return subjectsInput;
    }
    //The 15th day of the month will be used.

    private final SelenideElement datePickerDay = $x("//div[@class = 'react-datepicker__day react-datepicker__day--015 react-datepicker__day--weekend']");
    private final SelenideElement hobbyCheckBoxSports = $(By.id("hobbies-checkbox-1"));
    private final SelenideElement hobbiesCheckBoxReading = $(By.id("hobbies-checkbox-2"));
    private final SelenideElement hobbyCheckBoxMusic = $(By.id("hobbies-checkbox-3"));
    private final SelenideElement citySelect = $(By.id("react-select-4-input"));
    private final SelenideElement stateSelect = $(By.id("react-select-3-input"));
    private final SelenideElement submitButton = $(By.id("submit"));
    private final SelenideElement studentResultNameFieldValue = $x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//tr[contains(td, 'Student Name')]/td[2]");
    private final SelenideElement studentResultEmailFieldValue = $x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//tr[contains(td, 'Student Email')]/td[2]");
    private final SelenideElement mobileResultFieldValue = $x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//tr[contains(td, 'Mobile')]/td[2]");
    private final SelenideElement dateResultFieldValue = $x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//tr[contains(td, 'Date of Birth')]/td[2]");
    private final SelenideElement subjectResultFieldValue = $x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//tr[contains(td, 'Subjects')]/td[2]");
    private final SelenideElement pictureResultFieldValue = $x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//tr[contains(td, 'Picture')]/td[2]");
    private final SelenideElement addressResultFieldValue = $x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//tr[contains(td, 'Address')]/td[2]");
    private final SelenideElement stateAndCityResultFieldValue = $x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//tr[contains(td, 'State and City')]/td[2]");
    private final SelenideElement genderResultFieldValue = $x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//tr[contains(td, 'Gender')]/td[2]");
    private final SelenideElement hobbiesResultFieldValue = $x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//tr[contains(td, 'Hobbies')]/td[2]");
    private final SelenideElement appreciationForFillingOutTheForm = $x("//div[@id= 'example-modal-sizes-title-lg' and text() = 'Thanks for submitting the form']");

    public SelenideElement getDateResultFieldValue() {
        return dateResultFieldValue;
    }

    public SelenideElement getAppreciationForFillingOutTheForm() {
        return appreciationForFillingOutTheForm;
    }

    public SelenideElement getStudentResultNameFieldValue() {
        return studentResultNameFieldValue;
    }

    public SelenideElement getStudentResultEmailFieldValue() {
        return studentResultEmailFieldValue;
    }

    public SelenideElement getMobileResultFieldValue() {
        return mobileResultFieldValue;
    }

    public SelenideElement getSubjectResultFieldValue() {
        return subjectResultFieldValue;
    }

    public SelenideElement getPictureResultFieldValue() {
        return pictureResultFieldValue;
    }

    public SelenideElement getAddressResultFieldValue() {
        return addressResultFieldValue;
    }

    public SelenideElement getStateAndCityResultFieldValue() {
        return stateAndCityResultFieldValue;
    }

    public SelenideElement getGenderResultFieldValue() {
        return genderResultFieldValue;
    }

    public SelenideElement getHobbiesResultFieldValue() {
        return hobbiesResultFieldValue;
    }

    public SelenideElement getSubmitButton() {
        return submitButton;
    }

    public SelenideElement getFirstNameField() {
        return firstNameField;
    }

    public SelenideElement getLastNameField() {
        return lastNameField;
    }

    public SelenideElement getEmailField() {
        return emailField;
    }

    public SelenideElement getRadioButtonMale() {
        return radioButtonMale;
    }

    public SelenideElement getRadioButtonFemale() {
        return radioButtonFemale;
    }

    public SelenideElement getRadioButtonOther() {
        return radioButtonOther;
    }

    public SelenideElement getMobilePhoneField() {
        return mobilePhoneField;
    }

    public SelenideElement getDateOfBirthField() {
        return dateOfBirthField;
    }

    public SelenideElement getDatePickerYear() {
        return datePickerYear;
    }

    public SelenideElement getDatePickerMonth() {
        return datePickerMonth;
    }

    public SelenideElement getSubjectAutoForm() {
        return subjectAutoForm;
    }

    public SelenideElement getUploadPicturePath() {
        return uploadPicturePath;
    }

    public SelenideElement getCurrentAddressField() {
        return currentAddressField;
    }

    public SelenideElement getDatePickerDay() {
        return datePickerDay;
    }

    public SelenideElement getHobbyCheckBoxSports() {
        return hobbyCheckBoxSports;
    }

    public SelenideElement getHobbiesCheckBoxReading() {
        return hobbiesCheckBoxReading;
    }

    public SelenideElement getHobbyCheckBoxMusic() {
        return hobbyCheckBoxMusic;
    }

    public SelenideElement getCitySelect() {
        return citySelect;
    }

    public SelenideElement getStateSelect() {
        return stateSelect;
    }


}
