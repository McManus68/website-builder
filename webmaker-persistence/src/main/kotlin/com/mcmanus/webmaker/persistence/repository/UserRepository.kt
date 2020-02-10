package com.mcmanus.webmaker.persistence.repository

import com.mcmanus.webmaker.model.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User, Long> {

    fun findTop3ByOrderByMailDesc() : List<User>
}