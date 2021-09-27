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
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * The resource-update event.
 */
@ApiModel(description = "The resource-update event.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:51:33.738+01:00")
public class OBEventNotification1 {
  @JsonProperty("aud")
  private String aud = null;

  @JsonProperty("events")
  private OBEvent1 events = null;

  @JsonProperty("iat")
  private Integer iat = null;

  @JsonProperty("iss")
  private String iss = null;

  @JsonProperty("jti")
  private String jti = null;

  @JsonProperty("sub")
  private String sub = null;

  @JsonProperty("toe")
  private Integer toe = null;

  @JsonProperty("txn")
  private String txn = null;

  public OBEventNotification1 aud(String aud) {
    this.aud = aud;
    return this;
  }

  /**
   * Audience.
   *
   * @return aud
   **/
  @NotNull
  @Size(min = 1, max = 128)
  @ApiModelProperty(required = true, value = "Audience.")
  public String getAud() {
    return aud;
  }

  public void setAud(String aud) {
    this.aud = aud;
  }

  public OBEventNotification1 events(OBEvent1 events) {
    this.events = events;
    return this;
  }

  /**
   * Get events
   *
   * @return events
   **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  public OBEvent1 getEvents() {
    return events;
  }

  public void setEvents(OBEvent1 events) {
    this.events = events;
  }

  public OBEventNotification1 iat(Integer iat) {
    this.iat = iat;
    return this;
  }

  /**
   * Issued At.
   * minimum: 0
   *
   * @return iat
   **/
  @NotNull
  @Min(0)
  @ApiModelProperty(required = true, value = "Issued At. ")
  public Integer getIat() {
    return iat;
  }

  public void setIat(Integer iat) {
    this.iat = iat;
  }

  public OBEventNotification1 iss(String iss) {
    this.iss = iss;
    return this;
  }

  /**
   * Issuer.
   *
   * @return iss
   **/
  @NotNull
  @ApiModelProperty(required = true, value = "Issuer.")
  public String getIss() {
    return iss;
  }

  public void setIss(String iss) {
    this.iss = iss;
  }

  public OBEventNotification1 jti(String jti) {
    this.jti = jti;
    return this;
  }

  /**
   * JWT ID.
   *
   * @return jti
   **/
  @NotNull
  @Size(min = 1, max = 128)
  @ApiModelProperty(required = true, value = "JWT ID.")
  public String getJti() {
    return jti;
  }

  public void setJti(String jti) {
    this.jti = jti;
  }

  public OBEventNotification1 sub(String sub) {
    this.sub = sub;
    return this;
  }

  /**
   * Subject
   *
   * @return sub
   **/
  @NotNull
  @ApiModelProperty(required = true, value = "Subject")
  public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }

  public OBEventNotification1 toe(Integer toe) {
    this.toe = toe;
    return this;
  }

  /**
   * Time of Event.
   * minimum: 0
   *
   * @return toe
   **/
  @NotNull
  @Min(0)
  @ApiModelProperty(required = true, value = "Time of Event.")
  public Integer getToe() {
    return toe;
  }

  public void setToe(Integer toe) {
    this.toe = toe;
  }

  public OBEventNotification1 txn(String txn) {
    this.txn = txn;
    return this;
  }

  /**
   * Transaction Identifier.
   *
   * @return txn
   **/
  @NotNull
  @Size(min = 1, max = 128)
  @ApiModelProperty(required = true, value = "Transaction Identifier.")
  public String getTxn() {
    return txn;
  }

  public void setTxn(String txn) {
    this.txn = txn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBEventNotification1 obEventNotification1 = (OBEventNotification1) o;
    return Objects.equals(this.aud, obEventNotification1.aud) &&
            Objects.equals(this.events, obEventNotification1.events) &&
            Objects.equals(this.iat, obEventNotification1.iat) &&
            Objects.equals(this.iss, obEventNotification1.iss) &&
            Objects.equals(this.jti, obEventNotification1.jti) &&
            Objects.equals(this.sub, obEventNotification1.sub) &&
            Objects.equals(this.toe, obEventNotification1.toe) &&
            Objects.equals(this.txn, obEventNotification1.txn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aud, events, iat, iss, jti, sub, toe, txn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBEventNotification1 {\n");

    sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    jti: ").append(toIndentedString(jti)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    toe: ").append(toIndentedString(toe)).append("\n");
    sb.append("    txn: ").append(toIndentedString(txn)).append("\n");
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

