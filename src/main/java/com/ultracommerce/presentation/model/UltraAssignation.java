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

/**
 * An expression that represents an assignation of a value to a key
 * 
 * @author Jay Aisenbrey (cja769)
 *
 */
public interface UltracommerceAssignation {

    /**
     * @return The parsed result of the left side of the assignation
     */
    public Object parseLeft(UltracommerceTemplateContext context);

    /**
     * @return The parsed result of the right side of the assignation
     */
    public Object parseRight(UltracommerceTemplateContext context);

    /**
     * 
     * @return The string representation of the left side expression of the assignation
     */
    public String getLeftStringRepresentation(UltracommerceTemplateContext context);

    /**
     * @return The string representation of the right side expression of the assignation
     */
    public String getRightStringRepresentation(UltracommerceTemplateContext context);
}
