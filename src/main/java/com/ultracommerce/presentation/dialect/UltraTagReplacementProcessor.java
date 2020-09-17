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
import com.ultracommerce.presentation.model.UltraTemplateModel;

import java.util.Map;

/**
 * <p>
 * A tag processor that's used to replace the tag that it was triggered on with a {@link UltraTemplateModel}. This allows implementations to
 * completely replace the element that invokes this with a brand new DOM (usually HTML).
 * 
 * <p>
 * For example, given an implementation of this tag that is invoked like this in the template:
 * 
 * <pre>
 * {@code
 * <blc:output_javascript message="This is some Javascript"/>
 * }
 * </pre>
 * 
 * <p>
 * A processor that implements this interface would replace that with a brand new model like:
 * 
 * <pre>
 * {@code
 * <script type="text/javascript>
 *     console.log("This is some Javscript");
 * </script>
 * }
 * </pre>
 * 
 * <p>
 * This differs from the {@link UltraModelModifierProcessor} in that this {@link UltraTagReplacementProcessor} completely replaces the tag with a new model
 * while the {@link UltraModelModifierProcessor} is designed to augment the originally-written dom.
 * 
 * @author Jay Aisenbrey (cja769)
 *
 */
public interface UltraTagReplacementProcessor extends UltraProcessor {

    /**
     * @return true if the model returned has template logic that needs to reprocessed. This should return true if any of the elements added to
     * the resulting {@link UltraTemplateModel} from the given {@link UltraTemplateContext} have additional expressions or includes that
     * are template-processing specific (e.g. extra includes, addition of new variables in the tags, etc).
     */
    public boolean replacementNeedsProcessing();

    /**
     * 
     * @param tagName The name of the tag the event was triggered on
     * @param tagAttributes A map of String to String of all of the attributes on the tag
     * @param context The {@link UltraTemplateContext} that should be used to perform operations on the tag with
     * @return The {@link UltraTemplateModel} that should replace the tag that the event was triggered on
     */
    public UltraTemplateModel getReplacementModel(String tagName, Map<String, String> tagAttributes, UltraTemplateContext context);

}
