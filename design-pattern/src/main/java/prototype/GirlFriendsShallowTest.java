package prototype;

import java.util.ArrayList;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/18 22:47
 * @Author: Ling Chen
 * @Description:
 * GirlFriendShallow{name='San Kong', hobbies=[food, make up], secrets=Secret{heigth='170', weight='50'}}
 * GirlFriendShallow{name='San Kong', hobbies=[food, make up], secrets=Secret{heigth='170', weight='50'}}
 * GirlFriend object same ? false
 * GirlFriend's Secretobject same? true
 */
public class GirlFriendsShallowTest {

    public static void main(String[] args) {
        GirlFriendShallow girlFriendShallow = new GirlFriendShallow();
        Secret secret = new Secret();
        secret.setHeigth("170");
        secret.setWeight("50");
        girlFriendShallow.setName("San Kong");
        girlFriendShallow.setHobbies(new ArrayList <String>() {{
            add("food");
            add("make up");
        }});
        girlFriendShallow.setSecrets(secret);
        GirlFriendShallow girlFriendShallow1 = girlFriendShallow.clone();
        System.out.println(girlFriendShallow.toString());
        System.out.println(girlFriendShallow1.toString());
        System.out.println("GirlFriend object same ? " + (girlFriendShallow == girlFriendShallow1));
        System.out.println("GirlFriend's Secretobject same? " + (girlFriendShallow.getSecrets() == girlFriendShallow1.getSecrets()));

    }
}
