/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.engine.markup;

/**
 *
 * @author Daniel Fern&aacute;ndez
 * @since 3.0.0
 * 
 */
public abstract class AbstractMarkupHandler implements IMarkupHandler {




    public AbstractMarkupHandler() {
        super();
    }





    /*
     * ---------------
     * Document events
     * ---------------
     */


    public void onDocumentStart(
            final long startTimeNanos, final String documentName) {
        // Nothing to be done here - meant to be overridden
    }



    public void onDocumentEnd(
            final long endTimeNanos, final long totalTimeNanos, final String documentName) {
        // Nothing to be done here - meant to be overridden
    }





    /*
     * ------------------------
     * XML Declaration events
     * ------------------------
     */

    public void onXmlDeclaration(
            final String xmlDeclaration,
            final String version, final String encoding, final boolean standalone,
            final String documentName, final int line, final int col) {
        // Nothing to be done here - meant to be overridden
    }





    /*
     * ---------------------
     * DOCTYPE Clause events
     * ---------------------
     */

    public void onDocTypeClause(
            final String docTypeClause,
            final String rootElementName, final String publicId, final String systemId,
            final String documentName, final int line, final int col) {
        // Nothing to be done here - meant to be overridden
    }





    /*
     * --------------------
     * CDATA Section events
     * --------------------
     */

    public void onCDATASection(
            final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col) {
        // Nothing to be done here - meant to be overridden
    }





    /*
     * -----------
     * Text events
     * -----------
     */

    public void onText(
            final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col) {
        // Nothing to be done here - meant to be overridden
    }





    /*
     * --------------
     * Comment events
     * --------------
     */

    public void onComment(
            final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col) {
        // Nothing to be done here - meant to be overridden
    }





    /*
     * ----------------
     * Element handling
     * ----------------
     */

    public void onAttribute(
            final char[] buffer,
            final int nameOffset, final int nameLen,
            final int nameLine, final int nameCol,
            final int operatorOffset, final int operatorLen,
            final int operatorLine, final int operatorCol,
            final int valueContentOffset, final int valueContentLen,
            final int valueOuterOffset, final int valueOuterLen,
            final int valueLine, final int valueCol, final String documentName) {
    // Nothing to be done here - meant to be overridden
    }



    public void onStandaloneElementStart(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final boolean minimized, final String documentName, final int line, final int col) {
        // Nothing to be done here - meant to be overridden
    }



    public void onStandaloneElementEnd(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final boolean minimized, final String documentName, final int line, final int col) {
        // Nothing to be done here - meant to be overridden
    }



    public void onOpenElementStart(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col) {
        // Nothing to be done here - meant to be overridden
    }



    public void onOpenElementEnd(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col) {
        // Nothing to be done here - meant to be overridden
    }



    public void onCloseElementStart(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col) {
        // Nothing to be done here - meant to be overridden
    }



    public void onCloseElementEnd(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col) {
        // Nothing to be done here - meant to be overridden
    }



    public void onAutoCloseElementStart(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col) {
        // Nothing to be done here - meant to be overridden
    }



    public void onAutoCloseElementEnd(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col) {
        // Nothing to be done here - meant to be overridden
    }



    public void onUnmatchedCloseElementStart(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col) {
        // Nothing to be done here - meant to be overridden
    }



    public void onUnmatchedCloseElementEnd(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col) {
        // Nothing to be done here - meant to be overridden
    }



    public void onElementInnerWhiteSpace(
            final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col) {
        // Nothing to be done here - meant to be overridden
    }





    /*
     * -------------------------------
     * Processing Instruction handling
     * -------------------------------
     */

    public void onProcessingInstruction(
            final String processingInstruction,
            final String target, final String content,
            final String documentName, final int line, final int col) {
        // Nothing to be done here - meant to be overridden
    }




}
