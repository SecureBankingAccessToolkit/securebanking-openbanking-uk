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
package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.util.Objects;

/**
 * Set of elements used to provide details of a generic rate related to the statement resource.
 */
@ApiModel(description = "Set of elements used to provide details of a generic rate related to the statement resource.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")

public class OBStatement2StatementRate {
    @JsonProperty("Rate")
    private String rate;

    @JsonProperty("Type")
    private String type;

    public OBStatement2StatementRate rate(String rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Rate associated with the statement rate type.
     *
     * @return rate
     */
    @ApiModelProperty(required = true, value = "Rate associated with the statement rate type.")
    @NotNull
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public OBStatement2StatementRate type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Statement rate type, in a coded form.
     *
     * @return type
     */
    @ApiModelProperty(required = true, value = "Statement rate type, in a coded form.")
    @NotNull
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBStatement2StatementRate obStatement2StatementRate = (OBStatement2StatementRate) o;
        return Objects.equals(this.rate, obStatement2StatementRate.rate) &&
                Objects.equals(this.type, obStatement2StatementRate.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rate, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatement2StatementRate {\n");

        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

