package com.weili.urlshortener.controller;

import com.weili.urlshortener.common.request.UrlShortenRequest;
import com.weili.urlshortener.service.UrlService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/url")
public class UrlController {

    @Resource
    private UrlService urlService;

    @PostMapping("/shorten")
    public String shorten(@RequestBody UrlShortenRequest request) {
        return urlService.shorten(request);
    }

}
