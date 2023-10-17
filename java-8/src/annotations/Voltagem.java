package annotations;

import java.lang.annotation.Repeatable;

// Anotação customizada
@Repeatable(Voltagens.class)
public @interface Voltagem {
    String tensao();
}
