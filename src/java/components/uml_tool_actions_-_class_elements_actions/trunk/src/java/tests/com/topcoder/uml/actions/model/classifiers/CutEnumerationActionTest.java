/*
 * Copyright (C) 2006 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.uml.actions.model.classifiers;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

import com.topcoder.uml.model.core.classifiers.Enumeration;
import com.topcoder.uml.model.core.classifiers.EnumerationImpl;

import junit.framework.TestCase;

/**
 * <p>
 * Unit test cases for class CutEnumerationAction.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
public class CutEnumerationActionTest extends TestCase {

    /**
     * The Enumeration instance for the test.
     */
    private Enumeration enumeration = new EnumerationImpl();

    /**
     * The Clipboard instance for the test.
     */
    private Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

    /**
     * Test Constructor(Enumeration), with correct enumeration.
     */
    public void testCtor1() {
        CutEnumerationAction cutAction = new CutEnumerationAction(enumeration);

        assertEquals("Should return ModelElement instance.", enumeration, cutAction.getModelElement());
    }

    /**
     * Test Constructor(Enumeration), with null enumeration.
     * IllegalArgumentException is expected.
     */
    public void testCtor1WithNullEnumeration() {
        try {
            new CutEnumerationAction(null);
            fail("IllegalArgumentException is expected.");
        } catch (IllegalArgumentException iae) {
            // pass
        }
    }

    /**
     * Test Constructor(Enumeration, Clipboard), with correct enumeration and
     * clipboard.
     */
    public void testCtor2() {
        CutEnumerationAction cutAction = new CutEnumerationAction(enumeration, clipboard);

        assertEquals("Should return ModelElement instance.", enumeration, cutAction.getModelElement());
    }

    /**
     * Test Constructor(Enumeration, Clipboard), with null enumeration.
     * IllegalArgumentException is expected.
     */
    public void testCtor2WithNullEnumeration() {
        try {
            new CutEnumerationAction(null, clipboard);
            fail("IllegalArgumentException is expected.");
        } catch (IllegalArgumentException iae) {
            // pass
        }
    }

    /**
     * Test Constructor(Enumeration, Clipboard), with null clipboard. Do the
     * same as it is not null, for the constructor will assign the default
     * clipboard.
     */
    public void testCtor2WithNullClipboard() {
        try {
            new CutEnumerationAction(enumeration, null);
            // pass
        } catch (IllegalArgumentException iae) {
            fail("IllegalArgumentException is not expected.");
        }
    }

    /**
     * Test getPresentationName.
     */
    public void testGetPresentationName() {
        CutEnumerationAction cutAction = new CutEnumerationAction(enumeration);

        assertEquals("Should return PRESENTATION_NAME.", "Cut Enumeration", cutAction.getPresentationName());
    }
}