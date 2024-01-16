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
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBWriteDataFileConsentResponse1
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen")

public class OBWriteDataFileConsentResponse1 {
    @JsonProperty("ConsentId")
    private String consentId = null;

    @JsonProperty("CreationDateTime")
    private DateTime creationDateTime = null;

    @JsonProperty("Status")
    private OBExternalConsentStatus2Code status = null;

    @JsonProperty("StatusUpdateDateTime")
    private DateTime statusUpdateDateTime = null;

    @JsonProperty("CutOffDateTime")
    private DateTime cutOffDateTime = null;

    @JsonProperty("Charges")
    @Valid
    private List<OBCharge1> charges = null;

    @JsonProperty("Initiation")
    private OBFile1 initiation = null;

    @JsonProperty("Authorisation")
    private OBAuthorisation1 authorisation = null;

    public OBWriteDataFileConsentResponse1 consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
     *
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

    public OBWriteDataFileConsentResponse1 creationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     **/
    @ApiModelProperty(required = true, value = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @NotNull

    @Valid

    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBWriteDataFileConsentResponse1 status(OBExternalConsentStatus2Code status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBExternalConsentStatus2Code getStatus() {
        return status;
    }

    public void setStatus(OBExternalConsentStatus2Code status) {
        this.status = status;
    }

    public OBWriteDataFileConsentResponse1 statusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the consent resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return statusUpdateDateTime
     **/
    @ApiModelProperty(required = true, value = "Date and time at which the consent resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @NotNull

    @Valid

    public DateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBWriteDataFileConsentResponse1 cutOffDateTime(DateTime cutOffDateTime) {
        this.cutOffDateTime = cutOffDateTime;
        return this;
    }

    /**
     * Specified cut-off date and time for the payment consent. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return cutOffDateTime
     **/
    @ApiModelProperty(value = "Specified cut-off date and time for the payment consent. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

    @Valid

    public DateTime getCutOffDateTime() {
        return cutOffDateTime;
    }

    public void setCutOffDateTime(DateTime cutOffDateTime) {
        this.cutOffDateTime = cutOffDateTime;
    }

    public OBWriteDataFileConsentResponse1 charges(List<OBCharge1> charges) {
        this.charges = charges;
        return this;
    }

    public OBWriteDataFileConsentResponse1 addChargesItem(OBCharge1 chargesItem) {
        if (this.charges == null) {
            this.charges = new ArrayList<OBCharge1>();
        }
        this.charges.add(chargesItem);
        return this;
    }

    /**
     * Set of elements used to provide details of a charge for the payment initiation.
     *
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

    public OBWriteDataFileConsentResponse1 initiation(OBFile1 initiation) {
        this.initiation = initiation;
        return this;
    }

    /**
     * Get initiation
     *
     * @return initiation
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBFile1 getInitiation() {
        return initiation;
    }

    public void setInitiation(OBFile1 initiation) {
        this.initiation = initiation;
    }

    public OBWriteDataFileConsentResponse1 authorisation(OBAuthorisation1 authorisation) {
        this.authorisation = authorisation;
        return this;
    }

    /**
     * Get authorisation
     *
     * @return authorisation
     **/
    @ApiModelProperty(value = "")

    @Valid

    public OBAuthorisation1 getAuthorisation() {
        return authorisation;
    }

    public void setAuthorisation(OBAuthorisation1 authorisation) {
        this.authorisation = authorisation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDataFileConsentResponse1 obWriteDataFileConsentResponse1 = (OBWriteDataFileConsentResponse1) o;
        return Objects.equals(this.consentId, obWriteDataFileConsentResponse1.consentId) &&
                Objects.equals(this.creationDateTime, obWriteDataFileConsentResponse1.creationDateTime) &&
                Objects.equals(this.status, obWriteDataFileConsentResponse1.status) &&
                Objects.equals(this.statusUpdateDateTime, obWriteDataFileConsentResponse1.statusUpdateDateTime) &&
                Objects.equals(this.cutOffDateTime, obWriteDataFileConsentResponse1.cutOffDateTime) &&
                Objects.equals(this.charges, obWriteDataFileConsentResponse1.charges) &&
                Objects.equals(this.initiation, obWriteDataFileConsentResponse1.initiation) &&
                Objects.equals(this.authorisation, obWriteDataFileConsentResponse1.authorisation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consentId, creationDateTime, status, statusUpdateDateTime, cutOffDateTime, charges, initiation, authorisation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDataFileConsentResponse1 {\n");

        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    cutOffDateTime: ").append(toIndentedString(cutOffDateTime)).append("\n");
        sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
        sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
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

