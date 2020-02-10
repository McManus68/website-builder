package com.mcmanus.webmaker.repository

import com.mcmanus.webmaker.model.Site
import org.springframework.data.mongodb.repository.MongoRepository

interface SiteRepository : MongoRepository<Site, Long> {

    fun findByUserId(userId : Long) : List<Site>
}