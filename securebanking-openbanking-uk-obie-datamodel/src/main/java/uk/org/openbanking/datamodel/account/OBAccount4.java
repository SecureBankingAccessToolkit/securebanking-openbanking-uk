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
 * OpenAPI spec version: v3.1.2-RC1
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
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Unambiguous identification of the account to which credit and debit entries are made.
 */
@ApiModel(description = "Unambiguous identification of the account to which credit and debit entries are made.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T15:59:01.633+01:00")
public class OBAccount4 {
    @JsonProperty("AccountId")
    private String accountId = null;

    @JsonProperty("Status")
    private OBAccountStatus1Code status = null;

    @JsonProperty("StatusUpdateDateTime")
    private String statusUpdateDateTime = null;

    @JsonProperty("Currency")
    private String currency = null;

    @JsonProperty("AccountType")
    private OBExternalAccountType1Code accountType = null;

    @JsonProperty("AccountSubType")
    private OBExternalAccountSubType1Code accountSubType = null;

    @JsonProperty("Description")
    private String description = null;

    @JsonProperty("Nickname")
    private String nickname = null;

    @JsonProperty("Account")
    private List<OBAccount3Account> account = null;

    @JsonProperty("Servicer")
    private OBBranchAndFinancialInstitutionIdentification50 servicer = null;

    public OBAccount4 accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get accountId
     *
     * @return accountId
     **/
    @NotNull
    @Size(min = 1, max = 40)
    @ApiModelProperty(required = true, value = "")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OBAccount4 status(OBAccountStatus1Code status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBAccountStatus1Code getStatus() {
        return status;
    }

    public void setStatus(OBAccountStatus1Code status) {
        this.status = status;
    }

    public OBAccount4 statusUpdateDateTime(String statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Get statusUpdateDateTime
     *
     * @return statusUpdateDateTime
     **/
    @ApiModelProperty(value = "")
    public String getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(String statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBAccount4 currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     *
     * @return currency
     **/
    @NotNull
    @Pattern(regexp = "^[A-Z]{3,3}$")
    @ApiModelProperty(required = true, value = "")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public OBAccount4 accountType(OBExternalAccountType1Code accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * Get accountType
     *
     * @return accountType
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBExternalAccountType1Code getAccountType() {
        return accountType;
    }

    public void setAccountType(OBExternalAccountType1Code accountType) {
        this.accountType = accountType;
    }

    public OBAccount4 accountSubType(OBExternalAccountSubType1Code accountSubType) {
        this.accountSubType = accountSubType;
        return this;
    }

    /**
     * Get accountSubType
     *
     * @return accountSubType
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBExternalAccountSubType1Code getAccountSubType() {
        return accountSubType;
    }

    public void setAccountSubType(OBExternalAccountSubType1Code accountSubType) {
        this.accountSubType = accountSubType;
    }

    public OBAccount4 description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OBAccount4 nickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    /**
     * Get nickname
     *
     * @return nickname
     **/
    @Size(min = 1, max = 70)
    @ApiModelProperty(value = "")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public OBAccount4 account(List<OBAccount3Account> account) {
        this.account = account;
        return this;
    }

    public OBAccount4 addAccountItem(OBAccount3Account accountItem) {
        if (this.account == null) {
            this.account = new ArrayList<OBAccount3Account>();
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
    public List<OBAccount3Account> getAccount() {
        return account;
    }

    public void setAccount(List<OBAccount3Account> account) {
        this.account = account;
    }

    public OBAccount4 servicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
        this.servicer = servicer;
        return this;
    }

    /**
     * Get servicer
     *
     * @return servicer
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBBranchAndFinancialInstitutionIdentification50 getServicer() {
        return servicer;
    }

    public void setServicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
        this.servicer = servicer;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBAccount4 obAccount4 = (OBAccount4) o;
        return Objects.equals(this.accountId, obAccount4.accountId) &&
                Objects.equals(this.status, obAccount4.status) &&
                Objects.equals(this.statusUpdateDateTime, obAccount4.statusUpdateDateTime) &&
                Objects.equals(this.currency, obAccount4.currency) &&
                Objects.equals(this.accountType, obAccount4.accountType) &&
                Objects.equals(this.accountSubType, obAccount4.accountSubType) &&
                Objects.equals(this.description, obAccount4.description) &&
                Objects.equals(this.nickname, obAccount4.nickname) &&
                Objects.equals(this.account, obAccount4.account) &&
                Objects.equals(this.servicer, obAccount4.servicer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, status, statusUpdateDateTime, currency, accountType, accountSubType, description, nickname, account, servicer);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBAccount4 {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    accountSubType: ").append(toIndentedString(accountSubType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    servicer: ").append(toIndentedString(servicer)).append("\n");
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

