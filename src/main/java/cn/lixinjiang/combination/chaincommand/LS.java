package cn.lixinjiang.combination.chaincommand;

/**
 * @Author lxj
 */
public class LS extends AbstractLS {

    @Override
    protected String getOperateParam() {
        return DEFAULT_PARAM;
    }

    @Override
    protected String echo(CommandVO vo) {
        return FileManager.ls(vo.getCommandName());
    }
}
