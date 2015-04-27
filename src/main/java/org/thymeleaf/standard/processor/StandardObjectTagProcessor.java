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
package org.thymeleaf.standard.processor;

import org.thymeleaf.context.ITemplateProcessingContext;
import org.thymeleaf.engine.AttributeName;
import org.thymeleaf.engine.IElementStructureHandler;
import org.thymeleaf.model.IProcessableElementTag;

/**
 *
 * @author Daniel Fern&aacute;ndez
 *
 * @since 3.0.0
 *
 */
public final class StandardObjectTagProcessor extends AbstractStandardAttributeTagProcessor {

    public static final int PRECEDENCE = 500;
    public static final String ATTR_NAME = "object";

    public StandardObjectTagProcessor() {
        super(ATTR_NAME, PRECEDENCE);
    }



    protected void doProcess(
            final ITemplateProcessingContext processingContext,
            final IProcessableElementTag tag,
            final AttributeName attributeName, final String attributeValue,
            final IElementStructureHandler structureHandler) {

        structureHandler.setSelectionTarget(new UserForm("Mark", "Lettuce"));

    }


    private static class UserForm {

        private final String name;
        private final String surname;

        public UserForm(final String name, final String surname) {
            super();
            this.name = name;
            this.surname = surname;
        }

        public String getName() {
            return this.name;
        }

        public String getSurname() {
            return this.surname;
        }

        @Override
        public String toString() {
            return "UserForm{" +
                    "name='" + this.name + '\'' +
                    ", surname='" + this.surname + '\'' +
                    '}';
        }

    }


}