package web.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty (message = "Name cannot be empty")
    @Pattern(regexp = "[a-zA-Z_0-9]+", message = "Name can contain only letters and/or numbers")
    @Size(min = 1, max = 50, message = "Name should be between 1 and 50 characters")
    private String name;

    @NotBlank(message = "Lastname cannot be empty")
    @Pattern(regexp = "[a-zA-Z_0-9]+", message = "Lastname can contain only letters and/or numbers")
    @Size(min = 1, max = 50, message = "Name should be between 1 and 50 characters")
    private String lastName;

    @Min(value = 1900, message = "Not less than 1900")
    @Max(value = 2005)
    private int yearOfBirth;

    public User() {
    }

    public User(String name, String lastName, int yearOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
