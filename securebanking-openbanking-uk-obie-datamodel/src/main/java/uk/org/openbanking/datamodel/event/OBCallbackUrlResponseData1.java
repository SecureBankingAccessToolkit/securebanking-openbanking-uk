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
 * Event Notification API Specification - ASPSP Endpoints
 * Swagger for Event Notification API Specification - ASPSP Endpoints
 *
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.event;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBCallbackUrlResponseData1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-25T13:48:32.198+01:00")
public class OBCallbackUrlResponseData1 {
  @JsonProperty("CallbackUrlId")
  private String callbackUrlId = null;

  @JsonProperty("Url")
  private String url = null;

  @JsonProperty("Version")
  private String version = null;

  public OBCallbackUrlResponseData1 callbackUrlId(String callbackUrlId) {
    this.callbackUrlId = callbackUrlId;
    return this;
  }

   /**
   * Unique identification as assigned by the ASPSP to uniquely identify the callback url resource.
   * @return callbackUrlId
  **/
   @NotNull
   @Size(min = 1, max = 40)
   @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the callback url resource.")
  public String getCallbackUrlId() {
    return callbackUrlId;
  }

  public void setCallbackUrlId(String callbackUrlId) {
    this.callbackUrlId = callbackUrlId;
  }

  public OBCallbackUrlResponseData1 url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.
   * @return url
  **/
   @NotNull
   @ApiModelProperty(required = true, value = "Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.")
   public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public OBCallbackUrlResponseData1 version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version for the event notification.
   * @return version
  **/
   @NotNull
   @Size(min = 1, max = 10)
   @ApiModelProperty(required = true, value = "Version for the event notification.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBCallbackUrlResponseData1 obCallbackUrlResponseData1 = (OBCallbackUrlResponseData1) o;
    return Objects.equals(this.callbackUrlId, obCallbackUrlResponseData1.callbackUrlId) &&
        Objects.equals(this.url, obCallbackUrlResponseData1.url) &&
        Objects.equals(this.version, obCallbackUrlResponseData1.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrlId, url, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBCallbackUrlResponseData1 {\n");

      sb.append("    callbackUrlId: ").append(toIndentedString(callbackUrlId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

