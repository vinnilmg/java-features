package interfac.privates.methods;

public interface LogEventsI {
    default void logInfo(String mensagem) {
        logar(mensagem, "INFO");
    }

    default void logWarn(String mensagem) {
        logar(mensagem, "WARN");
    }

    default void logDebug(String mensagem) {
        logar(mensagem, "DEBUG");
    }

    private void logar(String mensagem, String level) {
        System.out.println(String.format("[%s] %s", level, mensagem));
    }
}
