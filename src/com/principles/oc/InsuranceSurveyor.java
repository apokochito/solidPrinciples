package com.principles.oc;

public abstract class InsuranceSurveyor {

    // Open-Closed
    // Open to add more functionality (expansion) but not changing the previous one
    // For example an enterprise application that needs to keep pace with fast changing business demands

    // Open to support more types of insurance claims
    // Closed for any modifications whenever support for a new type of claim is added
    public abstract boolean isValidClaim();

}
