package com.weili.urlshortener.service.impl;

import com.weili.urlshortener.common.request.UrlShortenRequest;
import com.weili.urlshortener.service.UrlService;
import org.springframework.stereotype.Service;

@Service("urlService")
public class UrlServiceImpl implements UrlService {

    @Override
    public String shorten(UrlShortenRequest request) {
        return request.getUrl();
    }

}
