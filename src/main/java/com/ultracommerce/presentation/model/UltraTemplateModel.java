/*
 * #%L
 * ultracommerce-common-thymeleaf
 * %%
 * Copyright (C) 2009 - 2016 Ultra Commerce
 * %%
 * Licensed under the Broadleaf Fair Use License Agreement, Version 1.0
 * (the "Fair Use License" located  at http://license.ultracommerce.org/fair_use_license-1.0.txt)
 * unless the restrictions on use therein are violated and require payment to Broadleaf in which case
 * the Broadleaf End User License Agreement (EULA), Version 1.1
 * (the "Commercial License" located at http://license.ultracommerce.org/commercial_license-1.1.txt)
 * shall apply.
 * 
 * Alternatively, the Commercial License may be replaced with a mutually agreed upon license (the "Custom License")
 * between you and Ultra Commerce. You may not use this file except in compliance with the applicable license.
 * #L%
 */
package com.ultracommerce.presentation.model;

/**
 * The base object for making a new piece of markup using {@link BroadleafTemplateElement}s.
 * see {@link BroadleafTemplateContext#createModel()} to create an object that conforms to this interface for you
 * 
 * @author Jay Aisenbrey (cja769)
 * @see {@link BroadleafTemplateContext#createModel()}
 */
public interface BroadleafTemplateModel {

    /**
     * Add a new child element to the model. Adding elements conserves order in which they were added
     */
    public void addElement(BroadleafTemplateElement elem);

}
