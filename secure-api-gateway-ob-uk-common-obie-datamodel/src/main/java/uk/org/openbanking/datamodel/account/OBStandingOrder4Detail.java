/*
 * Copyright © 2020-2024 ForgeRock AS (obst@forgerock.com)
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
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import uk.org.openbanking.datamodel.common.OBSupplementaryData1;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.util.Objects;

/**
 * OBStandingOrder4Detail
 */
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen")
public class OBStandingOrder4Detail {
    @JsonProperty("AccountId")
    private String accountId = null;

    @JsonProperty("StandingOrderId")
    private String standingOrderId = null;

    @JsonProperty("Frequency")
    private String frequency = null;

    @JsonProperty("Reference")
    private String reference = null;

    @JsonProperty("FirstPaymentDateTime")
    private String firstPaymentDateTime = null;

    @JsonProperty("NextPaymentDateTime")
    private String nextPaymentDateTime = null;

    @JsonProperty("FinalPaymentDateTime")
    private String finalPaymentDateTime = null;

    @JsonProperty("StandingOrderStatusCode")
    private OBExternalStandingOrderStatus1Code standingOrderStatusCode = null;

    @JsonProperty("FirstPaymentAmount")
    private OBActiveOrHistoricCurrencyAndAmount0 firstPaymentAmount = null;

    @JsonProperty("NextPaymentAmount")
    private OBActiveOrHistoricCurrencyAndAmount1 nextPaymentAmount = null;

    @JsonProperty("FinalPaymentAmount")
    private OBActiveOrHistoricCurrencyAndAmount2 finalPaymentAmount = null;

    @JsonProperty("CreditorAgent")
    private OBBranchAndFinancialInstitutionIdentification51 creditorAgent = null;

    @JsonProperty("CreditorAccount")
    private OBCashAccount50 creditorAccount = null;

    @JsonProperty("SupplementaryData")
    private OBSupplementaryData1 supplementaryData = null;

    public OBStandingOrder4Detail accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get accountId
     *
     * @return accountId
     **/
    @NotNull
    @Size(min = 1, max = 40)
    @ApiModelProperty(required = true, value = "")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OBStandingOrder4Detail standingOrderId(String standingOrderId) {
        this.standingOrderId = standingOrderId;
        return this;
    }

    /**
     * Get standingOrderId
     *
     * @return standingOrderId
     **/
    @Size(min = 1, max = 40)
    @ApiModelProperty(value = "")
    public String getStandingOrderId() {
        return standingOrderId;
    }

    public void setStandingOrderId(String standingOrderId) {
        this.standingOrderId = standingOrderId;
    }

    public OBStandingOrder4Detail frequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get frequency
     *
     * @return frequency
     **/
    @NotNull
    @Pattern(regexp = "^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$")
    @ApiModelProperty(required = true, value = "")
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public OBStandingOrder4Detail reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Get reference
     *
     * @return reference
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public OBStandingOrder4Detail firstPaymentDateTime(String firstPaymentDateTime) {
        this.firstPaymentDateTime = firstPaymentDateTime;
        return this;
    }

    /**
     * Get firstPaymentDateTime
     *
     * @return firstPaymentDateTime
     **/
    @ApiModelProperty(value = "")
    public String getFirstPaymentDateTime() {
        return firstPaymentDateTime;
    }

    public void setFirstPaymentDateTime(String firstPaymentDateTime) {
        this.firstPaymentDateTime = firstPaymentDateTime;
    }

    public OBStandingOrder4Detail nextPaymentDateTime(String nextPaymentDateTime) {
        this.nextPaymentDateTime = nextPaymentDateTime;
        return this;
    }

    /**
     * Get nextPaymentDateTime
     *
     * @return nextPaymentDateTime
     **/
    @ApiModelProperty(value = "")
    public String getNextPaymentDateTime() {
        return nextPaymentDateTime;
    }

    public void setNextPaymentDateTime(String nextPaymentDateTime) {
        this.nextPaymentDateTime = nextPaymentDateTime;
    }

    public OBStandingOrder4Detail finalPaymentDateTime(String finalPaymentDateTime) {
        this.finalPaymentDateTime = finalPaymentDateTime;
        return this;
    }

    /**
     * Get finalPaymentDateTime
     *
     * @return finalPaymentDateTime
     **/
    @ApiModelProperty(value = "")
    public String getFinalPaymentDateTime() {
        return finalPaymentDateTime;
    }

    public void setFinalPaymentDateTime(String finalPaymentDateTime) {
        this.finalPaymentDateTime = finalPaymentDateTime;
    }

    public OBStandingOrder4Detail standingOrderStatusCode(OBExternalStandingOrderStatus1Code standingOrderStatusCode) {
        this.standingOrderStatusCode = standingOrderStatusCode;
        return this;
    }

    /**
     * Get standingOrderStatusCode
     *
     * @return standingOrderStatusCode
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBExternalStandingOrderStatus1Code getStandingOrderStatusCode() {
        return standingOrderStatusCode;
    }

    public void setStandingOrderStatusCode(OBExternalStandingOrderStatus1Code standingOrderStatusCode) {
        this.standingOrderStatusCode = standingOrderStatusCode;
    }

    public OBStandingOrder4Detail firstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount0 firstPaymentAmount) {
        this.firstPaymentAmount = firstPaymentAmount;
        return this;
    }

    /**
     * Get firstPaymentAmount
     *
     * @return firstPaymentAmount
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBActiveOrHistoricCurrencyAndAmount0 getFirstPaymentAmount() {
        return firstPaymentAmount;
    }

    public void setFirstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount0 firstPaymentAmount) {
        this.firstPaymentAmount = firstPaymentAmount;
    }

    public OBStandingOrder4Detail nextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount1 nextPaymentAmount) {
        this.nextPaymentAmount = nextPaymentAmount;
        return this;
    }

    /**
     * Get nextPaymentAmount
     *
     * @return nextPaymentAmount
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBActiveOrHistoricCurrencyAndAmount1 getNextPaymentAmount() {
        return nextPaymentAmount;
    }

    public void setNextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount1 nextPaymentAmount) {
        this.nextPaymentAmount = nextPaymentAmount;
    }

    public OBStandingOrder4Detail finalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 finalPaymentAmount) {
        this.finalPaymentAmount = finalPaymentAmount;
        return this;
    }

    /**
     * Get finalPaymentAmount
     *
     * @return finalPaymentAmount
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBActiveOrHistoricCurrencyAndAmount2 getFinalPaymentAmount() {
        return finalPaymentAmount;
    }

    public void setFinalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 finalPaymentAmount) {
        this.finalPaymentAmount = finalPaymentAmount;
    }

    public OBStandingOrder4Detail creditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
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
    public OBBranchAndFinancialInstitutionIdentification51 getCreditorAgent() {
        return creditorAgent;
    }

    public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    public OBStandingOrder4Detail creditorAccount(OBCashAccount50 creditorAccount) {
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
    public OBCashAccount50 getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(OBCashAccount50 creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public OBStandingOrder4Detail supplementaryData(OBSupplementaryData1 supplementaryData) {
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
        OBStandingOrder4Detail obStandingOrder4Detail = (OBStandingOrder4Detail) o;
        return Objects.equals(this.accountId, obStandingOrder4Detail.accountId) &&
                Objects.equals(this.standingOrderId, obStandingOrder4Detail.standingOrderId) &&
                Objects.equals(this.frequency, obStandingOrder4Detail.frequency) &&
                Objects.equals(this.reference, obStandingOrder4Detail.reference) &&
                Objects.equals(this.firstPaymentDateTime, obStandingOrder4Detail.firstPaymentDateTime) &&
                Objects.equals(this.nextPaymentDateTime, obStandingOrder4Detail.nextPaymentDateTime) &&
                Objects.equals(this.finalPaymentDateTime, obStandingOrder4Detail.finalPaymentDateTime) &&
                Objects.equals(this.standingOrderStatusCode, obStandingOrder4Detail.standingOrderStatusCode) &&
                Objects.equals(this.firstPaymentAmount, obStandingOrder4Detail.firstPaymentAmount) &&
                Objects.equals(this.nextPaymentAmount, obStandingOrder4Detail.nextPaymentAmount) &&
                Objects.equals(this.finalPaymentAmount, obStandingOrder4Detail.finalPaymentAmount) &&
                Objects.equals(this.creditorAgent, obStandingOrder4Detail.creditorAgent) &&
                Objects.equals(this.creditorAccount, obStandingOrder4Detail.creditorAccount) &&
                Objects.equals(this.supplementaryData, obStandingOrder4Detail.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, standingOrderId, frequency, reference, firstPaymentDateTime, nextPaymentDateTime, finalPaymentDateTime, standingOrderStatusCode, firstPaymentAmount, nextPaymentAmount, finalPaymentAmount, creditorAgent, creditorAccount, supplementaryData);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStandingOrder4Detail {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    standingOrderId: ").append(toIndentedString(standingOrderId)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    firstPaymentDateTime: ").append(toIndentedString(firstPaymentDateTime)).append("\n");
        sb.append("    nextPaymentDateTime: ").append(toIndentedString(nextPaymentDateTime)).append("\n");
        sb.append("    finalPaymentDateTime: ").append(toIndentedString(finalPaymentDateTime)).append("\n");
        sb.append("    standingOrderStatusCode: ").append(toIndentedString(standingOrderStatusCode)).append("\n");
        sb.append("    firstPaymentAmount: ").append(toIndentedString(firstPaymentAmount)).append("\n");
        sb.append("    nextPaymentAmount: ").append(toIndentedString(nextPaymentAmount)).append("\n");
        sb.append("    finalPaymentAmount: ").append(toIndentedString(finalPaymentAmount)).append("\n");
        sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
        sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
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

