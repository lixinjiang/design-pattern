package cn.lixinjiang.combination.chaincommand;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author lxj
 */
public enum CommandEnum {
    ls("cn.lixinjiang.combination.chaincommand.LSCommand");

    private String value = "";

    CommandEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static List<String> getNames() {
        CommandEnum[] commandEnums = CommandEnum.values();
        List<String> names = new ArrayList<>();
        for (CommandEnum c : commandEnums) {
            names.add(c.name());
        }
        return names;
    }
}
