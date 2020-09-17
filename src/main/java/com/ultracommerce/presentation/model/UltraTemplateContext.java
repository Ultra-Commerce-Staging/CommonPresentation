/*
 * #%L
 * ultracommerce-common-thymeleaf
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
package com.ultracommerce.presentation.model;

import org.springframework.web.servlet.support.BindStatus;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * Utility class to be used to do various functions on and around the template
 * 
 * @author Jay Aisenbrey (cja769)
 *
 */
public interface UltracommerceTemplateContext {

    /**
     * @return The object that the {@code value} evaluates to using the underlying template language
     */
    public <T> T parseExpression(String value);
    
    /**
     * @param allowParametersWithoutValue true if assignations where the key has no value assigning to it is valid
     * @return The list of {@link UltracommerceAssignation}s that were evaluated from {@code value}
     */
    public List<UltracommerceAssignation> getAssignationSequence(String value, boolean allowParametersWithoutValue);

    /**
     * @param tagName The name of the tag that is being created
     * @param attributes The attributes that should be added to the tag
     * @param useDoubleQuotes True if the attribute values should be surrounded by double quotes and false if they should use single quotes
     */
    public UltracommerceTemplateNonVoidElement createNonVoidElement(String tagName, Map<String, String> attributes, boolean useDoubleQuotes);

    /**
     * @param tagName The name of the tag that is being created
     */
    public UltracommerceTemplateNonVoidElement createNonVoidElement(String tagName);

    /**
     * @param tagName The name of the tag that is being created
     * @param attributes The attributes that should be added to the tag
     * @param useDoubleQuotes True if the attribute values should be surrounded by double quotes and false if they should use single quotes
     */
    public UltracommerceTemplateElement createStandaloneElement(String tagName, Map<String, String> attributes, boolean useDoubleQuotes);

    /**
     * @param tagName The name of the tag that is being created
     */
    public UltracommerceTemplateElement createStandaloneElement(String tagName);

    /**
     * @param text The text that the {@link UltracommerceTemplateElement} should represent
     */
    public UltracommerceTemplateElement createTextElement(String text);

    /**
     * @return A new {@link UltracommerceTemplateModel} that can have elements added to it to make a snippet of markup
     */
    public UltracommerceTemplateModel createModel();
    
    /**
     * Sets a variable on the given {@code element} 
     */
    public void setNodeLocalVariable(UltracommerceTemplateElement element, String key, Object value);
    
    /**
     * Sets a map of variables on the give {@code element}
     */
    public void setNodeLocalVariables(UltracommerceTemplateElement element, Map<String, Object> variableMap);
    
    /**
     * @return The object on the current variable model whose key was {@code name}
     */
    public Object getVariable(String name);
    
    /**
     * @return Gets the current Spring {@link BindStatus} for {@code attributeValue}
     */
    public UltracommerceBindStatus getBindStatus(String attributeValue);
    
    /**
     * @return The current HttpServletRequest if it exists or null otherwise
     */
    public HttpServletRequest getRequest();
}
