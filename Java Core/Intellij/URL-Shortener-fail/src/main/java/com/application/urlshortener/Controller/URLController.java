package com.application.urlshortener.Controller;

import com.application.urlshortener.Model.URLRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.application.urlshortener.Model.URL;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/")
public class URLController {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    private final URLRepository urlRepository;

    public URLController(URLRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public URL createNewURL(@RequestBody URL url){
        LOG.info("Saving new URL.");
        return urlRepository.save(url);
    }

    @RequestMapping(value = "/{urlID}", method = RequestMethod.GET)
    public Optional<URL> getURL(@PathVariable String urlID){
        LOG.info("Getting URL with ID: {}.", urlID);
        return urlRepository.findById(urlID);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<URL> getAllURL(){
        LOG.info("Getting all URL in Database");
        return urlRepository.findAll();
    }

}
