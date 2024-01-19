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

import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * BCA
 */
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen")
public class BCA {
    @JsonProperty("ProductDetails")
    private ProductDetails productDetails = null;

    @JsonProperty("CreditInterest")
    private CreditInterest creditInterest = null;

    @JsonProperty("Overdraft")
    private Overdraft overdraft = null;

    @JsonProperty("OtherFeesCharges")
    private List<BCAOtherFeesCharges> otherFeesCharges = null;

    public BCA productDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
        return this;
    }

    /**
     * Get productDetails
     *
     * @return productDetails
     **/
    @Valid
    @ApiModelProperty(value = "")
    public ProductDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
    }

    public BCA creditInterest(CreditInterest creditInterest) {
        this.creditInterest = creditInterest;
        return this;
    }

    /**
     * Get creditInterest
     *
     * @return creditInterest
     **/
    @Valid
    @ApiModelProperty(value = "")
    public CreditInterest getCreditInterest() {
        return creditInterest;
    }

    public void setCreditInterest(CreditInterest creditInterest) {
        this.creditInterest = creditInterest;
    }

    public BCA overdraft(Overdraft overdraft) {
        this.overdraft = overdraft;
        return this;
    }

    /**
     * Get overdraft
     *
     * @return overdraft
     **/
    @Valid
    @ApiModelProperty(value = "")
    public Overdraft getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(Overdraft overdraft) {
        this.overdraft = overdraft;
    }

    public BCA otherFeesCharges(List<BCAOtherFeesCharges> otherFeesCharges) {
        this.otherFeesCharges = otherFeesCharges;
        return this;
    }

    public BCA addOtherFeesChargesItem(BCAOtherFeesCharges otherFeesChargesItem) {
        if (this.otherFeesCharges == null) {
            this.otherFeesCharges = new ArrayList<BCAOtherFeesCharges>();
        }
        this.otherFeesCharges.add(otherFeesChargesItem);
        return this;
    }

    /**
     * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
     *
     * @return otherFeesCharges
     **/
    @Valid
    @ApiModelProperty(value = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")
    public List<BCAOtherFeesCharges> getOtherFeesCharges() {
        return otherFeesCharges;
    }

    public void setOtherFeesCharges(List<BCAOtherFeesCharges> otherFeesCharges) {
        this.otherFeesCharges = otherFeesCharges;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BCA BCA = (BCA) o;
        return Objects.equals(this.productDetails, BCA.productDetails) &&
                Objects.equals(this.creditInterest, BCA.creditInterest) &&
                Objects.equals(this.overdraft, BCA.overdraft) &&
                Objects.equals(this.otherFeesCharges, BCA.otherFeesCharges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productDetails, creditInterest, overdraft, otherFeesCharges);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BCA {\n");

        sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
        sb.append("    creditInterest: ").append(toIndentedString(creditInterest)).append("\n");
        sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
        sb.append("    otherFeesCharges: ").append(toIndentedString(otherFeesCharges)).append("\n");
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

