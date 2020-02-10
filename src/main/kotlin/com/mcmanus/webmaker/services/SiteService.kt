package com.mcmanus.webmaker.services

import com.mcmanus.webmaker.model.Site

interface SiteService {

    fun getAll(userId : Long) : List<Site>
    fun create(site : Site): Site
}