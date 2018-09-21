package JavaBase;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by garen on 2018/8/3.
 */
public class NewJavaScript {
    public static void main(String[] args) throws ScriptException, FileNotFoundException {
        /**jdk1.8中新的JavaScript内置引擎jdk.nashorn.api.scripting.NashornScriptEngine**/
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine engine = scriptEngineManager.getEngineByName("JavaScript");
        System.out.println(engine.getClass().getName());
        //执行一个简单的JavaScript语法
        System.out.println("Result : " + engine.eval( "function f() { return 1; }; f() + 1;" ));
        engine.eval(new FileReader("src/main/java/JavaBase/Test.js"));//引入外部js文件
        Object ret = engine.eval("Func(\"Hello,It\'s \")"); //向外部js文件特定函数传递参数，并获取返回值
        System.out.println(ret);

    }
}
