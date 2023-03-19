package ru.tsvlad.bot

import jakarta.inject.Inject
import jakarta.inject.Singleton
import org.telegram.telegrambots.bots.TelegramWebhookBot
import org.telegram.telegrambots.meta.api.methods.BotApiMethod
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update
import ru.tsvlad.config.props.BotProperties

@Singleton
class FlashCardBot(@Inject val botProperties: BotProperties) : TelegramWebhookBot(botProperties.token) {

    override fun onWebhookUpdateReceived(update: Update?): BotApiMethod<*> {
        return SendMessage(update?.message?.chatId.toString(), "test")
    }
    override fun getBotUsername(): String {
        return botProperties.username
    }

    override fun getBotPath(): String {
        return botProperties.path
    }
}