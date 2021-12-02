package lesson4;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicReference;

public class MainTest extends TestBase{
    private final AtomicReference<String> URL = new AtomicReference<>("https://demoqa.com/automation-practice-form");

    @Test
    void studentRegistration() {
        registrationPage
                .openPage(URL.get())
                .fillFirstName(randomFaker.firstName)
                .fillLastName(randomFaker.lastName)
                .fillEmail()
                .selectGender()
                .fillNumber()
                .fillDateOfBirth("3","6",1997)
                .setSubject()
                .setHobby()
                .uploadPicture()
                .fillAddress(randomFaker.address)
                .selectState()
                .selectCity()
                .submitClick()
                // проверки
                .validate("Student Name", randomFaker.firstName + " " + randomFaker.lastName)
                .validate("Student Email", "aidana@gmail.com")
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


