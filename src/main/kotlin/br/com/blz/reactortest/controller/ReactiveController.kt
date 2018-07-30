package br.com.blz.reactortest.controller

import br.com.blz.reactortest.domain.Fatorial
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.math.BigInteger
import java.time.Duration

@RestController
class ReactiveController {

    @GetMapping("/reactive/{x}")
    fun get(@PathVariable x: BigInteger): Mono<BigInteger> {
        return Mono.just(x)
                .map { Fatorial.calculate(value = it) }
                .delayElement(Duration.ofMillis(100))
    }

}