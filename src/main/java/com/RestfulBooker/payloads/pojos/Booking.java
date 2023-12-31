package com.RestfulBooker.payloads.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.processing.Generated;

public class Booking {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Generated("jsonschema2pojo")
    public class Example {

        @JsonProperty("firstname")
        private String firstname;
        @JsonProperty("lastname")
        private String lastname;
        @JsonProperty("totalprice")
        private Integer totalprice;
        @JsonProperty("depositpaid")
        private Boolean depositpaid;
        @JsonProperty("bookingdates")
        private BookingDates bookingdates;
        @JsonProperty("additionalneeds")
        private String additionalneeds;

        @JsonProperty("firstname")
        public String getFirstname() {
            return firstname;
        }

        @JsonProperty("firstname")
        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        @JsonProperty("lastname")
        public String getLastname() {
            return lastname;
        }

        @JsonProperty("lastname")
        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        @JsonProperty("totalprice")
        public Integer getTotalprice() {
            return totalprice;
        }

        @JsonProperty("totalprice")
        public void setTotalprice(Integer totalprice) {
            this.totalprice = totalprice;
        }

        @JsonProperty("depositpaid")
        public Boolean getDepositpaid() {
            return depositpaid;
        }

        @JsonProperty("depositpaid")
        public void setDepositpaid(Boolean depositpaid) {
            this.depositpaid = depositpaid;
        }

        @JsonProperty("bookingdates")
        public BookingDates getBookingdates() {
            return bookingdates;
        }

        @JsonProperty("bookingdates")
        public void setBookingdates(BookingDates bookingdates) {
            this.bookingdates = bookingdates;
        }

        @JsonProperty("additionalneeds")
        public String getAdditionalneeds() {
            return additionalneeds;
        }

        @JsonProperty("additionalneeds")
        public void setAdditionalneeds(String additionalneeds) {
            this.additionalneeds = additionalneeds;
        }

    }
}
