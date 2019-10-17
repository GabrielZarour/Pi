package edu.gcccd.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ApproxPiTest {
        @Test
    public void testPrecision() {
            assertFalse(precisionLessThanOrEqualTo3(3.14159));
            assertTrue(precisionLessThanOrEqualTo3(3.141));
            assertTrue(precisionLessThanOrEqualTo3(3.14));
            assertTrue(precisionLessThanOrEqualTo3(3.1));
        }

        private boolean precisionLessThanOrEqualTo3(double x) {
            return String.valueOf(x).replaceAll(".*\\.", "").length() <= 3;
        }
    }
