package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public  void testingBracketsAroundString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));

    }
    @Test
    public void testingBracketsAroundLastPartOfString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launcode[code]"));
    }
    @Test
    public  void testingBracketsInFrontOfString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Launchcode"));
    }
    @Test
    public void testingEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void testingJustBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public  void testingOneBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launchcode"));
    }
    @Test
    public void testingOppositeBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void  testingOnlyOneBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void testingOppositeBracketB() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

}