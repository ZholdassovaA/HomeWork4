package lesson4;

import com.github.javafaker.Faker;

import java.util.Locale;

public class RandomFaker {
    Faker faker = new Faker(new Locale("ru"));
    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String address = faker.address().fullAddress();

}
