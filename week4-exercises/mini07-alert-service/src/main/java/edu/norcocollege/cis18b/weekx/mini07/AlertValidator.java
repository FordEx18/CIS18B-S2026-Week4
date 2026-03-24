package edu.norcocollege.cis18b.weekx.mini07;

public class AlertValidator {
    public void validate(Alert alert) throws InvalidAlertException {
        // TODO: Validate alert fields.
        if(alert == null) {
            throw new InvalidAlertException("Alert cannot be null.");
        }
        if(alert.getMessage() == null || alert.getMessage().isEmpty()) {
            throw new InvalidAlertException("Alert message cannot be empty.");
        }
        if(alert.getLevel() == null) {
            throw new InvalidAlertException("Alert level must be specified.");
        }
    }
}
