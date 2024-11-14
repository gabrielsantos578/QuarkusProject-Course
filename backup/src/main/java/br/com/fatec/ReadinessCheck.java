package br.com.fatec;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

@Readiness
public class ReadinessCheck implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
        if (Produto.listAll() != null) {
            return HealthCheckResponse.up("Ready for use!");
        } else {
            return HealthCheckResponse.down("Not ready for use!");
        }
    }
}
