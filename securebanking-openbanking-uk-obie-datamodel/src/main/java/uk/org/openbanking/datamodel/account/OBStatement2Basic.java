/**
 * Copyright © 2020 ForgeRock AS (obst@forgerock.com)
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
 * OpenAPI spec version: v3.1.7
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Provides further details on a statement resource.
 */
@ApiModel(description = "Provides further details on a statement resource.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-05T09:20:17.613+01:00")
public class OBStatement2Basic {
    @JsonProperty("AccountId")
    private String accountId = null;

    @JsonProperty("CreationDateTime")
    private String creationDateTime = null;

    @JsonProperty("EndDateTime")
    private String endDateTime = null;

    @JsonProperty("StartDateTime")
    private String startDateTime = null;

    @JsonProperty("StatementBenefit")
    private List<OBStatement2StatementBenefit> statementBenefit = null;

    @JsonProperty("StatementDateTime")
    private List<OBStatement2StatementDateTime> statementDateTime = null;

    @JsonProperty("StatementDescription")
    private List<String> statementDescription = null;

    @JsonProperty("StatementFee")
    private List<OBStatement2StatementFee> statementFee = null;

    @JsonProperty("StatementId")
    private String statementId = null;

    @JsonProperty("StatementInterest")
    private List<OBStatement2StatementInterest> statementInterest = null;

    @JsonProperty("StatementRate")
    private List<OBStatement2StatementRate> statementRate = null;

    @JsonProperty("StatementReference")
    private String statementReference = null;

    @JsonProperty("StatementValue")
    private List<OBStatement2StatementValue> statementValue = null;

    @JsonProperty("Type")
    private OBExternalStatementType1Code type = null;

    public OBStatement2Basic accountId(String accountId) {
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

    public OBStatement2Basic creationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Get creationDateTime
     *
     * @return creationDateTime
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    public String getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBStatement2Basic endDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    /**
     * Get endDateTime
     *
     * @return endDateTime
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    public OBStatement2Basic startDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Get startDateTime
     *
     * @return startDateTime
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public OBStatement2Basic statementBenefit(List<OBStatement2StatementBenefit> statementBenefit) {
        this.statementBenefit = statementBenefit;
        return this;
    }

    public OBStatement2Basic addStatementBenefitItem(OBStatement2StatementBenefit statementBenefitItem) {
        if (this.statementBenefit == null) {
            this.statementBenefit = new ArrayList<OBStatement2StatementBenefit>();
        }
        this.statementBenefit.add(statementBenefitItem);
        return this;
    }

    /**
     * Get statementBenefit
     *
     * @return statementBenefit
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBStatement2StatementBenefit> getStatementBenefit() {
        return statementBenefit;
    }

    public void setStatementBenefit(List<OBStatement2StatementBenefit> statementBenefit) {
        this.statementBenefit = statementBenefit;
    }

    public OBStatement2Basic statementDateTime(List<OBStatement2StatementDateTime> statementDateTime) {
        this.statementDateTime = statementDateTime;
        return this;
    }

    public OBStatement2Basic addStatementDateTimeItem(OBStatement2StatementDateTime statementDateTimeItem) {
        if (this.statementDateTime == null) {
            this.statementDateTime = new ArrayList<OBStatement2StatementDateTime>();
        }
        this.statementDateTime.add(statementDateTimeItem);
        return this;
    }

    /**
     * Get statementDateTime
     *
     * @return statementDateTime
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBStatement2StatementDateTime> getStatementDateTime() {
        return statementDateTime;
    }

    public void setStatementDateTime(List<OBStatement2StatementDateTime> statementDateTime) {
        this.statementDateTime = statementDateTime;
    }

    public OBStatement2Basic statementDescription(List<String> statementDescription) {
        this.statementDescription = statementDescription;
        return this;
    }

    public OBStatement2Basic addStatementDescriptionItem(String statementDescriptionItem) {
        if (this.statementDescription == null) {
            this.statementDescription = new ArrayList<String>();
        }
        this.statementDescription.add(statementDescriptionItem);
        return this;
    }

    /**
     * Get statementDescription
     *
     * @return statementDescription
     **/
    @ApiModelProperty(value = "")
    public List<String> getStatementDescription() {
        return statementDescription;
    }

    public void setStatementDescription(List<String> statementDescription) {
        this.statementDescription = statementDescription;
    }

    public OBStatement2Basic statementFee(List<OBStatement2StatementFee> statementFee) {
        this.statementFee = statementFee;
        return this;
    }

    public OBStatement2Basic addStatementFeeItem(OBStatement2StatementFee statementFeeItem) {
        if (this.statementFee == null) {
            this.statementFee = new ArrayList<OBStatement2StatementFee>();
        }
        this.statementFee.add(statementFeeItem);
        return this;
    }

    /**
     * Get statementFee
     *
     * @return statementFee
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBStatement2StatementFee> getStatementFee() {
        return statementFee;
    }

    public void setStatementFee(List<OBStatement2StatementFee> statementFee) {
        this.statementFee = statementFee;
    }

    public OBStatement2Basic statementId(String statementId) {
        this.statementId = statementId;
        return this;
    }

    /**
     * Get statementId
     *
     * @return statementId
     **/
    @Size(min = 1, max = 40)
    @ApiModelProperty(value = "")
    public String getStatementId() {
        return statementId;
    }

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    public OBStatement2Basic statementInterest(List<OBStatement2StatementInterest> statementInterest) {
        this.statementInterest = statementInterest;
        return this;
    }

    public OBStatement2Basic addStatementInterestItem(OBStatement2StatementInterest statementInterestItem) {
        if (this.statementInterest == null) {
            this.statementInterest = new ArrayList<OBStatement2StatementInterest>();
        }
        this.statementInterest.add(statementInterestItem);
        return this;
    }

    /**
     * Get statementInterest
     *
     * @return statementInterest
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBStatement2StatementInterest> getStatementInterest() {
        return statementInterest;
    }

    public void setStatementInterest(List<OBStatement2StatementInterest> statementInterest) {
        this.statementInterest = statementInterest;
    }

    public OBStatement2Basic statementRate(List<OBStatement2StatementRate> statementRate) {
        this.statementRate = statementRate;
        return this;
    }

    public OBStatement2Basic addStatementRateItem(OBStatement2StatementRate statementRateItem) {
        if (this.statementRate == null) {
            this.statementRate = new ArrayList<OBStatement2StatementRate>();
        }
        this.statementRate.add(statementRateItem);
        return this;
    }

    /**
     * Get statementRate
     *
     * @return statementRate
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBStatement2StatementRate> getStatementRate() {
        return statementRate;
    }

    public void setStatementRate(List<OBStatement2StatementRate> statementRate) {
        this.statementRate = statementRate;
    }

    public OBStatement2Basic statementReference(String statementReference) {
        this.statementReference = statementReference;
        return this;
    }

    /**
     * Get statementReference
     *
     * @return statementReference
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "")
    public String getStatementReference() {
        return statementReference;
    }

    public void setStatementReference(String statementReference) {
        this.statementReference = statementReference;
    }

    public OBStatement2Basic statementValue(List<OBStatement2StatementValue> statementValue) {
        this.statementValue = statementValue;
        return this;
    }

    public OBStatement2Basic addStatementValueItem(OBStatement2StatementValue statementValueItem) {
        if (this.statementValue == null) {
            this.statementValue = new ArrayList<OBStatement2StatementValue>();
        }
        this.statementValue.add(statementValueItem);
        return this;
    }

    /**
     * Get statementValue
     *
     * @return statementValue
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBStatement2StatementValue> getStatementValue() {
        return statementValue;
    }

    public void setStatementValue(List<OBStatement2StatementValue> statementValue) {
        this.statementValue = statementValue;
    }

    public OBStatement2Basic type(OBExternalStatementType1Code type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBExternalStatementType1Code getType() {
        return type;
    }

    public void setType(OBExternalStatementType1Code type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBStatement2Basic obStatement2Basic = (OBStatement2Basic) o;
        return Objects.equals(this.accountId, obStatement2Basic.accountId) &&
                Objects.equals(this.creationDateTime, obStatement2Basic.creationDateTime) &&
                Objects.equals(this.endDateTime, obStatement2Basic.endDateTime) &&
                Objects.equals(this.startDateTime, obStatement2Basic.startDateTime) &&
                Objects.equals(this.statementBenefit, obStatement2Basic.statementBenefit) &&
                Objects.equals(this.statementDateTime, obStatement2Basic.statementDateTime) &&
                Objects.equals(this.statementDescription, obStatement2Basic.statementDescription) &&
                Objects.equals(this.statementFee, obStatement2Basic.statementFee) &&
                Objects.equals(this.statementId, obStatement2Basic.statementId) &&
                Objects.equals(this.statementInterest, obStatement2Basic.statementInterest) &&
                Objects.equals(this.statementRate, obStatement2Basic.statementRate) &&
                Objects.equals(this.statementReference, obStatement2Basic.statementReference) &&
                Objects.equals(this.statementValue, obStatement2Basic.statementValue) &&
                Objects.equals(this.type, obStatement2Basic.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, creationDateTime, endDateTime, startDateTime, statementBenefit, statementDateTime, statementDescription, statementFee, statementId, statementInterest, statementRate, statementReference, statementValue, type);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatement2Basic {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
        sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
        sb.append("    statementBenefit: ").append(toIndentedString(statementBenefit)).append("\n");
        sb.append("    statementDateTime: ").append(toIndentedString(statementDateTime)).append("\n");
        sb.append("    statementDescription: ").append(toIndentedString(statementDescription)).append("\n");
        sb.append("    statementFee: ").append(toIndentedString(statementFee)).append("\n");
        sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
        sb.append("    statementInterest: ").append(toIndentedString(statementInterest)).append("\n");
        sb.append("    statementRate: ").append(toIndentedString(statementRate)).append("\n");
        sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
        sb.append("    statementValue: ").append(toIndentedString(statementValue)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

