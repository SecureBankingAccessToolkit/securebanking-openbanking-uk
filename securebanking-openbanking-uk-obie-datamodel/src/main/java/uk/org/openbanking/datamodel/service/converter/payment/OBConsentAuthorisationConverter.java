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
package uk.org.openbanking.datamodel.service.converter.payment;

import uk.org.openbanking.datamodel.payment.OBAuthorisation1;
import uk.org.openbanking.datamodel.payment.OBExternalAuthorisation1Code;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticConsent3DataAuthorisation;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticConsent4DataAuthorisation;

import static uk.org.openbanking.datamodel.service.converter.payment.OBAuthorisationCodeConverter.toAuthorisationTypeEnum;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAuthorisationCodeConverter.toOBExternalAuthorisation1Code;

public class OBConsentAuthorisationConverter {

    public static OBWriteDomesticConsent3DataAuthorisation toOBWriteDomesticConsent3DataAuthorisation(OBAuthorisation1 authorisation) {
        return authorisation == null ? null : (new OBWriteDomesticConsent3DataAuthorisation())
                .authorisationType(toAuthorisationTypeEnum(authorisation.getAuthorisationType()))
                .completionDateTime(authorisation.getCompletionDateTime());
    }

    public static OBWriteDomesticConsent3DataAuthorisation toOBWriteDomesticConsent3DataAuthorisation(OBWriteDomesticConsent4DataAuthorisation authorisation) {
        return authorisation == null ? null : (new OBWriteDomesticConsent3DataAuthorisation())
                .authorisationType(OBWriteDomesticConsent3DataAuthorisation.AuthorisationTypeEnum.valueOf(authorisation.getAuthorisationType().name()))
                .completionDateTime(authorisation.getCompletionDateTime());
    }

    public static OBWriteDomesticConsent4DataAuthorisation toOBWriteDomesticConsent4DataAuthorisation(OBAuthorisation1 authorisation) {
        return authorisation == null ? null : (new OBWriteDomesticConsent4DataAuthorisation())
                .authorisationType(OBWriteDomesticConsent4DataAuthorisation.AuthorisationTypeEnum.valueOf(authorisation.getAuthorisationType().name()))
                .completionDateTime(authorisation.getCompletionDateTime());
    }

    public static OBWriteDomesticConsent4DataAuthorisation toOBWriteDomesticConsent4DataAuthorisation(OBWriteDomesticConsent3DataAuthorisation authorisation) {
        return authorisation == null ? null : (new OBWriteDomesticConsent4DataAuthorisation())
                .authorisationType(OBWriteDomesticConsent4DataAuthorisation.AuthorisationTypeEnum.valueOf(authorisation.getAuthorisationType().name()))
                .completionDateTime(authorisation.getCompletionDateTime());
    }

    public static OBAuthorisation1 toOBAuthorisation1(OBWriteDomesticConsent3DataAuthorisation authorisation) {
        return authorisation == null ? null : (new OBAuthorisation1())
                .authorisationType(toOBExternalAuthorisation1Code(authorisation.getAuthorisationType()))
                .completionDateTime(authorisation.getCompletionDateTime());
    }

    public static OBAuthorisation1 toOBAuthorisation1(OBWriteDomesticConsent4DataAuthorisation authorisation) {
        return authorisation == null ? null : (new OBAuthorisation1())
                .authorisationType(OBExternalAuthorisation1Code.valueOf(authorisation.getAuthorisationType().name()))
                .completionDateTime(authorisation.getCompletionDateTime());
    }
}
