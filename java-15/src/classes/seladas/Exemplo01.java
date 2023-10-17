package java15.classes.seladas;

abstract sealed class Carnivoro permits Leao {
    public void euSou() {
        System.out.println(" eu sou carnívoro!");
    }
}

abstract sealed class Herbivoro permits Coelho {
    public void euSou() {
        System.out.println(" eu sou herbívoro!");
    }
}

final class Leao extends Carnivoro {
    public void euSou() {
        System.out.print("Eu sou um leão,");
        super.euSou();
    }
}

final class Coelho extends Herbivoro {
    public void euSou() {
        System.out.print("Eu sou um Coelho,");
        super.euSou();
    }
}

public class Exemplo01 {
    public static void main(String[] args) {
        var leao = new Leao();
        leao.euSou();

        var coelho = new Coelho();
        coelho.euSou();
    }
}
