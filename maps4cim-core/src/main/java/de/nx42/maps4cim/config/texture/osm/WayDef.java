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
package de.nx42.maps4cim.config.texture.osm;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import net.sf.oval.constraint.Range;

/**
 * A single way (polyline), drawn in the user defined color.
 * @see EntityDef
 * @author Sebastian Straub <sebastian-straub@gmx.net>
 */
@XmlRootElement(name = "way")
public class WayDef extends PolygonDef {

	/** with of the line to draw. Defaults to 1.0 pixel (which is about
	    4m on a true to scale map) */
    @XmlAttribute(name = "stroke")
    @Range(min=0.0, max=1000.0, message="the stroke width of a way must be 0 px or larger, but not unreasonably large (>1000 px)")
    public Double strokeWidth;      // default: 1.0

    /**
     * @return the stroke width of this way
     */
    public Double getStrokeWidth() {
        return strokeWidth != null ? strokeWidth : 1.0;
    }

    
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result
                + ((strokeWidth == null) ? 0 : strokeWidth.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        WayDef other = (WayDef) obj;
        if (strokeWidth == null) {
            if (other.strokeWidth != null)
                return false;
        } else if (!strokeWidth.equals(other.strokeWidth))
            return false;
        return true;
    }

}
