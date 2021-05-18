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
 * Applicable fee/charges for repayment such as prepayment, full early repayment or non repayment.
 */
@ApiModel(description = "Applicable fee/charges for repayment such as prepayment, full early repayment or non repayment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-23T11:27:41.089+01:00")
public class OBRepaymentFeeCharges1 {
    @JsonProperty("RepaymentFeeChargeDetail")
    private List<OBRepaymentFeeChargeDetail1> repaymentFeeChargeDetail = new ArrayList<OBRepaymentFeeChargeDetail1>();

    @JsonProperty("RepaymentFeeChargeCap")
    private List<OBRepaymentFeeChargeCap1> repaymentFeeChargeCap = null;

    public OBRepaymentFeeCharges1 repaymentFeeChargeDetail(List<OBRepaymentFeeChargeDetail1> repaymentFeeChargeDetail) {
        this.repaymentFeeChargeDetail = repaymentFeeChargeDetail;
        return this;
    }

    public OBRepaymentFeeCharges1 addRepaymentFeeChargeDetailItem(OBRepaymentFeeChargeDetail1 repaymentFeeChargeDetailItem) {
        this.repaymentFeeChargeDetail.add(repaymentFeeChargeDetailItem);
        return this;
    }

    /**
     * Details about specific fees/charges that are applied for repayment
     *
     * @return repaymentFeeChargeDetail
     **/
    @NotNull
    @Valid
    @Size(min = 1)
    @ApiModelProperty(required = true, value = "Details about specific fees/charges that are applied for repayment")
    public List<OBRepaymentFeeChargeDetail1> getRepaymentFeeChargeDetail() {
        return repaymentFeeChargeDetail;
    }

    public void setRepaymentFeeChargeDetail(List<OBRepaymentFeeChargeDetail1> repaymentFeeChargeDetail) {
        this.repaymentFeeChargeDetail = repaymentFeeChargeDetail;
    }

    public OBRepaymentFeeCharges1 repaymentFeeChargeCap(List<OBRepaymentFeeChargeCap1> repaymentFeeChargeCap) {
        this.repaymentFeeChargeCap = repaymentFeeChargeCap;
        return this;
    }

    public OBRepaymentFeeCharges1 addRepaymentFeeChargeCapItem(OBRepaymentFeeChargeCap1 repaymentFeeChargeCapItem) {
        if (this.repaymentFeeChargeCap == null) {
            this.repaymentFeeChargeCap = new ArrayList<OBRepaymentFeeChargeCap1>();
        }
        this.repaymentFeeChargeCap.add(repaymentFeeChargeCapItem);
        return this;
    }

    /**
     * RepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged
     *
     * @return repaymentFeeChargeCap
     **/
    @Valid
    @ApiModelProperty(value = "RepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged")
    public List<OBRepaymentFeeChargeCap1> getRepaymentFeeChargeCap() {
        return repaymentFeeChargeCap;
    }

    public void setRepaymentFeeChargeCap(List<OBRepaymentFeeChargeCap1> repaymentFeeChargeCap) {
        this.repaymentFeeChargeCap = repaymentFeeChargeCap;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBRepaymentFeeCharges1 obRepaymentFeeCharges1 = (OBRepaymentFeeCharges1) o;
        return Objects.equals(this.repaymentFeeChargeDetail, obRepaymentFeeCharges1.repaymentFeeChargeDetail) &&
                Objects.equals(this.repaymentFeeChargeCap, obRepaymentFeeCharges1.repaymentFeeChargeCap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repaymentFeeChargeDetail, repaymentFeeChargeCap);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBRepaymentFeeCharges1 {\n");

        sb.append("    repaymentFeeChargeDetail: ").append(toIndentedString(repaymentFeeChargeDetail)).append("\n");
        sb.append("    repaymentFeeChargeCap: ").append(toIndentedString(repaymentFeeChargeCap)).append("\n");
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

