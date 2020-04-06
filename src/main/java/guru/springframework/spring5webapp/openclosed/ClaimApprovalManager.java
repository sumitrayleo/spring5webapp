package guru.springframework.spring5webapp.openclosed;

public class ClaimApprovalManager {

    public void processClaim(InsuranceSurveyor insuranceSurveyor){
        if(insuranceSurveyor.verifyClaim()){
            System.out.println("Claim is verified and is under processing ...");
        }
    }
}
