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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.payment;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRRiskConverter;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteInternationalStandingOrder;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRWriteInternationalStandingOrderData;
import uk.org.openbanking.datamodel.v3.payment.OBWriteInternationalStandingOrder4;
import uk.org.openbanking.datamodel.v3.payment.OBWriteInternationalStandingOrder4Data;

public class FRWriteInternationalStandingOrderConverter {

    public static FRWriteInternationalStandingOrder toFRWriteInternationalStandingOrder(OBWriteInternationalStandingOrder4 internationalStandingOrder) {
        return internationalStandingOrder == null ? null : FRWriteInternationalStandingOrder.builder()
                .data(toFRWriteInternationalStandingOrderData(internationalStandingOrder.getData()))
                .risk(FRRiskConverter.toFRPaymentRisk(internationalStandingOrder.getRisk()))
                .build();
    }

    public static FRWriteInternationalStandingOrderData toFRWriteInternationalStandingOrderData(OBWriteInternationalStandingOrder4Data data) {
        return data == null ? null : FRWriteInternationalStandingOrderData.builder()
                .consentId(data.getConsentId())
                .initiation(FRWriteInternationalStandingOrderConsentConverter.toFRWriteInternationalStandingOrderDataInitiation(data.getInitiation()))
                .build();
    }
}
