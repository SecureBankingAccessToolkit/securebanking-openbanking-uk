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
 * Confirmation of Funds API Specification
 * Swagger for Confirmation of Funds API Specification
 *
 * OpenAPI spec version: 3.1.7
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.fund;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Objects;

/**
 * Unambiguous identification of the account of the debtor to which a confirmation of funds consent will be applied.
 */
@ApiModel(description = "Unambiguous identification of the account of the debtor to which a confirmation of funds consent will be applied.")
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen")
public class OBFundsConfirmationConsent1DataDebtorAccount {
    @JsonProperty("Identification")
    private String identification = null;

    @JsonProperty("Name")
    private String name = null;

    @JsonProperty("SchemeName")
    private String schemeName = null;

    @JsonProperty("SecondaryIdentification")
    private String secondaryIdentification = null;

    public OBFundsConfirmationConsent1DataDebtorAccount identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Identification assigned by an institution to identify an account. This identification is known by the account owner.
     *
     * @return identification
     **/
    @NotNull
    @Size(min = 1, max = 256)
    @ApiModelProperty(required = true, value = "Identification assigned by an institution to identify an account. This identification is known by the account owner.")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBFundsConfirmationConsent1DataDebtorAccount name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the account, as assigned by the account servicing institution. Usage: The account name is the name or names of the account owner(s) represented at an account level. The account name is not the product name or the nickname of the account.
     *
     * @return name
     **/
    @Size(min = 1, max = 350)
    @ApiModelProperty(value = "Name of the account, as assigned by the account servicing institution. Usage: The account name is the name or names of the account owner(s) represented at an account level. The account name is not the product name or the nickname of the account.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBFundsConfirmationConsent1DataDebtorAccount schemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }

    /**
     * Name of the identification scheme, in a coded form as published in an external list.
     *
     * @return schemeName
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Name of the identification scheme, in a coded form as published in an external list.")
    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public OBFundsConfirmationConsent1DataDebtorAccount secondaryIdentification(String secondaryIdentification) {
        this.secondaryIdentification = secondaryIdentification;
        return this;
    }

    /**
     * This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).
     *
     * @return secondaryIdentification
     **/
    @Size(min = 1, max = 34)
    @ApiModelProperty(value = "This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).")
    public String getSecondaryIdentification() {
        return secondaryIdentification;
    }

    public void setSecondaryIdentification(String secondaryIdentification) {
        this.secondaryIdentification = secondaryIdentification;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBFundsConfirmationConsent1DataDebtorAccount obFundsConfirmationConsent1DataDebtorAccount = (OBFundsConfirmationConsent1DataDebtorAccount) o;
        return Objects.equals(this.identification, obFundsConfirmationConsent1DataDebtorAccount.identification) &&
                Objects.equals(this.name, obFundsConfirmationConsent1DataDebtorAccount.name) &&
                Objects.equals(this.schemeName, obFundsConfirmationConsent1DataDebtorAccount.schemeName) &&
                Objects.equals(this.secondaryIdentification, obFundsConfirmationConsent1DataDebtorAccount.secondaryIdentification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification, name, schemeName, secondaryIdentification);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBFundsConfirmationConsent1DataDebtorAccount {\n");

        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
        sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
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

