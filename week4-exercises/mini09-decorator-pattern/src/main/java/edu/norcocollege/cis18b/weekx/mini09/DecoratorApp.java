package edu.norcocollege.cis18b.weekx.mini09;

public class DecoratorApp {
    public static void main(String[] args) {
        Alert alert = new Alert(1, "CPU usage exceeded threshold", AlertLevel.CRITICAL);
        // TODO: Create a BasicAlertHandler.
            AlertHandler handler = new BasicAlertHandler();
        // TODO: Wrap it in LoggingAlertHandlerDecorator.
        handler = new LoggingAlertHandlerDecorator(handler);
        // TODO: Handle the alert.
        handler.handle(alert);
    }
}
