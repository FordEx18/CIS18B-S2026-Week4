package edu.norcocollege.cis18b.weekx.mini10;

import java.util.List;

public class AlwaysFailRepository implements AlertRepository {
    @Override
    public void save(Alert alert) throws AlertStorageException {
        // TODO: Always throw AlertStorageException.
        throw new AlertStorageException("Simulated storage failure");
    }

    @Override
    public List<Alert> findAll() {
        return List.of();
    }
}
