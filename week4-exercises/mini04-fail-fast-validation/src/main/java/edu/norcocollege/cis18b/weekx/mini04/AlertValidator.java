package edu.norcocollege.cis18b.weekx.mini04;

public class AlertValidator {
    public void validate(Alert alert) throws InvalidAlertException {
        // TODO: Throw if alert is null.
            if(alert == null) {
                throw new InvalidAlertException("Alert cannot be null.");
            }
        // TODO: Throw if alert message is null or blank.
        if(alert.getMessage() == null || alert.getMessage().isBlank()) {
            throw new InvalidAlertException("Alert message cannot be null or blank.");
        }
        // TODO: Throw if alert level is null.
        if(alert.getLevel() == null) {
            throw new InvalidAlertException("Alert level cannot be null.");
        }
    }
}
