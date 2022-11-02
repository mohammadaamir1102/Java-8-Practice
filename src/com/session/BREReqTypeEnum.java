package com.session;

import java.util.ArrayList;
import java.util.List;

public enum BREReqTypeEnum {
    MEDICAL("Medical", ProposalFlagTypeEnum.MEDICAL_REQUIRED_STATUS, BREDecisionPoint.MEDICAL, ProposalFlagTypeEnum.BRE_MEDICAL_CHECK_STATUS),
    NON_MEDICAL("Non-Medical", ProposalFlagTypeEnum.NON_MEDICAL_REQUIRED_STATUS, BREDecisionPoint.MEDICAL, ProposalFlagTypeEnum.BRE_MEDICAL_CHECK_STATUS),
    TELE("Tele-UnderWriting", ProposalFlagTypeEnum.TELE_REQUIRED_STATUS, BREDecisionPoint.MEDICAL, ProposalFlagTypeEnum.BRE_MEDICAL_CHECK_STATUS),
    VIDEO("Video FMR",ProposalFlagTypeEnum.VIDEO_FMR_REQUIRED_STATUS, BREDecisionPoint.MEDICAL, ProposalFlagTypeEnum.BRE_MEDICAL_CHECK_STATUS),
    AUTO_SPAWN("",ProposalFlagTypeEnum.AUTO_SPAWN_REQUIRED_STATUS, BREDecisionPoint.MEDICAL, ProposalFlagTypeEnum.BRE_MEDICAL_CHECK_STATUS),
    FINANCIAL("",ProposalFlagTypeEnum.FINANCIAL_REQUIRED_STATUS, BREDecisionPoint.FINANCIAL_RULES, ProposalFlagTypeEnum.BRE_FINANCIAL_CHECK_STATUS),
    RCU("",ProposalFlagTypeEnum.RCU_REQUIRED_STATUS, BREDecisionPoint.RCU_RULES, ProposalFlagTypeEnum.BRE_RCU_CHECK_STATUS),
    RI("",ProposalFlagTypeEnum.RI_REQUIRED_STATUS, BREDecisionPoint.REINSURANCE_RULES, ProposalFlagTypeEnum.BRE_RI_CHECK_STATUS);

    private final String description;

    private final ProposalFlagTypeEnum proposalFlagType;

    private final BREDecisionPoint breDP;

    private final ProposalFlagTypeEnum breDPFlagType;

    public String getDescription() {
        return description;
    }

    public ProposalFlagTypeEnum getProposalFlagType() {
        return proposalFlagType;
    }

    public BREDecisionPoint getBreDP() {
        return breDP;
    }

    /**
     * @return the breDPFlagType
     */
    public ProposalFlagTypeEnum getBreDPFlagType() {
        return breDPFlagType;
    }

    private BREReqTypeEnum(String description, ProposalFlagTypeEnum proposalFlagType, BREDecisionPoint breDP,
                           ProposalFlagTypeEnum breDPFlagType) {
        this.description = description;
        this.proposalFlagType = proposalFlagType;
        this.breDP = breDP;
        this.breDPFlagType = breDPFlagType;
    }

    public static List<String> getProposalFlagList() {
        List<String> proposalFlagList = new ArrayList<>();
        for (BREReqTypeEnum medicalSubType : values()) {
            proposalFlagList.add(medicalSubType.getProposalFlagType().name());
        }
        return proposalFlagList;
    }

    public static String getProposalFlagTypeName(String medicalsFlag) {
        for (BREReqTypeEnum breEnum : values()) {
            if (breEnum.description.equalsIgnoreCase(medicalsFlag)) {
                return breEnum.getProposalFlagType().name();
            }
        }
        return NBConstants.EMPTY_STRING;
    }

    public static String getProposalFlagTypeName(BREDecisionPoint breDP) {
        for (BREReqTypeEnum breEnum : values()) {
            if (breEnum.breDP.equals(breDP)) {
                return breEnum.getProposalFlagType().name();
            }
        }
        return NBConstants.EMPTY_STRING;
    }

    public static String getProposalFlagTypeNameForBRE(BREDecisionPoint breDP) {
        for (BREReqTypeEnum breEnum : values()) {
            if (breEnum.breDP.equals(breDP)) {
                return breEnum.getBreDPFlagType().name();
            }
        }
        return NBConstants.EMPTY_STRING;
    }

    public static BREReqTypeEnum getBREReqTypeByDesc(String desc) {
        for (BREReqTypeEnum breEnum : values()) {
            if (breEnum.description.equalsIgnoreCase(desc)) {
                return breEnum;
            }
        }
        return null;
    }

}
