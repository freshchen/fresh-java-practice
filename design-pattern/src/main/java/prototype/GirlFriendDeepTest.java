package prototype;

import java.util.ArrayList;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/18 23:21
 * @Author: Ling Chen
 * @Description: 通过序列号实现深复制
 * GirlFriendShallow{name='San Kong', hobbies=[food, make up], secrets=Secret{heigth='170', weight='50'}}
 * GirlFriendShallow{name='San Kong', hobbies=[food, make up], secrets=Secret{heigth='170', weight='50'}}
 * GirlFriend object same ? false
 * GirlFriend's Secretobject same ? false
 */
public class GirlFriendDeepTest {

    public static void main(String[] args) throws Exception {
        GirlFriendDeep girlFriendDeep = new GirlFriendDeep();
        Secret secret = new Secret();
        secret.setHeigth("170");
        secret.setWeight("50");
        girlFriendDeep.setName("San Kong");
        girlFriendDeep.setHobbies(new ArrayList <String>() {{
            add("food");
            add("make up");
        }});
        girlFriendDeep.setSecrets(secret);
        GirlFriendDeep girlFriendDeep1 = girlFriendDeep.deepclone();
        System.out.println(girlFriendDeep.toString());
        System.out.println(girlFriendDeep1.toString());
        System.out.println("GirlFriend object same ? " + (girlFriendDeep == girlFriendDeep1));
        System.out.println("GirlFriend's Secretobject same ? " + (girlFriendDeep.getSecrets() == girlFriendDeep1.getSecrets()));
    }
}
