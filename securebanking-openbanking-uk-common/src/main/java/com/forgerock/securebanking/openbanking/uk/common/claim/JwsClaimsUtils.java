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
package com.forgerock.securebanking.openbanking.uk.common.claim;

import com.forgerock.securebanking.openbanking.uk.common.api.meta.OBConstants;
import com.nimbusds.jose.shaded.json.JSONObject;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.util.Map;

/**
 * Utility method(s) for manipulating a JWT's claims
 */
@Slf4j
public class JwsClaimsUtils {

    /**
     * getClaims extracts the claims from a JWT
     *
     * @param signedJWT the JWT from which the claims are to be returned
     * @return a {@code Claims} object containing the claims extracted from {@code signedJWT}
     * @throws ParseException
     */
    public static Claims getClaims(SignedJWT signedJWT) throws ParseException {
        JWTClaimsSet claimSet = signedJWT.getJWTClaimsSet();
        Map<String, Object> jsonClaimSet = claimSet.getJSONObjectClaim(OBConstants.OIDCClaim.CLAIMS);
        Claims claims = Claims.parseClaims(new JSONObject(jsonClaimSet));
        return claims;
    }

    public static String getContactField(JSONObject contactJsonObject, String field){
        String fieldValue = null;
        try{
            fieldValue = JSONObjectUtils.getString(contactJsonObject, field);
        } catch(ParseException pe) {
            log.warn("Warning: ParseException getting field {} as string from {}",
                    field, JSONObjectUtils.toJSONString(contactJsonObject));
        }
        return fieldValue;
    }
}
