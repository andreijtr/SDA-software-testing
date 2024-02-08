package org.example.gettingStarted;

import org.assertj.core.api.Assertions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EligibilityServiceTest {

    /**
     * Steps to test class EligibilityService:
     * 1. instantiate an object of type EligibilityService
     * 2. see method below and infer what it is supposed to test
     */

    public void isEligibleForDiscount_whenClientNotEligible_thenFalse() {
        /**
         * Let create this test using following structure:
         *
         *  - create a client object that is not eligible for discount
         *  - call method 'isEligibleForDiscount' on class EligibilityService and use client from step above as parameter. save result in a variable
         *  - verify result using static method 'assertFalse' of class Assertions
         */
    }

    /**
     * Create another 2 tests:
     *  - scenario1: user is eligible
     *  - scenario2: exception is thrown
     */
}