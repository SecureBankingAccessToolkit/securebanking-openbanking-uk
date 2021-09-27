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
 * OBReadAccount5Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T10:29:01.751+01:00")
public class OBReadAccount5Data {
    @JsonProperty("Account")
    private List<OBAccount6> account = null;

    public OBReadAccount5Data account(List<OBAccount6> account) {
        this.account = account;
        return this;
    }

    public OBReadAccount5Data addAccountItem(OBAccount6 accountItem) {
        if (this.account == null) {
            this.account = new ArrayList<OBAccount6>();
        }
        this.account.add(accountItem);
        return this;
    }

    /**
     * Get account
     *
     * @return account
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBAccount6> getAccount() {
        return account;
    }

    public void setAccount(List<OBAccount6> account) {
        this.account = account;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadAccount5Data obReadAccount5Data = (OBReadAccount5Data) o;
        return Objects.equals(this.account, obReadAccount5Data.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadAccount5Data {\n");

        sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

