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
import io.swagger.annotations.ApiModelProperty;

import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadParty3Data
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")

public class OBReadParty3Data {
    @JsonProperty("Party")
    @Valid
    private List<OBParty2> party = null;

    public OBReadParty3Data party(List<OBParty2> party) {
        this.party = party;
        return this;
    }

    public OBReadParty3Data addPartyItem(OBParty2 partyItem) {
        if (this.party == null) {
            this.party = new ArrayList<OBParty2>();
        }
        this.party.add(partyItem);
        return this;
    }

    /**
     * Get party
     *
     * @return party
     */
    @ApiModelProperty(value = "")
    @Valid
    public List<OBParty2> getParty() {
        return party;
    }

    public void setParty(List<OBParty2> party) {
        this.party = party;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadParty3Data obReadParty3Data = (OBReadParty3Data) o;
        return Objects.equals(this.party, obReadParty3Data.party);
    }

    @Override
    public int hashCode() {
        return Objects.hash(party);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadParty3Data {\n");

        sb.append("    party: ").append(toIndentedString(party)).append("\n");
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

