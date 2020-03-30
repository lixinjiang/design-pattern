package cn.lixinjiang.combination.chaincommand;

/**
 * @Author lxj
 */
public class FileManager {
    public static String ls(String path) {
        return "file1\nfile2\nfile3\nfile4";
    }

    public static String ls_l(String paht) {
        String str = "drw-rw-rw root system 1024 2020-03-25 20:49 file1\n";
        str += "drw-rw-rw root system 1024 2020-03-25 20:49 file2\n";
        str += "drw-rw-rw root system 1024 2020-03-25 20:49 file3\n";
        return str;
    }

    public static String ls_a(String path) {
        return ".\n..\nfile1\nfile2\nfile3";
    }
}
