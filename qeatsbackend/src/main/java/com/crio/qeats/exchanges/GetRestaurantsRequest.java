/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.exchanges;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonProperty;

// TODO: CRIO_TASK_MODULE_RESTAURANTSAPI
//  Implement GetRestaurantsRequest.
//  Complete the class such that it is able to deserialize the incoming query params from
//  REST API clients.
//  For instance, if a REST client calls API
//  /qeats/v1/restaurants?latitude=28.4900591&longitude=77.536386&searchFor=tamil,
//  this class should be able to deserialize lat/long and optional searchFor from that.
// @Data
// @NoArgsConstructor
// @Getter
// @Setter
public class GetRestaurantsRequest {

    private Double latitude;
    private Double longitude;

    public GetRestaurantsRequest(){

    }

    public GetRestaurantsRequest(Double latitude, Double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }


    // @NotNull
    // @Max(90)
    // @Min(-90)
    // private Double latitude;
    // // @NotNull
    // // @Max(180)
    // // @Min(-180)
    // private Double longitude;
    // public GetRestaurantsRequest(Double latitude,
    //         Double longitude) {
    //     this.latitude = latitude;
    //     this.longitude = longitude;
    // } 

}

