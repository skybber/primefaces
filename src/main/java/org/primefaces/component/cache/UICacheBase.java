/**
 * Copyright 2009-2018 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.component.cache;

import javax.faces.component.UIPanel;


abstract class UICacheBase extends UIPanel {

    public static final String COMPONENT_FAMILY = "org.primefaces.component";

    public static final String DEFAULT_RENDERER = "org.primefaces.component.UICacheRenderer";

    public enum PropertyKeys {

        disabled,
        region,
        key,
        processEvents
    }

    public UICacheBase() {
        setRendererType(DEFAULT_RENDERER);
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public boolean isDisabled() {
        return (Boolean) getStateHelper().eval(PropertyKeys.disabled, false);
    }

    public void setDisabled(boolean disabled) {
        getStateHelper().put(PropertyKeys.disabled, disabled);
    }

    public String getRegion() {
        return (String) getStateHelper().eval(PropertyKeys.region, null);
    }

    public void setRegion(String region) {
        getStateHelper().put(PropertyKeys.region, region);
    }

    public String getKey() {
        return (String) getStateHelper().eval(PropertyKeys.key, null);
    }

    public void setKey(String key) {
        getStateHelper().put(PropertyKeys.key, key);
    }

    public boolean isProcessEvents() {
        return (Boolean) getStateHelper().eval(PropertyKeys.processEvents, false);
    }

    public void setProcessEvents(boolean processEvents) {
        getStateHelper().put(PropertyKeys.processEvents, processEvents);
    }

}