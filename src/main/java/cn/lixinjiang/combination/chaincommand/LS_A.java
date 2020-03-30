package cn.lixinjiang.combination.chaincommand;

/**
 * @Author lxj
 */
public class LS_A extends AbstractLS {

    @Override
    protected String getOperateParam() {
        return A_PARAM;
    }

    @Override
    protected String echo(CommandVO vo) {
        return FileManager.ls_a(vo.getCommandName());
    }
}
