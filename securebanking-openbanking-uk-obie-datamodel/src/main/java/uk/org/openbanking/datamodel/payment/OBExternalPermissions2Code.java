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
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the Open Banking service request types.
 *
 * <p>
 * N.B. This enum should be used instead of all the equivalent 'Permission' inner enums that are created in
 * classes such as {@link OBWriteDomesticScheduledConsent3Data} or {@link OBWriteDomesticScheduledConsent4Data}
 * etc. This makes migrating to new API versions considerably easier.
 */
public enum OBExternalPermissions2Code {
  
  CREATE("Create");

  private String value;

  OBExternalPermissions2Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalPermissions2Code fromValue(String text) {
    for (OBExternalPermissions2Code b : OBExternalPermissions2Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

