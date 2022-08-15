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
 * Event Notification API Specification - TPP Endpoints
 * Swagger for Event Notification API Specification - TPP Endpoints
 *
 * OpenAPI spec version: 3.1.7
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Resource-Update Event.
 */
@ApiModel(description = "Resource-Update Event.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:51:33.738+01:00")
public class OBEventResourceUpdate1 {
  @JsonProperty("subject")
  private OBEventSubject1 subject = null;

  public OBEventResourceUpdate1 subject(OBEventSubject1 subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   *
   * @return subject
   **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public OBEventSubject1 getSubject() {
    return subject;
  }

  public void setSubject(OBEventSubject1 subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBEventResourceUpdate1 obEventResourceUpdate1 = (OBEventResourceUpdate1) o;
    return Objects.equals(this.subject, obEventResourceUpdate1.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBEventResourceUpdate1 {\n");

    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

