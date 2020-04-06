package cn.lixinjiang.newpattern.selection1;

import java.util.ArrayList;

/**
 * @Author lxj
 */
public interface IUserProvider {
    public ArrayList<User> findUser(IUserSpecification userSpec);
}
