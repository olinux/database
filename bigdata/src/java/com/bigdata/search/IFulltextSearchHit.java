/*

 Copyright (C) SYSTAP, LLC 2006-2015.  All rights reserved.

 Contact:
 SYSTAP, LLC
 2501 Calvert ST NW #106
 Washington, DC 20008
 licenses@systap.com

 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; version 2 of the License.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

 */
/*
 * Created on Apr 2, 2008
 */

package com.bigdata.search;

import com.bigdata.bop.IBindingSet;
import com.bigdata.rdf.store.FTS;
import com.bigdata.rdf.store.FTS.TargetType;

/**
 * Metadata about a fulltext search result (against an external service).
 * See {@link FTS}.
 *            
 * @author <a href="mailto:ms@metaphacts.com">Michael Schmidt</a>
 * @version $Id$
 */
public interface IFulltextSearchHit<V extends Comparable<V>> {

   /**
    * The result of the search (values contained in projected columns).
    */
   public String getRes();
   
   /**
    * The score associated with the search result.
    */
    public double getScore();

    /**
     * The search snippet associated with the result.
     */
    public String getSnippet();
    
    /**
     * Get the set of incoming bindings for the search hit
     */
    public IBindingSet getIncomingBindings();
    
    /**
     * Get the conversion target type for the search hit
     */
    public TargetType getTargetType();
}
