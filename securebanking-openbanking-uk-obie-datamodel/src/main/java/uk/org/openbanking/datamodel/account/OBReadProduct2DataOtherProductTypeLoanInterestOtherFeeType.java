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
 * OpenAPI spec version: v3.1.7
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

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Other fee type code which is not available in the standard code set
 */
@ApiModel(description = "Other fee type code which is not available in the standard code set")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-05T09:20:17.613+01:00")
public class OBReadProduct2DataOtherProductTypeLoanInterestOtherFeeType {
    @JsonProperty("Code")
    private String code = null;

    @JsonProperty("Description")
    private String description = null;

    @JsonProperty("Name")
    private String name = null;

    public OBReadProduct2DataOtherProductTypeLoanInterestOtherFeeType code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     * @return code
     **/
    @Pattern(regexp = "^\\w{0,4}$")
    @ApiModelProperty(value = "")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestOtherFeeType description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     **/
    @NotNull
    @Size(min = 1, max = 350)
    @ApiModelProperty(required = true, value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestOtherFeeType name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     **/
    @NotNull
    @Size(min = 1, max = 70)
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeLoanInterestOtherFeeType obReadProduct2DataOtherProductTypeLoanInterestOtherFeeType = (OBReadProduct2DataOtherProductTypeLoanInterestOtherFeeType) o;
        return Objects.equals(this.code, obReadProduct2DataOtherProductTypeLoanInterestOtherFeeType.code) &&
                Objects.equals(this.description, obReadProduct2DataOtherProductTypeLoanInterestOtherFeeType.description) &&
                Objects.equals(this.name, obReadProduct2DataOtherProductTypeLoanInterestOtherFeeType.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, description, name);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeLoanInterestOtherFeeType {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

