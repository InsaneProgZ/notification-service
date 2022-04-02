package yan.micro.notificationservice.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import yan.micro.notificationservice.domain.Purchase

@RestController
@RequestMapping("/notification")
class NotificationController {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    fun createNotification(@RequestBody purchase: Purchase){

    }
}