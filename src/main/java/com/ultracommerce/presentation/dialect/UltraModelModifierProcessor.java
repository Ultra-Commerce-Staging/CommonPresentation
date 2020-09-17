/*
 * #%L
 * ultracommerce-common-presentation
 * %%
 * Copyright (C) 2009 - 2016 Ultra Commerce
 * %%
 * Licensed under the Ultracommerce Fair Use License Agreement, Version 1.0
 * (the "Fair Use License" located  at http://license.ultracommerce.org/fair_use_license-1.0.txt)
 * unless the restrictions on use therein are violated and require payment to Ultracommerce in which case
 * the Ultracommerce End User License Agreement (EULA), Version 1.1
 * (the "Commercial License" located at http://license.ultracommerce.org/commercial_license-1.1.txt)
 * shall apply.
 * 
 * Alternatively, the Commercial License may be replaced with a mutually agreed upon license (the "Custom License")
 * between you and Ultra Commerce. You may not use this file except in compliance with the applicable license.
 * #L%
 */
package com.ultracommerce.presentation.dialect;

import com.ultracommerce.presentation.model.UltracommerceTemplateContext;
import com.ultracommerce.presentation.model.UltracommerceTemplateModel;
import com.ultracommerce.presentation.model.UltracommerceTemplateModelModifierDTO;

import java.util.Map;

/**
 * <p>
 * A tag processor that changes the tag to the tagName specified in the {@link UltracommerceTemplateModelModifierDTO}, adds attributes to that tag, adds local variables to that tag, and adds a 
 * {@link UltracommerceTemplateModel} as the last child of the tag.
 * 
 * <p>
 * This processor is similar to the {@link UltracommerceTagReplacementProcessor} in that it modifies the DOM model. This processor is different in that
 * it is designed to keep the majority of the originally-written model intact and instead augment it with additional elements, tags, etc.
 * 
 * @author Jay Aisenbrey (cja769)
 * @see AbstractUltracommerceModelModifierProcessor
 */
public interface UltracommerceModelModifierProcessor extends UltracommerceProcessor {
    
    /**
     * @return true if the attribute values on the tag should be surrounded by single quotes or false if they should be surrounded by double quotes
     */
    public boolean useSingleQuotes();
    
    /**
     * @return true if the model inserted as the last child should be reprocessed because it contains template logic or false if it shoudn't
     */
    public boolean reprocessModel();

    /**
     * @param rootTagName The name of the tag the event was triggered on
     * @param rootTagAttributes A map of String to String of all of the attributes on the tag
     * @param context The {@link UltracommerceTemplateContext} that should be used to perform operations on the tag with
     * @return A {@link UltracommerceTemplateModelModifierDTO} that has the parameters that should be added to the tag, the model variables
     * that should be added to the local model and the {@link UltracommerceTemplateModel} that should be added as the last child of the tag
     */
    public UltracommerceTemplateModelModifierDTO getInjectedModelAndTagAttributes(String rootTagName, Map<String, String> rootTagAttributes, UltracommerceTemplateContext context);
}
