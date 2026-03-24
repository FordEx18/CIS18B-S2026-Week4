package edu.norcocollege.cis18b.weekx.mini07;


//AlerService class
public class AlertService {
    private final AlertRepository repository;
    private final AlertValidator validator;
    // Constructor
    public AlertService(AlertRepository repository) {
        this.repository = repository;
        this.validator = new AlertValidator();
    }
    //Process alert method
    public void processAlert(Alert alert)
            throws InvalidAlertException, AlertStorageException, AlertProcessingException {
                //Validate and save alert with proper exception handling.
                try {
                    validator.validate(alert);
                    repository.save(alert);
                } catch (InvalidAlertException | AlertStorageException e) {
                    throw e; // Rethrow known exceptions.
                } catch (Exception e) {
                    throw new AlertProcessingException("Unexpected error during alert processing", e);
                }
    }
}
