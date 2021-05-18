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
 * OpenAPI spec version: v3.1.1
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
 * Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits
 */
@ApiModel(description = "Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-23T11:27:41.089+01:00")
public class OBLoanInterestFeesCharges1 {
    @JsonProperty("LoanInterestFeeChargeDetail")
    private List<OBLoanInterestFeesChargeDetail1> loanInterestFeeChargeDetail = new ArrayList<OBLoanInterestFeesChargeDetail1>();

    @JsonProperty("LoanInterestFeeChargeCap")
    private List<OBLoanInterestFeesChargeCap1> loanInterestFeeChargeCap = null;

    public OBLoanInterestFeesCharges1 loanInterestFeeChargeDetail(List<OBLoanInterestFeesChargeDetail1> loanInterestFeeChargeDetail) {
        this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
        return this;
    }

    public OBLoanInterestFeesCharges1 addLoanInterestFeeChargeDetailItem(OBLoanInterestFeesChargeDetail1 loanInterestFeeChargeDetailItem) {
        this.loanInterestFeeChargeDetail.add(loanInterestFeeChargeDetailItem);
        return this;
    }

    /**
     * Other fees/charges details
     *
     * @return loanInterestFeeChargeDetail
     **/
    @NotNull
    @Valid
    @Size(min = 1)
    @ApiModelProperty(required = true, value = "Other fees/charges details")
    public List<OBLoanInterestFeesChargeDetail1> getLoanInterestFeeChargeDetail() {
        return loanInterestFeeChargeDetail;
    }

    public void setLoanInterestFeeChargeDetail(List<OBLoanInterestFeesChargeDetail1> loanInterestFeeChargeDetail) {
        this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
    }

    public OBLoanInterestFeesCharges1 loanInterestFeeChargeCap(List<OBLoanInterestFeesChargeCap1> loanInterestFeeChargeCap) {
        this.loanInterestFeeChargeCap = loanInterestFeeChargeCap;
        return this;
    }

    public OBLoanInterestFeesCharges1 addLoanInterestFeeChargeCapItem(OBLoanInterestFeesChargeCap1 loanInterestFeeChargeCapItem) {
        if (this.loanInterestFeeChargeCap == null) {
            this.loanInterestFeeChargeCap = new ArrayList<OBLoanInterestFeesChargeCap1>();
        }
        this.loanInterestFeeChargeCap.add(loanInterestFeeChargeCapItem);
        return this;
    }

    /**
     * Details about any caps (minimum/maximum charges) that apply to a particular fee/charge
     *
     * @return loanInterestFeeChargeCap
     **/
    @Valid
    @ApiModelProperty(value = "Details about any caps (minimum/maximum charges) that apply to a particular fee/charge")
    public List<OBLoanInterestFeesChargeCap1> getLoanInterestFeeChargeCap() {
        return loanInterestFeeChargeCap;
    }

    public void setLoanInterestFeeChargeCap(List<OBLoanInterestFeesChargeCap1> loanInterestFeeChargeCap) {
        this.loanInterestFeeChargeCap = loanInterestFeeChargeCap;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBLoanInterestFeesCharges1 obLoanInterestFeesCharges1 = (OBLoanInterestFeesCharges1) o;
        return Objects.equals(this.loanInterestFeeChargeDetail, obLoanInterestFeesCharges1.loanInterestFeeChargeDetail) &&
                Objects.equals(this.loanInterestFeeChargeCap, obLoanInterestFeesCharges1.loanInterestFeeChargeCap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loanInterestFeeChargeDetail, loanInterestFeeChargeCap);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBLoanInterestFeesCharges1 {\n");

        sb.append("    loanInterestFeeChargeDetail: ").append(toIndentedString(loanInterestFeeChargeDetail)).append("\n");
        sb.append("    loanInterestFeeChargeCap: ").append(toIndentedString(loanInterestFeeChargeCap)).append("\n");
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

