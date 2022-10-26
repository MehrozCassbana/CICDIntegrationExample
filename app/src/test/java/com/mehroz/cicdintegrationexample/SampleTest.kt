package com.mehroz.cicdintegrationexample

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class SampleTest {

    private var value1: Int = -1
    private var value2: Int = -1

    @Before
    fun setup() {
        value1 = 10
        value2 = 5
    }

    @Test
    fun `should_return_correct_sum_of_numbers`() {
        val sum = value1 + value2
        Assert.assertEquals(sum,15)
    }

}