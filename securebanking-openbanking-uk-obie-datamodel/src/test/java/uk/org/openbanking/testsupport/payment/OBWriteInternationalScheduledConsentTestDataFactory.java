/*
 * Copyright © 2020-2022 ForgeRock AS (obst@forgerock.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.org.openbanking.testsupport.payment;

import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.common.OBChargeBearerType1Code;
import uk.org.openbanking.datamodel.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.payment.*;
import uk.org.openbanking.datamodel.payment.OBWriteInternationalScheduled3DataInitiation.InstructionPriorityEnum;
import uk.org.openbanking.datamodel.payment.OBWriteInternationalScheduledConsent5Data.ReadRefundAccountEnum;

import static uk.org.openbanking.datamodel.payment.OBExternalPermissions2Code.CREATE;
import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.*;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBActiveOrHistoricCurrencyAndAmount;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBWriteDomestic2DataInitiationInstructedAmount;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.*;
import static uk.org.openbanking.testsupport.payment.OBExchangeRateTestDataFactory.*;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.*;
import static uk.org.openbanking.testsupport.payment.OBRemittanceInformationTestDataFactory.aValidOBRemittanceInformation1;
import static uk.org.openbanking.testsupport.payment.OBRemittanceInformationTestDataFactory.aValidOBWriteDomestic2DataInitiationRemittanceInformation;
import static uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory.aValidOBRisk1;
import static uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory.aValidOBRisk1MandatoryFields;
import static uk.org.openbanking.testsupport.payment.OBWriteDomesticScaSupportDataTestDataFactory.aValidOBSCASupportData1;
import static uk.org.openbanking.testsupport.payment.OBWriteDomesticScaSupportDataTestDataFactory.aValidOBWriteDomesticConsent3DataSCASupportData;

/**
 * Test data factory for the various "OBWriteInternationalScheduledConsent" classes.
 */
public class OBWriteInternationalScheduledConsentTestDataFactory {

    private static final String INSTRUCTION_IDENTIFICATION = "ANSM020";
    private static final String END_TO_END_IDENTIFICATION = "FRESCO.21302.GFX.01";
    private static final String LOCAL_INSTRUMENT = "UK.OBIE.BACS";
    private static final String PURPOSE = "CDCD";
    private static final String CURRENCY = "USD";

    public static OBWriteInternationalScheduledConsent1 aValidOBWriteInternationalScheduledConsent1() {
        return (new OBWriteInternationalScheduledConsent1())
                .data(aValidOBWriteDataInternationalScheduledConsent1())
                .risk(aValidOBRisk1());
    }

    public static OBWriteInternationalScheduledConsent1 aValidOBWriteInternationalScheduledConsent1MandatoryFields() {
        return (new OBWriteInternationalScheduledConsent1())
                .data(aValidOBWriteDataInternationalScheduledConsent1MandatoryFields())
                .risk(aValidOBRisk1MandatoryFields());
    }

    public static OBWriteInternationalScheduledConsent2 aValidOBWriteInternationalScheduledConsent2() {
        return (new OBWriteInternationalScheduledConsent2())
                .data(aValidOBWriteDataInternationalScheduledConsent2())
                .risk(aValidOBRisk1());
    }

    public static OBWriteInternationalScheduledConsent2 aValidOBWriteInternationalScheduledConsent2MandatoryFields() {
        return (new OBWriteInternationalScheduledConsent2())
                .data(aValidOBWriteDataInternationalScheduledConsent2MandatoryFields())
                .risk(aValidOBRisk1MandatoryFields());
    }

    public static OBWriteInternationalScheduledConsent3 aValidOBWriteInternationalScheduledConsent3() {
        return (new OBWriteInternationalScheduledConsent3())
                .data(aValidOBWriteInternationalScheduledConsent3Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteInternationalScheduledConsent3 aValidOBWriteInternationalScheduledConsent3MandatoryFields() {
        return (new OBWriteInternationalScheduledConsent3())
                .data(aValidOBWriteInternationalScheduledConsent3DataMandatoryFields())
                .risk(aValidOBRisk1MandatoryFields());
    }

    public static OBWriteInternationalScheduledConsent4 aValidOBWriteInternationalScheduledConsent4() {
        return (new OBWriteInternationalScheduledConsent4())
                .data(aValidOBWriteInternationalScheduledConsent4Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteInternationalScheduledConsent4 aValidOBWriteInternationalScheduledConsent4MandatoryFields() {
        return (new OBWriteInternationalScheduledConsent4())
                .data(aValidOBWriteInternationalScheduledConsent4DataMandatoryFields())
                .risk(aValidOBRisk1MandatoryFields());
    }

    public static OBWriteInternationalScheduledConsent5 aValidOBWriteInternationalScheduledConsent5() {
        return (new OBWriteInternationalScheduledConsent5())
                .data(aValidOBWriteInternationalScheduledConsent5Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteInternationalScheduledConsent5 aValidOBWriteInternationalScheduledConsent5MandatoryFields() {
        return (new OBWriteInternationalScheduledConsent5())
                .data(aValidOBWriteInternationalScheduledConsent5DataMandatoryFields())
                .risk(aValidOBRisk1MandatoryFields());
    }

    public static OBWriteDataInternationalScheduledConsent1 aValidOBWriteDataInternationalScheduledConsent1() {
        return (new OBWriteDataInternationalScheduledConsent1())
                .permission(CREATE)
                .initiation(aValidOBInternationalScheduled1())
                .authorisation(aValidOBAuthorisation1());
    }

    public static OBWriteDataInternationalScheduledConsent1 aValidOBWriteDataInternationalScheduledConsent1MandatoryFields() {
        return (new OBWriteDataInternationalScheduledConsent1())
                .permission(CREATE)
                .initiation(aValidOBInternationalScheduled1MandatoryFields());
    }

    public static OBWriteDataInternationalScheduledConsent2 aValidOBWriteDataInternationalScheduledConsent2() {
        return (new OBWriteDataInternationalScheduledConsent2())
                .permission(CREATE)
                .initiation(aValidOBInternationalScheduled2())
                .authorisation(aValidOBAuthorisation1());
    }

    public static OBWriteDataInternationalScheduledConsent2 aValidOBWriteDataInternationalScheduledConsent2MandatoryFields() {
        return (new OBWriteDataInternationalScheduledConsent2())
                .permission(CREATE)
                .initiation(aValidOBInternationalScheduled2MandatoryFields());
    }

    public static OBWriteInternationalScheduledConsent3Data aValidOBWriteInternationalScheduledConsent3Data() {
        return (new OBWriteInternationalScheduledConsent3Data())
                .permission(CREATE)
                .initiation(aValidOBWriteInternationalScheduled2DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent3DataAuthorisation())
                .scASupportData(new OBWriteDomesticConsent3DataSCASupportData());
    }

    public static OBWriteInternationalScheduledConsent3Data aValidOBWriteInternationalScheduledConsent3DataMandatoryFields() {
        return (new OBWriteInternationalScheduledConsent3Data())
                .permission(CREATE)
                .initiation(aValidOBWriteInternationalScheduled2DataInitiationMandatoryFields());
    }

    public static OBWriteInternationalScheduledConsent4Data aValidOBWriteInternationalScheduledConsent4Data() {
        return (new OBWriteInternationalScheduledConsent4Data())
                .permission(CREATE)
                .initiation(aValidOBWriteInternationalScheduled3DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent3DataAuthorisation())
                .scASupportData(aValidOBWriteDomesticConsent3DataSCASupportData());
    }

    public static OBWriteInternationalScheduledConsent4Data aValidOBWriteInternationalScheduledConsent4DataMandatoryFields() {
        return (new OBWriteInternationalScheduledConsent4Data())
                .permission(CREATE)
                .initiation(aValidOBWriteInternationalScheduled3DataInitiationMandatoryFields());
    }

    public static OBWriteInternationalScheduledConsent5Data aValidOBWriteInternationalScheduledConsent5Data() {
        return (new OBWriteInternationalScheduledConsent5Data())
                .permission(CREATE)
                .initiation(aValidOBWriteInternationalScheduled3DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent4DataAuthorisation())
                .scASupportData(aValidOBSCASupportData1())
                .readRefundAccount(ReadRefundAccountEnum.NO);
    }

    public static OBWriteInternationalScheduledConsent5Data aValidOBWriteInternationalScheduledConsent5DataMandatoryFields() {
        return (new OBWriteInternationalScheduledConsent5Data())
                .permission(CREATE)
                .initiation(aValidOBWriteInternationalScheduled3DataInitiationMandatoryFields());
    }

    public static OBInternationalScheduled1 aValidOBInternationalScheduled1() {
        return (new OBInternationalScheduled1())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .localInstrument(LOCAL_INSTRUMENT)
                .instructionPriority(OBPriority2Code.URGENT)
                .purpose(PURPOSE)
                .chargeBearer(OBChargeBearerType1Code.SHARED)
                .requestedExecutionDateTime(DateTime.now().plusDays(1))
                .currencyOfTransfer(CURRENCY)
                .instructedAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .exchangeRateInformation(aValidOBExchangeRate1())
                .debtorAccount(aValidOBCashAccount3())
                .creditor(aValidOBPartyIdentification43())
                .creditorAgent(aValidOBBranchAndFinancialInstitutionIdentification3())
                .creditorAccount(aValidOBCashAccount3())
                .remittanceInformation(aValidOBRemittanceInformation1());
    }

    public static OBInternationalScheduled1 aValidOBInternationalScheduled1MandatoryFields() {
        return (new OBInternationalScheduled1())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .requestedExecutionDateTime(DateTime.now().plusDays(1))
                .currencyOfTransfer(CURRENCY)
                .instructedAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .creditorAccount(aValidOBCashAccount3());
    }

    public static OBInternationalScheduled2 aValidOBInternationalScheduled2() {
        return (new OBInternationalScheduled2())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .localInstrument(LOCAL_INSTRUMENT)
                .instructionPriority(OBPriority2Code.URGENT)
                .purpose(PURPOSE)
                .chargeBearer(OBChargeBearerType1Code.SHARED)
                .requestedExecutionDateTime(DateTime.now().plusDays(1))
                .currencyOfTransfer(CURRENCY)
                .instructedAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .exchangeRateInformation(aValidOBExchangeRate1())
                .debtorAccount(aValidOBCashAccount3())
                .creditor(aValidOBPartyIdentification43())
                .creditorAgent(aValidOBBranchAndFinancialInstitutionIdentification3())
                .creditorAccount(aValidOBCashAccount3())
                .remittanceInformation(aValidOBRemittanceInformation1())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBInternationalScheduled2 aValidOBInternationalScheduled2MandatoryFields() {
        return (new OBInternationalScheduled2())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .requestedExecutionDateTime(DateTime.now().plusDays(1))
                .currencyOfTransfer(CURRENCY)
                .instructedAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .creditorAccount(aValidOBCashAccount3());
    }

    public static OBWriteInternationalScheduled2DataInitiation aValidOBWriteInternationalScheduled2DataInitiation() {
        return (new OBWriteInternationalScheduled2DataInitiation())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .localInstrument(LOCAL_INSTRUMENT)
                .instructionPriority(OBPriority2Code.URGENT)
                .purpose(PURPOSE)
                .chargeBearer(OBChargeBearerType1Code.SHARED)
                .requestedExecutionDateTime(DateTime.now().plusDays(1))
                .currencyOfTransfer(CURRENCY)
                .instructedAmount(aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .exchangeRateInformation(aValidOBWriteInternational2DataInitiationExchangeRateInformation())
                .debtorAccount(aValidOBWriteDomestic2DataInitiationDebtorAccount())
                .creditor(aValidOBWriteInternational2DataInitiationCreditor())
                .creditorAgent(aValidOBWriteInternational2DataInitiationCreditorAgent())
                .creditorAccount(aValidOBWriteDomestic2DataInitiationCreditorAccount())
                .remittanceInformation(aValidOBWriteDomestic2DataInitiationRemittanceInformation())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBWriteInternationalScheduled2DataInitiation aValidOBWriteInternationalScheduled2DataInitiationMandatoryFields() {
        return (new OBWriteInternationalScheduled2DataInitiation())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .requestedExecutionDateTime(DateTime.now().plusDays(1))
                .currencyOfTransfer(CURRENCY)
                .instructedAmount(aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .creditorAccount(aValidOBWriteDomestic2DataInitiationCreditorAccount());
    }

    public static OBWriteInternationalScheduled3DataInitiation aValidOBWriteInternationalScheduled3DataInitiation() {
        return (new OBWriteInternationalScheduled3DataInitiation())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .localInstrument(LOCAL_INSTRUMENT)
                .instructionPriority(InstructionPriorityEnum.URGENT)
                .purpose(PURPOSE)
                .extendedPurpose("Extended purpose")
                .chargeBearer(OBChargeBearerType1Code.SHARED)
                .requestedExecutionDateTime(DateTime.now().plusDays(1))
                .currencyOfTransfer(CURRENCY)
                .destinationCountryCode("GB")
                .instructedAmount(aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .exchangeRateInformation(aValidOBWriteInternational3DataInitiationExchangeRateInformation())
                .debtorAccount(aValidOBWriteDomestic2DataInitiationDebtorAccount())
                .creditor(aValidOBWriteInternational3DataInitiationCreditor())
                .creditorAgent(aValidOBWriteInternational3DataInitiationCreditorAgent())
                .creditorAccount(aValidOBWriteDomestic2DataInitiationCreditorAccount())
                .remittanceInformation(aValidOBWriteDomestic2DataInitiationRemittanceInformation())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBWriteInternationalScheduled3DataInitiation aValidOBWriteInternationalScheduled3DataInitiationMandatoryFields() {
        return (new OBWriteInternationalScheduled3DataInitiation())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .requestedExecutionDateTime(DateTime.now().plusDays(1))
                .currencyOfTransfer(CURRENCY)
                .instructedAmount(aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .creditorAccount(aValidOBWriteDomestic2DataInitiationCreditorAccount());
    }
}
