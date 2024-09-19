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
package uk.org.openbanking.datamodel.v4.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * For a full list of enumeration values refer to `ExternalDocumentFormat1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_internal_CodeSets)
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum OBFileFormat {

    DPDF("DPDF"),

    DXML("DXML"),

    SDSH("SDSH"),

    WORD("WORD"),

    XSLT("XSLT");

    private String value;

    OBFileFormat(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OBFileFormat fromValue(String value) {
        for (OBFileFormat b : OBFileFormat.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

