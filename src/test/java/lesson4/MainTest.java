package lesson4;

import org.junit.jupiter.api.Test;

public class MainTest extends TestBase{
    private final String URL = "https://demoqa.com/automation-practice-form&quot";

    @Test
    void studentRegistration() {
        registrationPage
                .openPage(URL)
                .fillFirstName(randomFaker.firstNameInput)
                .fillLastName(randomFaker.lastNameInput)
                .fillEmail(randomFaker.emailAddress)
                .selectGender("Female")
                .fillNumber("87776665544")
                .fillDateOfBirth("3","6",1997)
                .setSubject("Math")
                .setHobby("Music")
                .uploadPicture()
                .fillAddress(randomFaker.address)
                .selectState("NCR")
                .selectCity("Delhi")
                .submitClick()
                // проверки
                .validate("Student Name", randomFaker.firstNameInput + " " + randomFaker.lastNameInput)
                .validate("Student Email", randomFaker.emailAddress)
                .validate("Gender", "Female")
                .validate("Mobile", "87776665544")
                .validate("Date of Birth","13 June,1997")
                .validate("Subjects", "Math")
                .validate("Hobbies", "Music")
                .validate("Picture", "girl.PNG")
                .validate("Address", randomFaker.address)
                .validate("State and City", "NCR Delhi");
    }


}


