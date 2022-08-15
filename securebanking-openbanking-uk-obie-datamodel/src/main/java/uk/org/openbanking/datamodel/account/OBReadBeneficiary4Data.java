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
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.3-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadBeneficiary4Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T10:29:01.751+01:00")
public class OBReadBeneficiary4Data {
    @JsonProperty("Beneficiary")
    private List<OBBeneficiary4> beneficiary = null;

    public OBReadBeneficiary4Data beneficiary(List<OBBeneficiary4> beneficiary) {
        this.beneficiary = beneficiary;
        return this;
    }

    public OBReadBeneficiary4Data addBeneficiaryItem(OBBeneficiary4 beneficiaryItem) {
        if (this.beneficiary == null) {
            this.beneficiary = new ArrayList<OBBeneficiary4>();
        }
        this.beneficiary.add(beneficiaryItem);
        return this;
    }

    /**
     * Get beneficiary
     *
     * @return beneficiary
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBBeneficiary4> getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(List<OBBeneficiary4> beneficiary) {
        this.beneficiary = beneficiary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadBeneficiary4Data obReadBeneficiary4Data = (OBReadBeneficiary4Data) o;
        return Objects.equals(this.beneficiary, obReadBeneficiary4Data.beneficiary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beneficiary);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadBeneficiary4Data {\n");

        sb.append("    beneficiary: ").append(toIndentedString(beneficiary)).append("\n");
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

