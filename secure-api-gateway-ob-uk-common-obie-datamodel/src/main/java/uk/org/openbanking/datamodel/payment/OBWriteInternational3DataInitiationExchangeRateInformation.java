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
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

import static uk.org.openbanking.datamodel.utils.EqualityVerificationUtil.BigDecimalUtil.isEqual;

/**
 * Provides details on the currency exchange rate and contract.
 */
@ApiModel(description = "Provides details on the currency exchange rate and contract.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteInternational3DataInitiationExchangeRateInformation {
    @JsonProperty("UnitCurrency")
    private String unitCurrency;

    @JsonProperty("ExchangeRate")
    private BigDecimal exchangeRate;

    @JsonProperty("RateType")
    private OBExchangeRateType2Code rateType;

    @JsonProperty("ContractIdentification")
    private String contractIdentification;

    public OBWriteInternational3DataInitiationExchangeRateInformation unitCurrency(String unitCurrency) {
        this.unitCurrency = unitCurrency;
        return this;
    }

    /**
     * Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
     *
     * @return unitCurrency
     */
    @ApiModelProperty(required = true, value = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.")
    @NotNull

    @Pattern(regexp = "^[A-Z]{3,3}$")
    public String getUnitCurrency() {
        return unitCurrency;
    }

    public void setUnitCurrency(String unitCurrency) {
        this.unitCurrency = unitCurrency;
    }

    public OBWriteInternational3DataInitiationExchangeRateInformation exchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    /**
     * The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.
     *
     * @return exchangeRate
     */
    @ApiModelProperty(value = "The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.")

    @Valid

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public OBWriteInternational3DataInitiationExchangeRateInformation rateType(OBExchangeRateType2Code rateType) {
        this.rateType = rateType;
        return this;
    }

    /**
     * Specifies the type used to complete the currency exchange.
     *
     * @return rateType
     */
    @ApiModelProperty(required = true, value = "Specifies the type used to complete the currency exchange.")
    @NotNull


    public OBExchangeRateType2Code getRateType() {
        return rateType;
    }

    public void setRateType(OBExchangeRateType2Code rateType) {
        this.rateType = rateType;
    }

    public OBWriteInternational3DataInitiationExchangeRateInformation contractIdentification(String contractIdentification) {
        this.contractIdentification = contractIdentification;
        return this;
    }

    /**
     * Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.
     *
     * @return contractIdentification
     */
    @ApiModelProperty(value = "Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.")

    @Size(min = 1, max = 256)
    public String getContractIdentification() {
        return contractIdentification;
    }

    public void setContractIdentification(String contractIdentification) {
        this.contractIdentification = contractIdentification;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternational3DataInitiationExchangeRateInformation obWriteInternational3DataInitiationExchangeRateInformation = (OBWriteInternational3DataInitiationExchangeRateInformation) o;
        return Objects.equals(this.unitCurrency, obWriteInternational3DataInitiationExchangeRateInformation.unitCurrency) &&
                // TODO: temporary fix for https://github.com/SecureApiGateway/SecureApiGateway/issues/981
                isEqual(this.exchangeRate, obWriteInternational3DataInitiationExchangeRateInformation.exchangeRate) &&
                Objects.equals(this.rateType, obWriteInternational3DataInitiationExchangeRateInformation.rateType) &&
                Objects.equals(this.contractIdentification, obWriteInternational3DataInitiationExchangeRateInformation.contractIdentification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitCurrency, exchangeRate, rateType, contractIdentification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternational3DataInitiationExchangeRateInformation {\n");

        sb.append("    unitCurrency: ").append(toIndentedString(unitCurrency)).append("\n");
        sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
        sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
        sb.append("    contractIdentification: ").append(toIndentedString(contractIdentification)).append("\n");
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

