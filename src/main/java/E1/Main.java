package E1;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Director director = new Director();
        Builder builder = new UserBuilder();

        director.makeBasic(builder,"mohanna" ,"1234");
        User u = builder.result();
        System.out.println(u);
        director.makeFull(builder,"mohanna" ,"1234");
        User u1 = builder.result();
        System.out.println(u1);


        User user = builder.reset().setUsername("ali").setPassword("4566").setJob("developer").result();
        System.out.println(user);


//        User user1 = User.builder()
//                .username("njvn")
//                .password("5522")
//                .address("bkjvburfnj")
//                .build();
//        System.out.println(user1);

    }
}
