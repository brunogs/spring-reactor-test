package br.com.blz.reactortest.controller

import br.com.blz.reactortest.domain.Fatorial
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.math.BigInteger

@RestController
class CommonController {

    @GetMapping("/common/{x}")
    fun get(@PathVariable x: BigInteger): BigInteger {
        return Fatorial.calculate(value = x)
    }

}