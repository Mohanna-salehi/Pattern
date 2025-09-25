//package E1;
//
//public class UserBuilder implements Builder{
//    private User user;
//
//
//    @Override
//    public Builder reset() {
//        user = new User();
//        return this;
//    }
//
//    @Override
//    public Builder setFirstName(String firstName) {
//         user.setFirstName(firstName);
//         return this;
//    }
//
//    @Override
//    public Builder setLastName(String lastName) {
//        user.setLastName(lastName);
//        return this;
//    }
//
//    @Override
//    public Builder setFatherName(String fatherName) {
//        user.setFatherName(fatherName);
//        return this;
//    }
//
//    @Override
//    public Builder setAge(int age) {
//        user.setAge(age);
//        return this;
//    }
//
//    @Override
//    public Builder setJob(String job) {
//        user.setJob(job);
//        return this;
//    }
//
//    @Override
//    public Builder setIsMarried(boolean isMarried) {
//        user.setMarried(isMarried);
//        return this;
//    }
//
//    @Override
//    public Builder setAddress(String address) {
//        user.setAddress(address);
//        return this;
//    }
//
//    @Override
//    public Builder setUsername(String username) {
//        user.setUsername(username);
//        return this;
//    }
//
//    @Override
//    public Builder setPassword(String password) {
//        user.setPassword(password);
//        return this;
//    }
//
//    @Override
//    public Builder setBirthday(String birthday) {
//        user.setBirthday(birthday);
//        return this;
//    }
//
//    @Override
//    public User result() throws IllegalAccessException {
//        mandatoryValidation();
//        return user;
//    }
//
//    private void mandatoryValidation() throws IllegalAccessException {
//        if(user.getUsername().isEmpty() || user.getUsername()==null){
//            throw new IllegalAccessException("enter username");
//        }
//        if (user.getPassword().isEmpty() || user.getPassword()==null){
//            throw new IllegalAccessException("enter password");
//        }
//    }
//}
