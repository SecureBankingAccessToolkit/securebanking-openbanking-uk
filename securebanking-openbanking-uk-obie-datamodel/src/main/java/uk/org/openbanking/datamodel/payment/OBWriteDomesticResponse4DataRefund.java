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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Unambiguous identification of the refund account to which a refund will be made as a result of the transaction.
 */
@ApiModel(description = "Unambiguous identification of the refund account to which a refund will be made as a result of the transaction.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T14:14:13.501+01:00")
public class OBWriteDomesticResponse4DataRefund {
    @JsonProperty("Account")
    private OBWriteDomesticResponse4DataRefundAccount account = null;

    public OBWriteDomesticResponse4DataRefund account(OBWriteDomesticResponse4DataRefundAccount account) {
        this.account = account;
        return this;
    }

    /**
     * Get account
     *
     * @return account
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBWriteDomesticResponse4DataRefundAccount getAccount() {
        return account;
    }

    public void setAccount(OBWriteDomesticResponse4DataRefundAccount account) {
        this.account = account;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticResponse4DataRefund obWriteDomesticResponse4DataRefund = (OBWriteDomesticResponse4DataRefund) o;
        return Objects.equals(this.account, obWriteDomesticResponse4DataRefund.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticResponse4DataRefund {\n");

        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

