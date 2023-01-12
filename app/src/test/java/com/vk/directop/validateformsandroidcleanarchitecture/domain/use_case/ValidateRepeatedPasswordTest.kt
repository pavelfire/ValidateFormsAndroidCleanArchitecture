package com.vk.directop.validateformsandroidcleanarchitecture.domain.use_case

import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class ValidateRepeatedPasswordTest {

    private lateinit var validateRepeatedPassword: ValidateRepeatedPassword

    @Before
    fun setUp() {
        validateRepeatedPassword = ValidateRepeatedPassword()
    }

    @Test
    fun `Password and repeat password not maches, returns error`(){
        val result = validateRepeatedPassword
            .execute("tyu", "tyu")

        assertEquals(!result.successful, false)
    }
}