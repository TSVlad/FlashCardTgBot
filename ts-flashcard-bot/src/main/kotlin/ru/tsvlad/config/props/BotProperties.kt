package ru.tsvlad.config.props

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("business.telegram.bot")
class BotProperties {
    lateinit var token: String
    lateinit var username: String
    lateinit var path: String
}