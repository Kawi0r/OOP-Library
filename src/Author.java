public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        setName(name);
        setEmail(email);
        setGender(gender);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

}
