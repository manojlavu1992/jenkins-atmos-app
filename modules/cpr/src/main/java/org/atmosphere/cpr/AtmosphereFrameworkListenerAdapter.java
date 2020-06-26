/*
 * Copyright 2008-2020 Async-IO.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.atmosphere.cpr;

/**
 * Adapter for {@link org.atmosphere.cpr.AtmosphereFrameworkListener}
 *
 * @author Jeanfrancois Arcand
 */
public class AtmosphereFrameworkListenerAdapter implements AtmosphereFrameworkListener {
    @Override
    public void onPreInit(AtmosphereFramework f) {
    }

    @Override
    public void onPostInit(AtmosphereFramework f) {
    }

    @Override
    public void onPreDestroy(AtmosphereFramework f) {
    }

    @Override
    public void onPostDestroy(AtmosphereFramework f) {
    }
}