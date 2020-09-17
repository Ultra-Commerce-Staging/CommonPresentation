/*
 * #%L
 * ultracommerce-common-presentation
 * %%
 * Copyright (C) 2009 - 2016 Ultra Commerce
 * %%
 * Licensed under the Ultra Fair Use License Agreement, Version 1.0
 * (the "Fair Use License" located  at http://license.ultracommerce.org/fair_use_license-1.0.txt)
 * unless the restrictions on use therein are violated and require payment to Ultra in which case
 * the Ultra End User License Agreement (EULA), Version 1.1
 * (the "Commercial License" located at http://license.ultracommerce.org/commercial_license-1.1.txt)
 * shall apply.
 * 
 * Alternatively, the Commercial License may be replaced with a mutually agreed upon license (the "Custom License")
 * between you and Ultra Commerce. You may not use this file except in compliance with the applicable license.
 * #L%
 */
package com.ultracommerce.presentation.dialect;

import com.ultracommerce.presentation.model.UltraAttributeModifier;
import com.ultracommerce.presentation.model.UltraTemplateContext;

import java.util.Map;

/**
 * An attribute processor that modifies the attributes on the tag that the event was triggered on
 * 
 * @author Jay Aisenbrey (cja769)
 */
public interface UltraAttributeModifierProcessor extends UltraProcessor {

    /**
     * @param tagName The name of the tag the event was triggered on
     * @param tagAttributes A map of String to String of all of the attributes on the tag
     * @param attributeName The name of the attribute that triggered the event
     * @param attributeValue The value of the attribute that triggered the event
     * @param context The {@link UltraTemplateContext} that should be used to perform operations on the tag with
     * @return A {@link UltraAttributeModifier} that has a map of the new attributes that should be added to the tag and a list of attribute
     * names that should be removed from the tag
     */
    public UltraAttributeModifier getModifiedAttributes(String tagName, Map<String, String> tagAttributes, String attributeName, String attributeValue, UltraTemplateContext context);
    
    /**
     * @return true if the new attribute's values should be surrounded by single quotes and false if they should be surrounded by double quotes
     */
    public boolean useSingleQuotes();
}
