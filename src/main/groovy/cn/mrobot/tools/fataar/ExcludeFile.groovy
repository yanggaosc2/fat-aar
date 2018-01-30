package cn.mrobot.tools.fataar

/**
 *  过滤文件
 */
public class ExcludeFile {
    /**
     * 文件所在根目录
     */
    String name;
    /**
     * 文件名集合
     */
    List<String> fileNames;

    public ExcludeFile(String name) {
        this.name = name;
    }

    def fileNames(String[] fileName) {
        this.fileNames = fileName.toList();
    }

    @Override
    String toString() {
        return name + ' : ' + fileNames;
    }
}