package ru.tsvlad.restapi.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces
import org.telegram.telegrambots.meta.api.methods.BotApiMethod
import org.telegram.telegrambots.meta.api.objects.Update
import ru.tsvlad.bot.FlashCardBot

@Controller
class FlashCardBotWebHookController(
    private val flashCardBot: FlashCardBot
) {
    @Post("/")
    @Produces(MediaType.APPLICATION_JSON)
    fun handleUpdate(@Body update: Update) : BotApiMethod<*> {
        return flashCardBot.onWebhookUpdateReceived(update)
    }
}