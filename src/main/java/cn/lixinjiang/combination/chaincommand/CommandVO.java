package cn.lixinjiang.combination.chaincommand;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 解析一个命令，规定一个命令必须有三项
 * 命令名、选项、操作数
 *
 * @Author lxj
 */
public class CommandVO {
    /**
     * 定义参数名与参数的分隔符号，一般是空格
     */
    public final static String DIVIDE_FLAG = " ";

    /**
     * 定义参数前的符号，Unix一般是-，如 ls -la
     */
    public final static String PREFIX = "-";
    /**
     * 命令名
     */
    private String commandName = "";
    /**
     * 参数列表
     */
    private ArrayList<String> paramList = new ArrayList<>();

    /**
     * 操作数列表
     */
    private ArrayList<String> dataList = new ArrayList<>();

    /**
     * 构造函数传递命令
     *
     * @param commandStr
     */
    public CommandVO(String commandStr) {
        if (commandStr != null && commandStr.length() != 0) {
            // 根据分隔符号拆分出执行符号
            String[] complexStr = commandStr.split(CommandVO.DIVIDE_FLAG);
            // 第一个参数是执行符号
            this.commandName = complexStr[0];
            for (int i = 1; i < complexStr.length; i++) {
                String str = complexStr[i];
                // 包含前缀符号，认为是参数
                if (str.indexOf(CommandVO.PREFIX) == 0) {
                    this.paramList.add(str.replace(CommandVO.PREFIX, "").trim());
                } else {
                    this.dataList.add(str.trim());
                }
            }
        }
    }

    /**
     * 获得命令名
     *
     * @return
     */
    public String getCommandName() {
        return commandName;
    }

    /**
     * 获得参数
     *
     * @return
     */
    public ArrayList<String> getParam() {
        // 为了方便，处理空参
        if (this.paramList.size() == 0) {
            this.paramList.add("");
        }
        return new ArrayList<>(new HashSet<>(this.paramList));
    }

    /**
     * 获得操作数
     *
     * @return
     */
    public ArrayList<String> getData() {
        return this.dataList;
    }
}
