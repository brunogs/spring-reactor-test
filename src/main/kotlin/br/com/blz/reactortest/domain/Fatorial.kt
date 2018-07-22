package br.com.blz.reactortest.domain

import java.math.BigInteger
import java.math.BigInteger.ONE
import java.math.BigInteger.ZERO
import java.util.concurrent.TimeUnit

object Fatorial {

    tailrec fun calculate(acc: BigInteger = ONE, value: BigInteger): BigInteger {
        Thread.sleep(100)
        return if (value == ZERO) acc else calculate(value * acc, value - ONE)
    }

    fun calculateWrong(value: BigInteger): BigInteger {
        return if (value == ZERO) ONE else value * calculateWrong(value - ONE)
    }

}