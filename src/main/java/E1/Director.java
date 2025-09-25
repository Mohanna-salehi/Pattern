package E1;

public class Director {

    public void makeBasic(Builder builder,String username,String password) {
        builder.reset().setUsername(username).setPassword(password);
    }

    public void makeFull(Builder builder,String username,String password) {
        builder.reset().setUsername(username).setPassword(password).setFirstName("mohanna").setAge(20);
    }


}
