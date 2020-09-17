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

import java.util.Map;

/**
 * <p>
 * An attribute processor that adds new variables to the local model. Processors that implement this can be invoked in this way:
 * 
 * <pre>
 * &lt;p blc:add_name_variable&gt;
 *   &lt;span th:text="${name}"&gt;&lt;/span&gt;
 * &lt;/p&gt;
 * </pre>
 * 
 * <p>
 * In this example the processor is {@code add_name_variable} that happens to add a variable for {@code name} to the context to be used only inside
 * the executing tag.
 * 
 * @author Jay Aisenbrey (cja769)
 * @deprecated instead of using this interface, you should instead use a {@link com.ultracommerce.common.web.expression.UltraVariableExpression} in
 * combination with {@code th:with} to set local variables.
 */
@Deprecated
public interface UltraVariableModifierAttrProcessor extends UltraProcessor {

    /**
     * @param tagName The name of the tag that the attribute was triggered on
     * @param tagAttributes A map of String to String of all of the attributes on the tag
     * @param attributeName The name of the attribute that triggered the event
     * @param attributeValue The value of the attribute that triggered the event
     * @param context The {@link UltraTemplateContext} that should be used to perform operations on the tag with
     * @return new model variables added to the local scope. Returning either an empty map or null adds no new variable definitions
     */
    public Map<String, Object> populateModelVariables(String tagName, Map<String, String> tagAttributes, String attributeName, String attributeValue, UltraTemplateContext context);
}
