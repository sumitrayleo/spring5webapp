package guru.springframework.spring5webapp.openclosed;

public class VehicleInsuranceSurveyor implements InsuranceSurveyor {

    @Override
    public boolean verifyClaim() {
        System.out.println("### Verifying Vehicle Insurance claims");
        return true;
    }
}
