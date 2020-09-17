/*
 * #%L
 * ultracommerce-common-thymeleaf
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
package com.ultracommerce.presentation.model;

import com.ultracommerce.presentation.dialect.AbstractUltraAttributeModifierProcessor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Holder class for passing around a {@link Map} of parameters that should be added to a tag and a {@link List} of parameters
 * that should be removed. See {@link AbstractUltraAttributeModifierProcessor}
 * 
 * @author Jay Aisenbrey (cja769)
 *
 */
public class UltraAttributeModifier {
    
    protected Map<String, String> added;
    protected List<String> removed;

    public UltraAttributeModifier(Map<String, String> added, List<String> removed) {
        this.added = added;
        this.removed = removed;
    }

    public UltraAttributeModifier() {
        this(new HashMap<String, String>(), new ArrayList<String>());
    }

    public UltraAttributeModifier(Map<String, String> added) {
        this(added, new ArrayList<String>());
    }

    public UltraAttributeModifier(List<String> removed) {
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
