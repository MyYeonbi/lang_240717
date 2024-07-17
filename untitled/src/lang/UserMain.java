package lang;

public class UserMain {
    public static void main(String[] args) {
        User kim = new User("김시완",30);
        User lee = new User("이태웅",27);
        User kim2 = new User("김시완",30);
        User kim3 = kim;

        System.out.println( kim.equals(kim2));
        System.out.println(kim.toString());
        System.out.println(kim);

        System.out.println(kim == kim2);
    }
}
