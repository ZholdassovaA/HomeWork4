package lesson4;

import com.codeborne.selenide.SelenideElement;
import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    public SelenideElement
             firstNameInput = $("#firstName"),
             lastNameInput = $("#lastName"),
             emailInput = $("#userEmail"),
             gender = $(byText("Female")),
             userNumberInput = $("#userNumber"),
             subjectInput = $("#subjectInput"),
             hobby = $(byText("Music")),
             uploadPicture = $("#uploadPicture"),
             currentAddressInput = $("#currentAddress"),
             selectState = $("#state"),
             selectCity = $("#city"),
             clickSubmit = $("#submit"),
             responsTable = $(".table-responsive");

    public RegistrationPage openPage(String url) {
        // открываем страницу для тестирования
        open(url);
        return this;
    }
    public RegistrationPage fillFirstName(String name) {
        // заполняем поля
        // имя
        firstNameInput.setValue(name);
        return this;
    }
    public RegistrationPage fillLastName(String secondName) {
        // фамилия
        lastNameInput.setValue(secondName);
        return this;
    }
    public RegistrationPage fillEmail(String email) {
        // адрес электронной почты
        emailInput.setValue(email);
        return this;
    }
    public RegistrationPage selectGender(String value) {
        // пол
        gender.find(byText(value)).click();
        return this;
    }
    public RegistrationPage fillNumber(String number) {
        // номер мобильного телефона
        userNumberInput.setValue(number);
        return this;
    }
    public RegistrationPage fillDateOfBirth(String day, String month, int year ) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__day-select").selectOptionByValue(day);
        $(".react-datepicker__month-select").selectOptionByValue(month);
        $(".react-datepicker__year-select").selectOptionByValue(String.valueOf(year));
        return this;
    }
    public RegistrationPage setSubject(String letter) {
        // предмет
        subjectInput.setValue(letter).pressEnter();
        return this;
    }
    public RegistrationPage setHobby(String value) {
        // хобби
        hobby.find(byText(value)).click();
        return this;
    }
    public RegistrationPage uploadPicture() {
        // загрузить фотографию
        uploadPicture.uploadFile(new File("src//test//resources//girl.jpg"));
        return this;
    }
    public RegistrationPage fillAddress(String address) {
        // адрес
        currentAddressInput.setValue(address);
        return this;
    }
    public RegistrationPage selectState(String value) {
        // штат
        selectState.find(byText(value)).click();
        return this;
    }
    public RegistrationPage selectCity(String value) {
        // город
        selectCity.find(byText(value)).click();
        return this;
    }
    public RegistrationPage submitClick() {
        // утверждение
        clickSubmit.click();
        return this;
    }
    public RegistrationPage validate(String label, String value) {
        responsTable
                .$(byText(label))
                .parent()
                .shouldHave(text(value));
        return this;
    }
}
