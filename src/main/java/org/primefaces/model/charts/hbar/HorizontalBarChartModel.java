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
package org.primefaces.model.charts.hbar;

import org.primefaces.model.charts.bar.BarChartModel;

/**
 * Defines the horizontalBar model used to create horizontalBar chart component.
 */
public class HorizontalBarChartModel extends BarChartModel {

    private static final long serialVersionUID = 1L;

    /**
     * Gets the type
     *
     * @return type of current chart
     */
    @Override
    public String getType() {
        return "horizontalBar";
    }
}
