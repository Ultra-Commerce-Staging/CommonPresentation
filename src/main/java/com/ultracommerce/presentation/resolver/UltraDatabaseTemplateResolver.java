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
package com.ultracommerce.presentation.resolver;

/**
 * Implementation of {@link AbstractUltracommerceTemplateResolver} that should be used if the templates you are resolving are in the database.
 * 
 * @author Jay Aisenbrey (cja769)
 */
public class UltracommerceDatabaseTemplateResolver extends AbstractUltracommerceTemplateResolver {

    @Override
    public UltracommerceTemplateResolverType getResolverType() {
        return UltracommerceTemplateResolverType.DATABASE;
    }

}
