package interfac.privates.methods;


public class TesteEventos {
    public static void main(String[] args) {
        // Interface
        LogEventsI log = new LogEventsI() {
        };

        log.logInfo("Mensagem de Informação.");
        log.logDebug("Mensagem de Debug.");
        log.logWarn("Mensagem de Warning.");
    }
}
