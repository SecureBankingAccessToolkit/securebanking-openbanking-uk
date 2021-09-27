/**
 * Copyright © 2021 ForgeRock AS (obst@forgerock.com)
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
 * OpenAPI spec version: v3.1.4
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
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBWriteDomesticStandingOrderResponse5Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T14:14:13.501+01:00")
public class OBWriteDomesticStandingOrderResponse5Data {
    @JsonProperty("DomesticStandingOrderId")
    private String domesticStandingOrderId = null;

    @JsonProperty("ConsentId")
    private String consentId = null;

    @JsonProperty("CreationDateTime")
    private DateTime creationDateTime = null;

    /**
     * Specifies the status of the payment order resource.
     */
    public enum StatusEnum {
        CANCELLED("Cancelled"),

        INITIATIONCOMPLETED("InitiationCompleted"),

        INITIATIONFAILED("InitiationFailed"),

        INITIATIONPENDING("InitiationPending");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
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
    }

    @JsonProperty("Status")
    private StatusEnum status = null;

    @JsonProperty("StatusUpdateDateTime")
    private DateTime statusUpdateDateTime = null;

    @JsonProperty("Refund")
    private OBWriteDomesticResponse4DataRefund refund = null;

    @JsonProperty("Charges")
    private List<OBWriteDomesticConsentResponse4DataCharges> charges = null;

    @JsonProperty("Initiation")
    private OBWriteDomesticStandingOrder3DataInitiation initiation = null;

    @JsonProperty("MultiAuthorisation")
    private OBWriteDomesticResponse4DataMultiAuthorisation multiAuthorisation = null;

    public OBWriteDomesticStandingOrderResponse5Data domesticStandingOrderId(String domesticStandingOrderId) {
        this.domesticStandingOrderId = domesticStandingOrderId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic standing order resource.
     *
     * @return domesticStandingOrderId
     **/
    @NotNull
    @Size(min = 1, max = 40)
    @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic standing order resource.")
    public String getDomesticStandingOrderId() {
        return domesticStandingOrderId;
    }

    public void setDomesticStandingOrderId(String domesticStandingOrderId) {
        this.domesticStandingOrderId = domesticStandingOrderId;
    }

    public OBWriteDomesticStandingOrderResponse5Data consentId(String consentId) {
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

    public OBWriteDomesticStandingOrderResponse5Data creationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBWriteDomesticStandingOrderResponse5Data status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Specifies the status of the payment order resource.
     *
     * @return status
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Specifies the status of the payment order resource.")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OBWriteDomesticStandingOrderResponse5Data statusUpdateDateTime(DateTime statusUpdateDateTime) {
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
    public DateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBWriteDomesticStandingOrderResponse5Data refund(OBWriteDomesticResponse4DataRefund refund) {
        this.refund = refund;
        return this;
    }

    /**
     * Get refund
     *
     * @return refund
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBWriteDomesticResponse4DataRefund getRefund() {
        return refund;
    }

    public void setRefund(OBWriteDomesticResponse4DataRefund refund) {
        this.refund = refund;
    }

    public OBWriteDomesticStandingOrderResponse5Data charges(List<OBWriteDomesticConsentResponse4DataCharges> charges) {
        this.charges = charges;
        return this;
    }

    public OBWriteDomesticStandingOrderResponse5Data addChargesItem(OBWriteDomesticConsentResponse4DataCharges chargesItem) {
        if (this.charges == null) {
            this.charges = new ArrayList<OBWriteDomesticConsentResponse4DataCharges>();
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
    public List<OBWriteDomesticConsentResponse4DataCharges> getCharges() {
        return charges;
    }

    public void setCharges(List<OBWriteDomesticConsentResponse4DataCharges> charges) {
        this.charges = charges;
    }

    public OBWriteDomesticStandingOrderResponse5Data initiation(OBWriteDomesticStandingOrder3DataInitiation initiation) {
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
    public OBWriteDomesticStandingOrder3DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteDomesticStandingOrder3DataInitiation initiation) {
        this.initiation = initiation;
    }

    public OBWriteDomesticStandingOrderResponse5Data multiAuthorisation(OBWriteDomesticResponse4DataMultiAuthorisation multiAuthorisation) {
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
    public OBWriteDomesticResponse4DataMultiAuthorisation getMultiAuthorisation() {
        return multiAuthorisation;
    }

    public void setMultiAuthorisation(OBWriteDomesticResponse4DataMultiAuthorisation multiAuthorisation) {
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
        OBWriteDomesticStandingOrderResponse5Data obWriteDomesticStandingOrderResponse5Data = (OBWriteDomesticStandingOrderResponse5Data) o;
        return Objects.equals(this.domesticStandingOrderId, obWriteDomesticStandingOrderResponse5Data.domesticStandingOrderId) &&
                Objects.equals(this.consentId, obWriteDomesticStandingOrderResponse5Data.consentId) &&
                Objects.equals(this.creationDateTime, obWriteDomesticStandingOrderResponse5Data.creationDateTime) &&
                Objects.equals(this.status, obWriteDomesticStandingOrderResponse5Data.status) &&
                Objects.equals(this.statusUpdateDateTime, obWriteDomesticStandingOrderResponse5Data.statusUpdateDateTime) &&
                Objects.equals(this.refund, obWriteDomesticStandingOrderResponse5Data.refund) &&
                Objects.equals(this.charges, obWriteDomesticStandingOrderResponse5Data.charges) &&
                Objects.equals(this.initiation, obWriteDomesticStandingOrderResponse5Data.initiation) &&
                Objects.equals(this.multiAuthorisation, obWriteDomesticStandingOrderResponse5Data.multiAuthorisation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domesticStandingOrderId, consentId, creationDateTime, status, statusUpdateDateTime, refund, charges, initiation, multiAuthorisation);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticStandingOrderResponse5Data {\n");

        sb.append("    domesticStandingOrderId: ").append(toIndentedString(domesticStandingOrderId)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
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

