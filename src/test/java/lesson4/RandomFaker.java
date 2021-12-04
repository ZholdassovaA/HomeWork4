package lesson4;

import com.github.javafaker.Faker;

import java.util.Locale;

public class RandomFaker {
    Faker faker = new Faker(new Locale("ru"));
    public String firstNameInput = faker.name().firstName();
    public String lastNameInput = faker.name().lastName();
    public String address = faker.address().fullAddress();
    public String emailAddress = faker.internet().emailAddress();

}
