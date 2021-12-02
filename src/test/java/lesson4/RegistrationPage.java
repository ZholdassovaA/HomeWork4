package lesson4;

import com.codeborne.selenide.SelenideElement;
import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    public SelenideElement
             firstName = $("#firstName"),
             lastName = $("#lastName"),
             emailInput = $("#userEmail"),
             gender = $(byText("Female")),
             userNumber = $("#userNumber"),
             subjectInput = $("#subjectInput"),
             maths = $(byText("Maths")),
             hobby = $(byText("Music")),
             uploadPicture = $("#uploadPicture"),
             currentAddress = $("#currentAddress"),
             state = $("#state"),
             city = $("#city"),
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
        $(firstName).setValue(name);
        return this;
    }
    public RegistrationPage fillLastName(String secondName) {
        // фамилия
        $(lastName).setValue(secondName);
        return this;
    }
    public RegistrationPage fillEmail() {
        // адрес электронной почты
        $(emailInput).setValue("aidana@gmail.com");
        return this;
    }
    public RegistrationPage selectGender() {
        // пол
        $(gender).click();
        return this;
    }
    public RegistrationPage fillNumber() {
        // номер мобильного телефона
        $(userNumber).setValue("87776665544");
        return this;
    }
    public RegistrationPage fillDateOfBirth(String day, String month, int year ) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__day-select").selectOptionByValue(day);
        $(".react-datepicker__month-select").selectOptionByValue(month);
        $(".react-datepicker__year-select").selectOptionByValue(String.valueOf(year));
        return this;
    }
    public RegistrationPage setSubject() {
        // предмет
        $(subjectInput).click();
        $(maths).sendKeys("Ma");
        $(byText("Math")).click();
        return this;
    }
    public RegistrationPage setHobby() {
        // хобби
        $(hobby).click();
        return this;
    }
    public RegistrationPage uploadPicture() {
        // загрузить фотографию
        $(uploadPicture).uploadFile(new File("src//test//resources//girl.jpg"));
        return this;
    }
    public RegistrationPage fillAddress(String address) {
        // адрес
        $(currentAddress).setValue(address);
        return this;
    }
    public RegistrationPage selectState() {
        // штат
        $(state).click();
        $(byText("NCR")).click();
        return this;
    }
    public RegistrationPage selectCity() {
        // город
        $(city).click();
        $(byText("Delhi")).click();
        return this;
    }
    public RegistrationPage submitClick() {
        // утверждение
        $(clickSubmit).click();
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
