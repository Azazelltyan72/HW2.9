public class Passport {

    private long passportNumber;

    private String lastName;

    private String firstName;

    private String patronymic;

    private String dateOfBirth;

    public Passport(long passportNumber, String lastName, String firstName, String patronymic, String dateOfBirth) {
        this.passportNumber = passportNumber;
        this.patronymic = patronymic;
        if (lastName != null && !lastName.isBlank() && !lastName.isEmpty()) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Заполните поле: Фамилия");
        }
        if (firstName != null && !firstName.isBlank() && !firstName.isEmpty()) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("Заполните поле: Имя");
        }
        if (dateOfBirth != null && !dateOfBirth.isBlank() && !dateOfBirth.isEmpty()) {
            this.dateOfBirth = dateOfBirth;
        } else {
            throw new IllegalArgumentException("Заполните поле: Дата рождения");
        }
    }

    public String getPatronymic() {
        return patronymic;
    }

    public long getPassportNumber() {
        return passportNumber;
    }

    public final String getLastName() {
        if (lastName != null && !lastName.isBlank() && !lastName.isEmpty()) {
            return lastName;
        } else {
            throw new IllegalArgumentException("Заполните поле: Фамилия");
        }
    }

    public final String getFirstName() {
        if (firstName != null && !firstName.isBlank() && !firstName.isEmpty()) {
            return firstName;
        } else {
            throw new IllegalArgumentException("Заполните поле: Имя");
        }
    }

    public final String getDateOfBirth() {
        if (dateOfBirth != null && !dateOfBirth.isBlank() && !dateOfBirth.isEmpty()) {
            return dateOfBirth;
        } else {
            throw new IllegalArgumentException("Заполните поле: Дата рождения");
        }
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNumber=" + passportNumber +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}