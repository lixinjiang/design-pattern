package cn.lixinjiang.combination.chaincommand;

/**
 * @Author lxj
 */
public class LS_L extends AbstractLS {

    @Override
    protected String getOperateParam() {
        return L_PARAM;
    }

    @Override
    protected String echo(CommandVO vo) {
        return FileManager.ls_l(vo.getCommandName());
    }

}
