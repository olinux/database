/**

Copyright (C) SYSTAP, LLC 2006-2007.  All rights reserved.

Contact:
     SYSTAP, LLC
     4501 Tower Road
     Greensboro, NC 27410
     licenses@bigdata.com

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
package com.bigdata.ha.msg;

import com.bigdata.ha.HACommitGlue;

/**
 * Message used for commit in 2-phase commit protocol. The receiver should
 * Commit using the root block from the corresponding prepare message. It is an
 * error if a commit message is observed without the corresponding prepare
 * message.
 * 
 * @see HACommitGlue#commit2Phase(IHACommit2PhaseMessage)
 * 
 * @author <a href="mailto:thompsonbry@users.sourceforge.net">Bryan Thompson</a>
 */
public interface IHA2PhaseCommitMessage {

    /**
     * The commit time that will be assigned to the new commit point.
     */
    long getCommitTime();
    
}
