package cn.lixinjiang.combination.chaincommand;

/**
 * @Author lxj
 */
public class Invoker {
    public String exec(String commandStr) {
        String result = "";
        CommandVO vo = new CommandVO(commandStr);
        if (CommandEnum.getNames().contains(vo.getCommandName())) {
            String className = CommandEnum.valueOf(vo.getCommandName()).getValue();
            Command command;
            try {
                command = (Command) Class.forName(className).newInstance();
                result = command.execute(vo);
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            result = "无法执行的命令，请检查命令格式";
        }
        return result;
    }
}
