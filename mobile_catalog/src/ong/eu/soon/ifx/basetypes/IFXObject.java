/*
 * $Id: IFXObject.java,v 1.4 2004/03/05 02:17:24 spal Exp $
 * $Source: /cvsroot/ifx-framework/code/src/org/sourceforge/ifx/basetypes/IFXObject.java,v $
 * IFX-Framework - IFX XML to JavaBean application framework.
 * Copyright (C) 2003  The IFX-Framework Team
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package ong.eu.soon.ifx.basetypes;


/**
 * This is the superclass from which all IFX beans descend. This is needed
 * to make the XML Encoding and Decoding happen in a general way.
 * @author Sujit Pal (spal@users.sourceforge.net)
 * @version $Revision: 1.4 $
 */
public class IFXObject {

    /** Tabstop specifying nesting depth for nested objects in toString() */
    private final static String TABSTOP = "  ";



    /**
     * Builds the appropriate tab depth for the given nesting depth.
     * @param level the nesting depth
     * @return the tab.
     */
    private String tab(int level) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < level; i++) {
            buf.append(TABSTOP);
        }
        return buf.toString();
    }
}
