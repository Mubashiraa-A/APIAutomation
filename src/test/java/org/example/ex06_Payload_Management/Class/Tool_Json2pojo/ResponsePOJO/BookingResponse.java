package org.example.ex06_Payload_Management.Class.Tool_Json2pojo.ResponsePOJO;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.example.ex06_Payload_Management.Class.Tool_Json2pojo.RequestPOJO.Booking;

@Generated("jsonschema2pojo")
public class BookingResponse  {

    @SerializedName("bookingid")
    @Expose
    private Integer bookingid;


    @SerializedName("booking")
    @Expose
    private Booking booking;



    public Integer getBookingid() {
        return bookingid;
    }
    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }



    public Booking getBooking() {
        return booking;
    }
    public void setBooking(Booking booking) {
        this.booking = booking;
    }

}