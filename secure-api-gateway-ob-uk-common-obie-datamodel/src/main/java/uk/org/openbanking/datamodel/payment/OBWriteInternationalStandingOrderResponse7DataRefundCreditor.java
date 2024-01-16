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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import uk.org.openbanking.datamodel.common.OBPostalAddress6;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import java.util.Objects;

/**
 * Set of elements used to identify a person or an organisation.
 */
@ApiModel(description = "Set of elements used to identify a person or an organisation.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteInternationalStandingOrderResponse7DataRefundCreditor {
    @JsonProperty("Name")
    private String name;

    @JsonProperty("PostalAddress")
    private OBPostalAddress6 postalAddress;

    public OBWriteInternationalStandingOrderResponse7DataRefundCreditor name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name by which a party is known and which is usually used to identify that party.
     *
     * @return name
     */
    @ApiModelProperty(value = "Name by which a party is known and which is usually used to identify that party.")

    @Size(min = 1, max = 350)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBWriteInternationalStandingOrderResponse7DataRefundCreditor postalAddress(OBPostalAddress6 postalAddress) {
        this.postalAddress = postalAddress;
        return this;
    }

    /**
     * Get postalAddress
     *
     * @return postalAddress
     */
    @ApiModelProperty(value = "")

    @Valid

    public OBPostalAddress6 getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(OBPostalAddress6 postalAddress) {
        this.postalAddress = postalAddress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalStandingOrderResponse7DataRefundCreditor obWriteInternationalStandingOrderResponse7DataRefundCreditor = (OBWriteInternationalStandingOrderResponse7DataRefundCreditor) o;
        return Objects.equals(this.name, obWriteInternationalStandingOrderResponse7DataRefundCreditor.name) &&
                Objects.equals(this.postalAddress, obWriteInternationalStandingOrderResponse7DataRefundCreditor.postalAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, postalAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalStandingOrderResponse7DataRefundCreditor {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
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

