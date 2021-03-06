/**
 * maps4cim - a real world map generator for CiM 2
 * Copyright 2013 Sebastian Straub
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.nx42.maps4cim.config.texture;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * Settings concerning the ground texture of the map
 *
 * This class does currently just serve as placeholder, as the different
 * implementations do not have too much in common.
 *
 * @author Sebastian Straub <sebastian-straub@gmx.net>
 */
@XmlRootElement(name = "texture")
public abstract class TextureDef {

    @XmlRootElement(name = "none")
    public static class TextureDefNone extends TextureDef {}

    public static TextureWrapper none() {
        return new TextureWrapper() {{
            value = new TextureDefNone();
        }};
    }

}
