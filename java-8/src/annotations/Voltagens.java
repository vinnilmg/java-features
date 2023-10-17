package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


// @Retention: Informa ao compilador que a anotação ficará disponível durante todo o tempo de execução da JVM
@Retention(RetentionPolicy.RUNTIME)
public @interface Voltagens {
    Voltagem[] value();
}
