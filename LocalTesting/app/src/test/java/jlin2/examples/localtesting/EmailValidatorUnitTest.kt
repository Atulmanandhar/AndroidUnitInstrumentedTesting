package jlin2.examples.localtesting

import org.junit.Test
import org.junit.Assert.*


class EmailValidatorUnitTest {
    @Test
    fun testEmailCorrectFormat() {
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))
    }
    @Test
    fun testEmailSubdomain() {
        assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))
    }
    @Test
    fun testEmailIncorrectDomain() {
        assertFalse(EmailValidator.isValidEmail("123@abc"))
    }

    @Test
    fun testEmailDoubleDots() {
        assertFalse(EmailValidator.isValidEmail("123@abc..com"))
    }
    @Test
    fun testEmailNoUserName() {
        assertFalse(EmailValidator.isValidEmail("@abc.com"))
    }

    @Test
    fun testEmailNoDomain() {
        assertFalse(EmailValidator.isValidEmail("testing123"))
    }

    @Test
    fun testEmailEmptyString() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun testEmailNull() {
        assertFalse(EmailValidator.isValidEmail(null))
    }
}