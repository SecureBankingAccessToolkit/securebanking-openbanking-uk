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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.payment.FRAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Represents {@code OBStatement2} in the OB data model. It is stored within mongo (instead of the OB object),
 * in order to make it easier to introduce new versions of the Read/Write API.
 *
 * <p>
 * Note that this object is used across multiple versions of the Read/Write API, meaning that some values won't be
 * populated. For this reason it is a mutable {@link Data} rather than an immutable {@link lombok.Value} one.
 * </p>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FRStatementData {

    private String accountId;
    private String statementId;
    private String statementReference;
    private FRStatementType type;
    private DateTime startDateTime;
    private DateTime endDateTime;
    private DateTime creationDateTime;
    private List<String> statementDescriptions;
    private List<FRStatementBenefit> statementBenefits;
    private List<FRStatementFee> statementFees;
    private List<FRStatementInterest> statementInterests;
    private List<FRStatementDateTime> statementDateTimes;
    private List<FRStatementRate> statementRates;
    private List<FRStatementValue> statementValues;
    private List<FRStatementAmount> statementAmounts;

    public void addStatementAmount(FRStatementAmount statementAmount) {
        if (statementAmounts == null) {
            statementAmounts = new ArrayList();
        } else {
            statementAmounts = new ArrayList<>(statementAmounts); // ensure list is mutable
        }
        statementAmounts.add(statementAmount);
    }

    public enum FRStatementType {
        ACCOUNTCLOSURE("AccountClosure"),
        ACCOUNTOPENING("AccountOpening"),
        ANNUAL("Annual"),
        INTERIM("Interim"),
        REGULARPERIODIC("RegularPeriodic");

        private String value;

        FRStatementType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public String toString() {
            return value;
        }

        public static FRStatementType fromValue(String value) {
            return Stream.of(values())
                    .filter(type -> type.getValue().equals(value))
                    .findFirst()
                    .orElse(null);
        }
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class FRStatementBenefit {
        private String type;
        private FRAmount amount;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class FRStatementFee {
        private String description;
        private FRCreditDebitIndicator creditDebitIndicator;
        private String type;
        private BigDecimal rate;
        private String rateType;
        private String frequency;
        private FRAmount amount;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class FRStatementInterest {
        private String description;
        private FRCreditDebitIndicator creditDebitIndicator;
        private String type;
        private BigDecimal rate;
        private String rateType;
        private String frequency;
        private FRAmount amount;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class FRStatementDateTime {
        private DateTime dateTime;
        private String type;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class FRStatementRate {
        private String rate;
        private String type;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class FRStatementValue {
        private Integer value;
        private String type;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class FRStatementAmount {
        private FRCreditDebitIndicator creditDebitIndicator;
        private String type;
        private FRAmount amount;
    }
}
