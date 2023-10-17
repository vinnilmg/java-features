package javascript.nashorn;

import javax.script.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exemplo01 {
    public static void main(String[] args) throws FileNotFoundException, ScriptException {
        ScriptEngine se = new ScriptEngineManager().getEngineByName("Nashorn");
        Bindings bind = se.getBindings(ScriptContext.ENGINE_SCOPE);

        // settando variável
        bind.put("goodbye", "FALOUU!");

        // Executa o script
        se.eval(new FileReader("src/javascript/nashorn/exemplo_jjs.js"));
    }
}
