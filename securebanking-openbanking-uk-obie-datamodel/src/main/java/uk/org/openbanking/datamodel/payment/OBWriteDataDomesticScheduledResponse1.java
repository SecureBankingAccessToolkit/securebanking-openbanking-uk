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
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBWriteDataDomesticScheduledResponse1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-10T14:05:22.993+01:00")

public class OBWriteDataDomesticScheduledResponse1 {
    @JsonProperty("DomesticScheduledPaymentId")
    private String domesticScheduledPaymentId = null;

    @JsonProperty("ConsentId")
    private String consentId = null;

    @JsonProperty("CreationDateTime")
    private OffsetDateTime creationDateTime = null;

    @JsonProperty("Status")
    private OBExternalStatus1Code status = null;

    @JsonProperty("StatusUpdateDateTime")
    private OffsetDateTime statusUpdateDateTime = null;

    @JsonProperty("ExpectedExecutionDateTime")
    private OffsetDateTime expectedExecutionDateTime = null;

    @JsonProperty("ExpectedSettlementDateTime")
    private OffsetDateTime expectedSettlementDateTime = null;

    @JsonProperty("Charges")
    @Valid
    private List<OBCharge1> charges = null;

    @JsonProperty("Initiation")
    private OBDomesticScheduled1 initiation = null;

    @JsonProperty("MultiAuthorisation")
    private OBMultiAuthorisation1 multiAuthorisation = null;

    public OBWriteDataDomesticScheduledResponse1 domesticScheduledPaymentId(String domesticScheduledPaymentId) {
        this.domesticScheduledPaymentId = domesticScheduledPaymentId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic schedule payment resource.
     * @return domesticScheduledPaymentId
     **/
    @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic schedule payment resource.")
    @NotNull

    @Size(min = 1, max = 40)
    public String getDomesticScheduledPaymentId() {
        return domesticScheduledPaymentId;
    }

    public void setDomesticScheduledPaymentId(String domesticScheduledPaymentId) {
        this.domesticScheduledPaymentId = domesticScheduledPaymentId;
    }

    public OBWriteDataDomesticScheduledResponse1 consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
     * @return consentId
     **/
    @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
    @NotNull

    @Size(min = 1, max = 128)
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBWriteDataDomesticScheduledResponse1 creationDateTime(OffsetDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the message was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     * @return creationDateTime
     **/
    @ApiModelProperty(required = true, value = "Date and time at which the message was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @NotNull

    @Valid

    public OffsetDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(OffsetDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBWriteDataDomesticScheduledResponse1 status(OBExternalStatus1Code status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBExternalStatus1Code getStatus() {
        return status;
    }

    public void setStatus(OBExternalStatus1Code status) {
        this.status = status;
    }

    public OBWriteDataDomesticScheduledResponse1 statusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     * @return statusUpdateDateTime
     **/
    @ApiModelProperty(required = true, value = "Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @NotNull

    @Valid

    public OffsetDateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBWriteDataDomesticScheduledResponse1 expectedExecutionDateTime(OffsetDateTime expectedExecutionDateTime) {
        this.expectedExecutionDateTime = expectedExecutionDateTime;
        return this;
    }

    /**
     * Expected execution date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     * @return expectedExecutionDateTime
     **/
    @ApiModelProperty(value = "Expected execution date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

    @Valid

    public OffsetDateTime getExpectedExecutionDateTime() {
        return expectedExecutionDateTime;
    }

    public void setExpectedExecutionDateTime(OffsetDateTime expectedExecutionDateTime) {
        this.expectedExecutionDateTime = expectedExecutionDateTime;
    }

    public OBWriteDataDomesticScheduledResponse1 expectedSettlementDateTime(OffsetDateTime expectedSettlementDateTime) {
        this.expectedSettlementDateTime = expectedSettlementDateTime;
        return this;
    }

    /**
     * Expected settlement date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     * @return expectedSettlementDateTime
     **/
    @ApiModelProperty(value = "Expected settlement date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

    @Valid

    public OffsetDateTime getExpectedSettlementDateTime() {
        return expectedSettlementDateTime;
    }

    public void setExpectedSettlementDateTime(OffsetDateTime expectedSettlementDateTime) {
        this.expectedSettlementDateTime = expectedSettlementDateTime;
    }

    public OBWriteDataDomesticScheduledResponse1 charges(List<OBCharge1> charges) {
        this.charges = charges;
        return this;
    }

    public OBWriteDataDomesticScheduledResponse1 addChargesItem(OBCharge1 chargesItem) {
        if (this.charges == null) {
            this.charges = new ArrayList<OBCharge1>();
        }
        this.charges.add(chargesItem);
        return this;
    }

    /**
     * Set of elements used to provide details of a charge for the payment initiation.
     * @return charges
     **/
    @ApiModelProperty(value = "Set of elements used to provide details of a charge for the payment initiation.")

    @Valid

    public List<OBCharge1> getCharges() {
        return charges;
    }

    public void setCharges(List<OBCharge1> charges) {
        this.charges = charges;
    }

    public OBWriteDataDomesticScheduledResponse1 initiation(OBDomesticScheduled1 initiation) {
        this.initiation = initiation;
        return this;
    }

    /**
     * Get initiation
     * @return initiation
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBDomesticScheduled1 getInitiation() {
        return initiation;
    }

    public void setInitiation(OBDomesticScheduled1 initiation) {
        this.initiation = initiation;
    }

    public OBWriteDataDomesticScheduledResponse1 multiAuthorisation(OBMultiAuthorisation1 multiAuthorisation) {
        this.multiAuthorisation = multiAuthorisation;
        return this;
    }

    /**
     * Get multiAuthorisation
     * @return multiAuthorisation
     **/
    @ApiModelProperty(value = "")

    @Valid

    public OBMultiAuthorisation1 getMultiAuthorisation() {
        return multiAuthorisation;
    }

    public void setMultiAuthorisation(OBMultiAuthorisation1 multiAuthorisation) {
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
        OBWriteDataDomesticScheduledResponse1 obWriteDataDomesticScheduledResponse1 = (OBWriteDataDomesticScheduledResponse1) o;
        return Objects.equals(this.domesticScheduledPaymentId, obWriteDataDomesticScheduledResponse1.domesticScheduledPaymentId) &&
                Objects.equals(this.consentId, obWriteDataDomesticScheduledResponse1.consentId) &&
                Objects.equals(this.creationDateTime, obWriteDataDomesticScheduledResponse1.creationDateTime) &&
                Objects.equals(this.status, obWriteDataDomesticScheduledResponse1.status) &&
                Objects.equals(this.statusUpdateDateTime, obWriteDataDomesticScheduledResponse1.statusUpdateDateTime) &&
                Objects.equals(this.expectedExecutionDateTime, obWriteDataDomesticScheduledResponse1.expectedExecutionDateTime) &&
                Objects.equals(this.expectedSettlementDateTime, obWriteDataDomesticScheduledResponse1.expectedSettlementDateTime) &&
                Objects.equals(this.charges, obWriteDataDomesticScheduledResponse1.charges) &&
                Objects.equals(this.initiation, obWriteDataDomesticScheduledResponse1.initiation) &&
                Objects.equals(this.multiAuthorisation, obWriteDataDomesticScheduledResponse1.multiAuthorisation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domesticScheduledPaymentId, consentId, creationDateTime, status, statusUpdateDateTime, expectedExecutionDateTime, expectedSettlementDateTime, charges, initiation, multiAuthorisation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDataDomesticScheduledResponse1 {\n");

        sb.append("    domesticScheduledPaymentId: ").append(toIndentedString(domesticScheduledPaymentId)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    expectedExecutionDateTime: ").append(toIndentedString(expectedExecutionDateTime)).append("\n");
        sb.append("    expectedSettlementDateTime: ").append(toIndentedString(expectedSettlementDateTime)).append("\n");
        sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
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
}

