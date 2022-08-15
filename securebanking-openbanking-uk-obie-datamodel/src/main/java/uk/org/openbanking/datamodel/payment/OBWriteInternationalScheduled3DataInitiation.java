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
/*
 * Payment Initiation API
 * Swagger for Payment Initiation API Specification
 *
 * OpenAPI spec version: v3.1.3-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.common.OBChargeBearerType1Code;
import uk.org.openbanking.datamodel.common.OBSupplementaryData1;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single scheduled international payment.
 */
@ApiModel(description = "The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single scheduled international payment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T11:45:24.725+01:00")
public class OBWriteInternationalScheduled3DataInitiation {
    @JsonProperty("InstructionIdentification")
    private String instructionIdentification = null;

    @JsonProperty("EndToEndIdentification")
    private String endToEndIdentification = null;

    @JsonProperty("LocalInstrument")
    private String localInstrument = null;

    @JsonProperty("InstructionPriority")
    private OBPriority2Code instructionPriority = null;

    @JsonProperty("Purpose")
    private String purpose = null;

    @JsonProperty("ExtendedPurpose")
    private String extendedPurpose = null;

    @JsonProperty("ChargeBearer")
    private OBChargeBearerType1Code chargeBearer = null;

    @JsonProperty("RequestedExecutionDateTime")
    private DateTime requestedExecutionDateTime = null;

    @JsonProperty("CurrencyOfTransfer")
    private String currencyOfTransfer = null;

    @JsonProperty("DestinationCountryCode")
    private String destinationCountryCode = null;

    @JsonProperty("InstructedAmount")
    private OBWriteDomestic2DataInitiationInstructedAmount instructedAmount = null;

    @JsonProperty("ExchangeRateInformation")
    private OBWriteInternational3DataInitiationExchangeRateInformation exchangeRateInformation = null;

    @JsonProperty("DebtorAccount")
    private OBWriteDomestic2DataInitiationDebtorAccount debtorAccount = null;

    @JsonProperty("Creditor")
    private OBWriteInternational3DataInitiationCreditor creditor = null;

    @JsonProperty("CreditorAgent")
    private OBWriteInternational3DataInitiationCreditorAgent creditorAgent = null;

    @JsonProperty("CreditorAccount")
    private OBWriteDomestic2DataInitiationCreditorAccount creditorAccount = null;

    @JsonProperty("RemittanceInformation")
    private OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation = null;

    @JsonProperty("SupplementaryData")
    private OBSupplementaryData1 supplementaryData = null;

    public OBWriteInternationalScheduled3DataInitiation instructionIdentification(String instructionIdentification) {
        this.instructionIdentification = instructionIdentification;
        return this;
    }

    /**
     * Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.
     *
     * @return instructionIdentification
     **/
    @NotNull
    @Size(min = 1, max = 35)
    @ApiModelProperty(required = true, value = "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.")
    public String getInstructionIdentification() {
        return instructionIdentification;
    }

    public void setInstructionIdentification(String instructionIdentification) {
        this.instructionIdentification = instructionIdentification;
    }

    public OBWriteInternationalScheduled3DataInitiation endToEndIdentification(String endToEndIdentification) {
        this.endToEndIdentification = endToEndIdentification;
        return this;
    }

    /**
     * Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.
     *
     * @return endToEndIdentification
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.")
    public String getEndToEndIdentification() {
        return endToEndIdentification;
    }

    public void setEndToEndIdentification(String endToEndIdentification) {
        this.endToEndIdentification = endToEndIdentification;
    }

    public OBWriteInternationalScheduled3DataInitiation localInstrument(String localInstrument) {
        this.localInstrument = localInstrument;
        return this;
    }

    /**
     * Get localInstrument
     *
     * @return localInstrument
     **/
    @ApiModelProperty(value = "")
    public String getLocalInstrument() {
        return localInstrument;
    }

    public void setLocalInstrument(String localInstrument) {
        this.localInstrument = localInstrument;
    }

    public OBWriteInternationalScheduled3DataInitiation instructionPriority(OBPriority2Code instructionPriority) {
        this.instructionPriority = instructionPriority;
        return this;
    }

    /**
     * Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.
     *
     * @return instructionPriority
     **/
    @ApiModelProperty(value = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.")
    public OBPriority2Code getInstructionPriority() {
        return instructionPriority;
    }

    public void setInstructionPriority(OBPriority2Code instructionPriority) {
        this.instructionPriority = instructionPriority;
    }

    public OBWriteInternationalScheduled3DataInitiation purpose(String purpose) {
        this.purpose = purpose;
        return this;
    }

    /**
     * Specifies the external purpose code in the format of character string with a maximum length of 4 characters. The list of valid codes is an external code list published separately. External code sets can be downloaded from www.iso20022.org.
     *
     * @return purpose
     **/
    @Size(min = 1, max = 4)
    @ApiModelProperty(value = "Specifies the external purpose code in the format of character string with a maximum length of 4 characters. The list of valid codes is an external code list published separately. External code sets can be downloaded from www.iso20022.org.")
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public OBWriteInternationalScheduled3DataInitiation extendedPurpose(String extendedPurpose) {
        this.extendedPurpose = extendedPurpose;
        return this;
    }

    /**
     * Specifies the purpose of an international payment, when there is no corresponding 4 character code available in the ISO20022 list of Purpose Codes.
     *
     * @return extendedPurpose
     **/
    @Size(min = 1, max = 140)
    @ApiModelProperty(value = "Specifies the purpose of an international payment, when there is no corresponding 4 character code available in the ISO20022 list of Purpose Codes.")
    public String getExtendedPurpose() {
        return extendedPurpose;
    }

    public void setExtendedPurpose(String extendedPurpose) {
        this.extendedPurpose = extendedPurpose;
    }

    public OBWriteInternationalScheduled3DataInitiation chargeBearer(OBChargeBearerType1Code chargeBearer) {
        this.chargeBearer = chargeBearer;
        return this;
    }

    /**
     * Get chargeBearer
     *
     * @return chargeBearer
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBChargeBearerType1Code getChargeBearer() {
        return chargeBearer;
    }

    public void setChargeBearer(OBChargeBearerType1Code chargeBearer) {
        this.chargeBearer = chargeBearer;
    }

    public OBWriteInternationalScheduled3DataInitiation requestedExecutionDateTime(DateTime requestedExecutionDateTime) {
        this.requestedExecutionDateTime = requestedExecutionDateTime;
        return this;
    }

    /**
     * Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor&#39;s account is to be debited.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return requestedExecutionDateTime
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getRequestedExecutionDateTime() {
        return requestedExecutionDateTime;
    }

    public void setRequestedExecutionDateTime(DateTime requestedExecutionDateTime) {
        this.requestedExecutionDateTime = requestedExecutionDateTime;
    }

    public OBWriteInternationalScheduled3DataInitiation currencyOfTransfer(String currencyOfTransfer) {
        this.currencyOfTransfer = currencyOfTransfer;
        return this;
    }

    /**
     * Specifies the currency of the to be transferred amount, which is different from the currency of the debtor&#39;s account.
     *
     * @return currencyOfTransfer
     **/
    @NotNull
    @Pattern(regexp = "^[A-Z]{3,3}$")
    @ApiModelProperty(required = true, value = "Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.")
    public String getCurrencyOfTransfer() {
        return currencyOfTransfer;
    }

    public void setCurrencyOfTransfer(String currencyOfTransfer) {
        this.currencyOfTransfer = currencyOfTransfer;
    }

    public OBWriteInternationalScheduled3DataInitiation destinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
        return this;
    }

    /**
     * Country in which Credit Account is domiciled. Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).
     *
     * @return destinationCountryCode
     **/
    @Pattern(regexp = "[A-Z]{2,2}")
    @ApiModelProperty(value = "Country in which Credit Account is domiciled. Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).")
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    public OBWriteInternationalScheduled3DataInitiation instructedAmount(OBWriteDomestic2DataInitiationInstructedAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
        return this;
    }

    /**
     * Get instructedAmount
     *
     * @return instructedAmount
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBWriteDomestic2DataInitiationInstructedAmount getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(OBWriteDomestic2DataInitiationInstructedAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    public OBWriteInternationalScheduled3DataInitiation exchangeRateInformation(OBWriteInternational3DataInitiationExchangeRateInformation exchangeRateInformation) {
        this.exchangeRateInformation = exchangeRateInformation;
        return this;
    }

    /**
     * Get exchangeRateInformation
     *
     * @return exchangeRateInformation
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBWriteInternational3DataInitiationExchangeRateInformation getExchangeRateInformation() {
        return exchangeRateInformation;
    }

    public void setExchangeRateInformation(OBWriteInternational3DataInitiationExchangeRateInformation exchangeRateInformation) {
        this.exchangeRateInformation = exchangeRateInformation;
    }

    public OBWriteInternationalScheduled3DataInitiation debtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
        return this;
    }

    /**
     * Get debtorAccount
     *
     * @return debtorAccount
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBWriteDomestic2DataInitiationDebtorAccount getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    public OBWriteInternationalScheduled3DataInitiation creditor(OBWriteInternational3DataInitiationCreditor creditor) {
        this.creditor = creditor;
        return this;
    }

    /**
     * Get creditor
     *
     * @return creditor
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBWriteInternational3DataInitiationCreditor getCreditor() {
        return creditor;
    }

    public void setCreditor(OBWriteInternational3DataInitiationCreditor creditor) {
        this.creditor = creditor;
    }

    public OBWriteInternationalScheduled3DataInitiation creditorAgent(OBWriteInternational3DataInitiationCreditorAgent creditorAgent) {
        this.creditorAgent = creditorAgent;
        return this;
    }

    /**
     * Get creditorAgent
     *
     * @return creditorAgent
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBWriteInternational3DataInitiationCreditorAgent getCreditorAgent() {
        return creditorAgent;
    }

    public void setCreditorAgent(OBWriteInternational3DataInitiationCreditorAgent creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    public OBWriteInternationalScheduled3DataInitiation creditorAccount(OBWriteDomestic2DataInitiationCreditorAccount creditorAccount) {
        this.creditorAccount = creditorAccount;
        return this;
    }

    /**
     * Get creditorAccount
     *
     * @return creditorAccount
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBWriteDomestic2DataInitiationCreditorAccount getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(OBWriteDomestic2DataInitiationCreditorAccount creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public OBWriteInternationalScheduled3DataInitiation remittanceInformation(OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
        return this;
    }

    /**
     * Get remittanceInformation
     *
     * @return remittanceInformation
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBWriteDomestic2DataInitiationRemittanceInformation getRemittanceInformation() {
        return remittanceInformation;
    }

    public void setRemittanceInformation(OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
    }

    public OBWriteInternationalScheduled3DataInitiation supplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    /**
     * Get supplementaryData
     *
     * @return supplementaryData
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBSupplementaryData1 getSupplementaryData() {
        return supplementaryData;
    }

    public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalScheduled3DataInitiation obWriteInternationalScheduled3DataInitiation = (OBWriteInternationalScheduled3DataInitiation) o;
        return Objects.equals(this.instructionIdentification, obWriteInternationalScheduled3DataInitiation.instructionIdentification) &&
                Objects.equals(this.endToEndIdentification, obWriteInternationalScheduled3DataInitiation.endToEndIdentification) &&
                Objects.equals(this.localInstrument, obWriteInternationalScheduled3DataInitiation.localInstrument) &&
                Objects.equals(this.instructionPriority, obWriteInternationalScheduled3DataInitiation.instructionPriority) &&
                Objects.equals(this.purpose, obWriteInternationalScheduled3DataInitiation.purpose) &&
                Objects.equals(this.extendedPurpose, obWriteInternationalScheduled3DataInitiation.extendedPurpose) &&
                Objects.equals(this.chargeBearer, obWriteInternationalScheduled3DataInitiation.chargeBearer) &&
                Objects.equals(this.requestedExecutionDateTime, obWriteInternationalScheduled3DataInitiation.requestedExecutionDateTime) &&
                Objects.equals(this.currencyOfTransfer, obWriteInternationalScheduled3DataInitiation.currencyOfTransfer) &&
                Objects.equals(this.destinationCountryCode, obWriteInternationalScheduled3DataInitiation.destinationCountryCode) &&
                Objects.equals(this.instructedAmount, obWriteInternationalScheduled3DataInitiation.instructedAmount) &&
                Objects.equals(this.exchangeRateInformation, obWriteInternationalScheduled3DataInitiation.exchangeRateInformation) &&
                Objects.equals(this.debtorAccount, obWriteInternationalScheduled3DataInitiation.debtorAccount) &&
                Objects.equals(this.creditor, obWriteInternationalScheduled3DataInitiation.creditor) &&
                Objects.equals(this.creditorAgent, obWriteInternationalScheduled3DataInitiation.creditorAgent) &&
                Objects.equals(this.creditorAccount, obWriteInternationalScheduled3DataInitiation.creditorAccount) &&
                Objects.equals(this.remittanceInformation, obWriteInternationalScheduled3DataInitiation.remittanceInformation) &&
                Objects.equals(this.supplementaryData, obWriteInternationalScheduled3DataInitiation.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instructionIdentification, endToEndIdentification, localInstrument, instructionPriority, purpose, extendedPurpose, chargeBearer, requestedExecutionDateTime, currencyOfTransfer, destinationCountryCode, instructedAmount, exchangeRateInformation, debtorAccount, creditor, creditorAgent, creditorAccount, remittanceInformation, supplementaryData);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalScheduled3DataInitiation {\n");

        sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
        sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
        sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
        sb.append("    instructionPriority: ").append(toIndentedString(instructionPriority)).append("\n");
        sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
        sb.append("    extendedPurpose: ").append(toIndentedString(extendedPurpose)).append("\n");
        sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
        sb.append("    requestedExecutionDateTime: ").append(toIndentedString(requestedExecutionDateTime)).append("\n");
        sb.append("    currencyOfTransfer: ").append(toIndentedString(currencyOfTransfer)).append("\n");
        sb.append("    destinationCountryCode: ").append(toIndentedString(destinationCountryCode)).append("\n");
        sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
        sb.append("    exchangeRateInformation: ").append(toIndentedString(exchangeRateInformation)).append("\n");
        sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
        sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
        sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
        sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
        sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
        sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

