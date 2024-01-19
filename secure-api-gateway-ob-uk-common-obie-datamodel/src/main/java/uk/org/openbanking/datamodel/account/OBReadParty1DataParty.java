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
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadParty1DataParty
 */
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen")
public class OBReadParty1DataParty {
    @JsonProperty("PartyId")
    private String partyId = null;

    @JsonProperty("PartyNumber")
    private String partyNumber = null;

    @JsonProperty("PartyType")
    private OBExternalPartyType1Code partyType = null;

    @JsonProperty("Name")
    private String name = null;

    @JsonProperty("EmailAddress")
    private String emailAddress = null;

    @JsonProperty("Phone")
    private String phone = null;

    @JsonProperty("Mobile")
    private String mobile = null;

    @JsonProperty("Address")
    private List<OBParty2Address> address = null;

    public OBReadParty1DataParty partyId(String partyId) {
        this.partyId = partyId;
        return this;
    }

    /**
     * Get partyId
     *
     * @return partyId
     **/
    @NotNull
    @Size(min = 1, max = 40)
    @ApiModelProperty(required = true, value = "")
    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public OBReadParty1DataParty partyNumber(String partyNumber) {
        this.partyNumber = partyNumber;
        return this;
    }

    /**
     * Get partyNumber
     *
     * @return partyNumber
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "")
    public String getPartyNumber() {
        return partyNumber;
    }

    public void setPartyNumber(String partyNumber) {
        this.partyNumber = partyNumber;
    }

    public OBReadParty1DataParty partyType(OBExternalPartyType1Code partyType) {
        this.partyType = partyType;
        return this;
    }

    /**
     * Get partyType
     *
     * @return partyType
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBExternalPartyType1Code getPartyType() {
        return partyType;
    }

    public void setPartyType(OBExternalPartyType1Code partyType) {
        this.partyType = partyType;
    }

    public OBReadParty1DataParty name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @Size(min = 1, max = 70)
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBReadParty1DataParty emailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Get emailAddress
     *
     * @return emailAddress
     **/
    @Size(min = 1, max = 256)
    @ApiModelProperty(value = "")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public OBReadParty1DataParty phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get phone
     *
     * @return phone
     **/
    @Pattern(regexp = "\\+[0-9]{1,3}-[0-9()+\\-]{1,30}")
    @ApiModelProperty(value = "")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public OBReadParty1DataParty mobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     * Get mobile
     *
     * @return mobile
     **/
    @Pattern(regexp = "\\+[0-9]{1,3}-[0-9()+\\-]{1,30}")
    @ApiModelProperty(value = "")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public OBReadParty1DataParty address(List<OBParty2Address> address) {
        this.address = address;
        return this;
    }

    public OBReadParty1DataParty addAddressItem(OBParty2Address addressItem) {
        if (this.address == null) {
            this.address = new ArrayList<OBParty2Address>();
        }
        this.address.add(addressItem);
        return this;
    }

    /**
     * Get address
     *
     * @return address
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBParty2Address> getAddress() {
        return address;
    }

    public void setAddress(List<OBParty2Address> address) {
        this.address = address;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadParty1DataParty obReadParty1DataParty = (OBReadParty1DataParty) o;
        return Objects.equals(this.partyId, obReadParty1DataParty.partyId) &&
                Objects.equals(this.partyNumber, obReadParty1DataParty.partyNumber) &&
                Objects.equals(this.partyType, obReadParty1DataParty.partyType) &&
                Objects.equals(this.name, obReadParty1DataParty.name) &&
                Objects.equals(this.emailAddress, obReadParty1DataParty.emailAddress) &&
                Objects.equals(this.phone, obReadParty1DataParty.phone) &&
                Objects.equals(this.mobile, obReadParty1DataParty.mobile) &&
                Objects.equals(this.address, obReadParty1DataParty.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partyId, partyNumber, partyType, name, emailAddress, phone, mobile, address);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadParty1DataParty {\n");

        sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
        sb.append("    partyNumber: ").append(toIndentedString(partyNumber)).append("\n");
        sb.append("    partyType: ").append(toIndentedString(partyType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

