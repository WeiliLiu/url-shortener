package com.weili.urlshortener.service;

import com.weili.urlshortener.common.request.UrlShortenRequest;

public interface UrlService {

    /**
     * Shorten the given long url
     *
     * @param request request entity
     * @return
     */
    String shorten(UrlShortenRequest request);

}
