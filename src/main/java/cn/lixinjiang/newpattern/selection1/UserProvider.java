package cn.lixinjiang.newpattern.selection1;

import java.util.ArrayList;

/**
 * @Author lxj
 */
public class UserProvider implements IUserProvider {

    private ArrayList<User> userList;

    public UserProvider(ArrayList<User> userList) {
        this.userList = userList;
    }

    @Override
    public ArrayList<User> findUser(IUserSpecification userSpec) {
        ArrayList<User> result = new ArrayList<>();
        for (User u : userList) {
            if (userSpec.isStatisfiedBy(u)) {
                result.add(u);
            }
        }
        return result;
    }
}
