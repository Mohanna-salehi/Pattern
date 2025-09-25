package E1;

public interface Builder {
    Builder reset();
    Builder setFirstName(String firstName);
    Builder setLastName(String lastName);
    Builder setFatherName(String fatherName);
    Builder setAge(int age);
    Builder setJob(String job);
    Builder setIsMarried(boolean isMarried);
    Builder setAddress(String address);
    Builder setUsername(String username);
    Builder setPassword(String password);
    Builder setBirthday(String birthday);

    User result() throws IllegalAccessException;
}
