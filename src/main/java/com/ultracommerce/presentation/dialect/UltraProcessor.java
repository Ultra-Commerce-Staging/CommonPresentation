/*
 * #%L
 * ultracommerce-common-presentation
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
package com.ultracommerce.presentation.dialect;

/**
 * Defines the base of what a template processor is in Broadleaf.
 * A processor is a class that is ran when a keyword is found either as a tag name or attribute.
 * The keyword is {@link #getPrefix()} + ":" + {@link #getName()}.
 * 
 * @author Jay Aisenbrey (cja769)
 *
 */
public interface BroadleafProcessor {
    
    /**
     * @return The name part of the keyword that this class should be triggered on.
     * The "price" part of {@code blc:price}
     */
    public String getName();
    
    /**
     * @return When this processor should be ran in relation to other processors in the dialect.
     * Runs from smallest number to largest 
     */
    public int getPrecedence();
    
    /**
     * @return The prefix that should be prepended to the name for the class to be triggered on.
     * The "blc" part of {@code blc:price}
     * @see {@link BroadleafDialectPrefix}
     */
    public String getPrefix();
    
    /**
     * {@link BroadleafDialectPrefix#UC}
     */
    public static final String DEFAULT_PREFIX = BroadleafDialectPrefix.UC;
    
    public static final int DEFAULT_PRECEDENCE = 1000;
}
