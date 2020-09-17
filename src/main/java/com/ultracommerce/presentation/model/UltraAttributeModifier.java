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

import com.ultracommerce.presentation.dialect.AbstractUltracommerceAttributeModifierProcessor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Holder class for passing around a {@link Map} of parameters that should be added to a tag and a {@link List} of parameters
 * that should be removed. See {@link AbstractUltracommerceAttributeModifierProcessor}
 * 
 * @author Jay Aisenbrey (cja769)
 *
 */
public class UltracommerceAttributeModifier {
    
    protected Map<String, String> added;
    protected List<String> removed;

    public UltracommerceAttributeModifier(Map<String, String> added, List<String> removed) {
        this.added = added;
        this.removed = removed;
    }

    public UltracommerceAttributeModifier() {
        this(new HashMap<String, String>(), new ArrayList<String>());
    }

    public UltracommerceAttributeModifier(Map<String, String> added) {
        this(added, new ArrayList<String>());
    }

    public UltracommerceAttributeModifier(List<String> removed) {
        this(new HashMap<String, String>(), removed);
    }

    public Map<String, String> getAdded() {
        return added;
    }

    public void setAdded(Map<String, String> added) {
        this.added = added;
    }

    public List<String> getRemoved() {
        return removed;
    }

    public void setRemoved(List<String> removed) {
        this.removed = removed;
    }
}
