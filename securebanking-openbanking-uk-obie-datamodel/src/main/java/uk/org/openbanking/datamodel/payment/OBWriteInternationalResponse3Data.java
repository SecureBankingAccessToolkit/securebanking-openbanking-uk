/**
 * Copyright © 2020-2021 ForgeRock AS (obst@forgerock.com)
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
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBWriteInternationalResponse3Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T16:03:12.161+01:00")
public class OBWriteInternationalResponse3Data {
    @JsonProperty("InternationalPaymentId")
    private String internationalPaymentId = null;

    @JsonProperty("ConsentId")
    private String consentId = null;

    @JsonProperty("CreationDateTime")
    private OffsetDateTime creationDateTime = null;
    @JsonProperty("Status")
    private StatusEnum status = null;
    @JsonProperty("StatusUpdateDateTime")
    private OffsetDateTime statusUpdateDateTime = null;
    @JsonProperty("ExpectedExecutionDateTime")
    private OffsetDateTime expectedExecutionDateTime = null;
    @JsonProperty("ExpectedSettlementDateTime")
    private OffsetDateTime expectedSettlementDateTime = null;
    @JsonProperty("Charges")
    private List<OBWriteDomesticConsentResponse3DataCharges> charges = null;
    @JsonProperty("ExchangeRateInformation")
    private OBWriteInternationalConsentResponse3DataExchangeRateInformation exchangeRateInformation = null;
    @JsonProperty("Initiation")
    private OBWriteInternational2DataInitiation initiation = null;
    @JsonProperty("MultiAuthorisation")
    private OBWriteDomesticResponse3DataMultiAuthorisation multiAuthorisation = null;

    public OBWriteInternationalResponse3Data internationalPaymentId(String internationalPaymentId) {
        this.internationalPaymentId = internationalPaymentId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the international payment resource.
     *
     * @return internationalPaymentId
     **/
    @NotNull
    @Size(min = 1, max = 40)
    @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the international payment resource.")
    public String getInternationalPaymentId() {
        return internationalPaymentId;
    }

    public void setInternationalPaymentId(String internationalPaymentId) {
        this.internationalPaymentId = internationalPaymentId;
    }

    public OBWriteInternationalResponse3Data consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
     *
     * @return consentId
     **/
    @NotNull
    @Size(min = 1, max = 128)
    @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBWriteInternationalResponse3Data creationDateTime(OffsetDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the message was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "Date and time at which the message was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public OffsetDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(OffsetDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBWriteInternationalResponse3Data status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Specifies the status of the payment information group.
     *
     * @return status
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Specifies the status of the payment information group.")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OBWriteInternationalResponse3Data statusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return statusUpdateDateTime
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public OffsetDateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBWriteInternationalResponse3Data expectedExecutionDateTime(OffsetDateTime expectedExecutionDateTime) {
        this.expectedExecutionDateTime = expectedExecutionDateTime;
        return this;
    }

    /**
     * Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expectedExecutionDateTime
     **/
    @Valid
    @ApiModelProperty(value = "Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public OffsetDateTime getExpectedExecutionDateTime() {
        return expectedExecutionDateTime;
    }

    public void setExpectedExecutionDateTime(OffsetDateTime expectedExecutionDateTime) {
        this.expectedExecutionDateTime = expectedExecutionDateTime;
    }

    public OBWriteInternationalResponse3Data expectedSettlementDateTime(OffsetDateTime expectedSettlementDateTime) {
        this.expectedSettlementDateTime = expectedSettlementDateTime;
        return this;
    }

    /**
     * Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expectedSettlementDateTime
     **/
    @Valid
    @ApiModelProperty(value = "Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public OffsetDateTime getExpectedSettlementDateTime() {
        return expectedSettlementDateTime;
    }

    public void setExpectedSettlementDateTime(OffsetDateTime expectedSettlementDateTime) {
        this.expectedSettlementDateTime = expectedSettlementDateTime;
    }

    public OBWriteInternationalResponse3Data charges(List<OBWriteDomesticConsentResponse3DataCharges> charges) {
        this.charges = charges;
        return this;
    }

    public OBWriteInternationalResponse3Data addChargesItem(OBWriteDomesticConsentResponse3DataCharges chargesItem) {
        if (this.charges == null) {
            this.charges = new ArrayList<OBWriteDomesticConsentResponse3DataCharges>();
        }
        this.charges.add(chargesItem);
        return this;
    }

    /**
     * Get charges
     *
     * @return charges
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBWriteDomesticConsentResponse3DataCharges> getCharges() {
        return charges;
    }

    public void setCharges(List<OBWriteDomesticConsentResponse3DataCharges> charges) {
        this.charges = charges;
    }

    public OBWriteInternationalResponse3Data exchangeRateInformation(OBWriteInternationalConsentResponse3DataExchangeRateInformation exchangeRateInformation) {
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
    public OBWriteInternationalConsentResponse3DataExchangeRateInformation getExchangeRateInformation() {
        return exchangeRateInformation;
    }

    public void setExchangeRateInformation(OBWriteInternationalConsentResponse3DataExchangeRateInformation exchangeRateInformation) {
        this.exchangeRateInformation = exchangeRateInformation;
    }

    public OBWriteInternationalResponse3Data initiation(OBWriteInternational2DataInitiation initiation) {
        this.initiation = initiation;
        return this;
    }

    /**
     * Get initiation
     *
     * @return initiation
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBWriteInternational2DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteInternational2DataInitiation initiation) {
        this.initiation = initiation;
    }

    public OBWriteInternationalResponse3Data multiAuthorisation(OBWriteDomesticResponse3DataMultiAuthorisation multiAuthorisation) {
        this.multiAuthorisation = multiAuthorisation;
        return this;
    }

    /**
     * Get multiAuthorisation
     *
     * @return multiAuthorisation
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBWriteDomesticResponse3DataMultiAuthorisation getMultiAuthorisation() {
        return multiAuthorisation;
    }

    public void setMultiAuthorisation(OBWriteDomesticResponse3DataMultiAuthorisation multiAuthorisation) {
        this.multiAuthorisation = multiAuthorisation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalResponse3Data obWriteInternationalResponse3Data = (OBWriteInternationalResponse3Data) o;
        return Objects.equals(this.internationalPaymentId, obWriteInternationalResponse3Data.internationalPaymentId) &&
                Objects.equals(this.consentId, obWriteInternationalResponse3Data.consentId) &&
                Objects.equals(this.creationDateTime, obWriteInternationalResponse3Data.creationDateTime) &&
                Objects.equals(this.status, obWriteInternationalResponse3Data.status) &&
                Objects.equals(this.statusUpdateDateTime, obWriteInternationalResponse3Data.statusUpdateDateTime) &&
                Objects.equals(this.expectedExecutionDateTime, obWriteInternationalResponse3Data.expectedExecutionDateTime) &&
                Objects.equals(this.expectedSettlementDateTime, obWriteInternationalResponse3Data.expectedSettlementDateTime) &&
                Objects.equals(this.charges, obWriteInternationalResponse3Data.charges) &&
                Objects.equals(this.exchangeRateInformation, obWriteInternationalResponse3Data.exchangeRateInformation) &&
                Objects.equals(this.initiation, obWriteInternationalResponse3Data.initiation) &&
                Objects.equals(this.multiAuthorisation, obWriteInternationalResponse3Data.multiAuthorisation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(internationalPaymentId, consentId, creationDateTime, status, statusUpdateDateTime, expectedExecutionDateTime, expectedSettlementDateTime, charges, exchangeRateInformation, initiation, multiAuthorisation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalResponse3Data {\n");

        sb.append("    internationalPaymentId: ").append(toIndentedString(internationalPaymentId)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    expectedExecutionDateTime: ").append(toIndentedString(expectedExecutionDateTime)).append("\n");
        sb.append("    expectedSettlementDateTime: ").append(toIndentedString(expectedSettlementDateTime)).append("\n");
        sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
        sb.append("    exchangeRateInformation: ").append(toIndentedString(exchangeRateInformation)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
        sb.append("    multiAuthorisation: ").append(toIndentedString(multiAuthorisation)).append("\n");
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

    /**
     * Specifies the status of the payment information group.
     */
    public enum StatusEnum {
        ACCEPTEDCREDITSETTLEMENTCOMPLETED("AcceptedCreditSettlementCompleted"),

        ACCEPTEDSETTLEMENTCOMPLETED("AcceptedSettlementCompleted"),

        ACCEPTEDSETTLEMENTINPROCESS("AcceptedSettlementInProcess"),

        ACCEPTEDWITHOUTPOSTING("AcceptedWithoutPosting"),

        PENDING("Pending"),

        REJECTED("Rejected");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}

