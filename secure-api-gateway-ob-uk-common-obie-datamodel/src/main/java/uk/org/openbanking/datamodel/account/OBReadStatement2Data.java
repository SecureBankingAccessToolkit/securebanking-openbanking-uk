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
 * OpenAPI spec version: v3.1.1
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
 * OBReadStatement2Data
 */
@jakarta.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen")
public class OBReadStatement2Data {
    @JsonProperty("Statement")
    private List<OBStatement2> statement = null;

    public OBReadStatement2Data statement(List<OBStatement2> statement) {
        this.statement = statement;
        return this;
    }

    public OBReadStatement2Data addStatementItem(OBStatement2 statementItem) {
        if (this.statement == null) {
            this.statement = new ArrayList<OBStatement2>();
        }
        this.statement.add(statementItem);
        return this;
    }

    /**
     * Provides further details on a statement resource.
     *
     * @return statement
     **/
    @Valid
    @ApiModelProperty(value = "Provides further details on a statement resource.")
    public List<OBStatement2> getStatement() {
        return statement;
    }

    public void setStatement(List<OBStatement2> statement) {
        this.statement = statement;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadStatement2Data obReadStatement2Data = (OBReadStatement2Data) o;
        return Objects.equals(this.statement, obReadStatement2Data.statement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statement);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadStatement2Data {\n");

        sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
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

