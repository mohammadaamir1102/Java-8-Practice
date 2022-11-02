package com.session;

public enum BREDecisionPoint {
    PRODUCT_RULES("Product_Rules"),
    NB_SCRUTINY("NB_Scrutiny"),
    NB_CONVERSION("NB Conversion Rules"),
    AGENT_VALIDATION_RULES("NB_BranchRules"),
    MEDICAL("MEDICAL"),
    STP_RULES("STP_RULES"),
    FINANCIAL_RULES("Financial_Rules"),
    RCU_RULES("RCU_Rules"),
    JET_RULES("JET_Rules"),
    REINSURANCE_RULES("REINSURANCE_Rules"),
    OTHER_RULES("Other");

    private final String decisionPointName;

    private BREDecisionPoint(String decisionPointName) {
        this.decisionPointName = decisionPointName;
    }

    public String getDecisionPointName() {
        return decisionPointName;
    }
}
