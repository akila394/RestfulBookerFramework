package com.RestfulBooker.payloads.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.processing.Generated;

public class BookingDates {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Generated("jsonschema2pojo")
    public class Bookingdates {

        @JsonProperty("checkin")
        private String checkin;
        @JsonProperty("checkout")
        private String checkout;

        @JsonProperty("checkin")
        public String getCheckin() {
            return checkin;
        }

        @JsonProperty("checkin")
        public void setCheckin(String checkin) {
            this.checkin = checkin;
        }

        @JsonProperty("checkout")
        public String getCheckout() {
            return checkout;
        }

        @JsonProperty("checkout")
        public void setCheckout(String checkout) {
            this.checkout = checkout;
        }

    }
}
