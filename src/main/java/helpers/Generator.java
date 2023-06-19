package helpers;

import com.github.javafaker.Faker;

/** The class generates various data for tests**/
public class Generator {
    Faker faker = new Faker();

    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            middleName = faker.name().lastName(),
            company = faker.company().name(),
            inn = faker.number().digits(9),
            email = faker.internet().emailAddress(),
            longName = faker.lorem().characters(130,false,false),
            phoneNumb = "+7900" + faker.number().digits(7),
            nameProduct = faker.name().title();
}
