package guru.springframework.spring5webapp.openclosed;

public class HealthInsuranceSurveyor implements InsuranceSurveyor {

    @Override
    public boolean verifyClaim() {
        System.out.println("### Verifying Health Insurance claims");
        return true;
    }
}
