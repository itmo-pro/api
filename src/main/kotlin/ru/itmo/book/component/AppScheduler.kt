package ru.itmo.book.component

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import ru.itmo.book.util.lazyLogger

@Component
class AppScheduler {

    @Scheduled(cron = "\${app.scheduler.cron}")
    fun process() {
        log.info("Doing something useful....")
    }

    companion object {
        val log by lazyLogger()
    }
}
