package cn.lixinjiang.combination.chaincommand;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author lxj
 */
public abstract class Command {
    public abstract String execute(CommandVO vo);

    public final List<? extends CommandName> buildChain(Class<? extends CommandName> abstractClass) {
        //取出所有的命令名下的子类
        List<Class> classes = ClassUtils.getSonClass(abstractClass);
        List<CommandName> commandNameList = new ArrayList<>();
        for (Class c : classes) {
            CommandName commandName = null;

            try {
                commandName = (CommandName) Class.forName(c.getName()).newInstance();

            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
            if (commandNameList.size() > 0) {
                commandNameList.get(commandNameList.size() - 1).setNext(commandName);
            }
            commandNameList.add(commandName);
        }
        return commandNameList;
    }
}
