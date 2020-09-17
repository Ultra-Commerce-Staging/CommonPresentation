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

import com.ultracommerce.presentation.model.UltraTemplateContext;

import java.util.List;
import java.util.Map;

/**
 * Tag processor that modifies the the global variable model if {@link #useGlobalScope()} is false and local if it's true
 * 
 * @author Jay Aisenbrey (cja769)
 * @deprecated instead of using this processor you should instead write a custom {@link com.ultracommerce.common.web.expression.BraodleafVariableExpression} in
 * combination with {@code th:with} if using Thymeleaf
 */
@Deprecated
public interface UltraVariableModifierProcessor extends UltraProcessor {

    /**
     * @return true if the newModelVars should be added to the global scope (not recommended) or false if they should be added to local scope
     * for this tag
     */
    public boolean useGlobalScope();
    
    /**
     * @return The list of variables on the model that, if they exist, should have additional values added to the existing list instead of replacing their values
     */
    public List<String> getCollectionModelVariableNamesToAddTo();

    /**
     * @param tagName The name of the tag the event was triggered on
     * @param tagAttributes A map of String to String of all of the attributes on the tag
     * @param context The {@link UltraTemplateContext} that should be used to perform operations on the tag with
     * @return the new mode variables that should be added from the tag. The variables are added to local or global scope based on the result of
     * {@link #useGlobalScope()}
     */
    public Map<String, Object> populateModelVariables(String tagName, Map<String, String> tagAttributes, UltraTemplateContext context);
}
