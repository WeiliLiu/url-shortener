package com.weili.urlshortener.common.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class UrlShortenRequest implements Serializable {

    /**
     * The long url to be shortened
     */
    private String url;

}
