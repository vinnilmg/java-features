package classe.baseada.valor;

public class Warning {
    public static void main(String[] args) {
        // Gera a Warning: 'Integer(int)' is deprecated and marked for removal
        Integer number = new Integer(5);

        // Para ignorar a warning
        @SuppressWarnings("removal")
        Double numberTwo = new Double(5.1);
    }
}
