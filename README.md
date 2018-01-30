# fat-aar
package module dependencies code all to module aar

1. 在project的build.gradle 中添加classpath

classpath 'cn.mrobot.tools:fat-aar-plugin:+'

2. 在module的build.gradle中应用插件

apply plugin: 'cn.mrobot.tools.fat-aar'

3. 在module的build.gradle 中添加 插件开关项

fatLibraryExt {
    enable true
}

4. 如果需要在打包时去除部分文件，格式如下

fatLibraryExt {
    enable true
    excludeFiles {
      libs {
        fileNames('test.jar')
        }
       jni {
         fileNames('test/test.so')
        }
    }
}

libs 为 aar包中的文件类型
fileName 为 文件相对与文件类型目录的路径
        
        
