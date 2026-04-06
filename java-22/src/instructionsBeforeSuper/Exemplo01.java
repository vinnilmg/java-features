package instructionsBeforeSuper;

import static java.util.Objects.isNull;

abstract class Cachorro {
    private final String som;

    protected Cachorro(String som) {
        this.som = som;
    }

    void late() {
        System.out.println(som);
    }
}

class Spitz extends Cachorro {
    public Spitz(String som) {
        if (isNull(som)) {
            throw new NullPointerException("Som do latido não pode ser nulo!!!");
        }
        // Permite instruções antes do super()
        super(som);
    }
}

public class Exemplo01 {
    public static void main(String[] args) {
        new Spitz("Au Au Au")
                .late();
    }
}
