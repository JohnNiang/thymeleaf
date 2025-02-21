/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.examples.springboot2.biglist.webflux.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.examples.springboot2.biglist.webflux.business.PlaylistEntry;
import reactor.core.publisher.Flux;
import org.thymeleaf.examples.springboot2.biglist.webflux.business.repository.PlaylistEntryRepository;


@RestController
public class JsonController {


    private PlaylistEntryRepository playlistEntryRepository;



    public JsonController() {
        super();
    }


    @Autowired
    public void setPlaylistEntryRepository(final PlaylistEntryRepository playlistEntryRepository) {
        this.playlistEntryRepository = playlistEntryRepository;
    }



    @RequestMapping("/data")
    public String index() {
        return "Use '/smalllist.data' or '/biglist.data'";
    }


    @RequestMapping("/smalllist.data")
    public Flux<PlaylistEntry> smallList() {
        return Flux.fromIterable(this.playlistEntryRepository.findAllPlaylistEntries());
    }


    @RequestMapping("/biglist.data")
    public Flux<PlaylistEntry> bigList() {
        return this.playlistEntryRepository.findLargeCollectionPlaylistEntries();
    }

}
