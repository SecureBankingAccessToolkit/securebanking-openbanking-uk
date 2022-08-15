/*
 * Copyright © 2020-2022 ForgeRock AS (obst@forgerock.com)
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

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Relationship to the Account resource.
 */
@ApiModel(description = "Relationship to the Account resource.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-23T11:27:41.089+01:00")
public class OBRelationship1 {
    @JsonProperty("Related")
    private String related = null;

    @JsonProperty("Id")
    private String id = null;

    public OBRelationship1 related(String related) {
        this.related = related;
        return this;
    }

    /**
     * Absolute URI to the related resource.
     *
     * @return related
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Absolute URI to the related resource.")
    public String getRelated() {
        return related;
    }

    public void setRelated(String related) {
        this.related = related;
    }

    public OBRelationship1 id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identification as assigned by the ASPSP to uniquely identify the related resource.
     *
     * @return id
     **/
    @NotNull
    @Size(min = 1, max = 40)
    @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the related resource.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBRelationship1 obRelationship1 = (OBRelationship1) o;
        return Objects.equals(this.related, obRelationship1.related) &&
                Objects.equals(this.id, obRelationship1.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(related, id);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBRelationship1 {\n");

        sb.append("    related: ").append(toIndentedString(related)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

