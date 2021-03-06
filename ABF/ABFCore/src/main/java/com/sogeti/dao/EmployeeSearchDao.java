/*------------------------------------------------------------------------------
 *     Ident: Centre of Excellence Java
 *    Author: shahrush
 * Copyright: (c) 10 august 2015 Sogeti Nederland B.V. All Rights Reserved.
 *------------------------------------------------------------------------------
 * Sogeti Nederland B.V.    |  No part of this file may be reproduced or 
 * Centre of Excellence Java|  transmitted in any form or by any means,        
 * Lange Dreef 17           |  electronic or mechanical, for the purpose,      
 * 4131 NJ VIANEN           |  without the express written permission of the   
 * The Netherlands          |  copyright holder.
 *------------------------------------------------------------------------------
 */

package com.sogeti.dao;

import com.sogeti.GenericExceptions.TechnicalException;
import com.sogeti.model.User;

public interface  EmployeeSearchDao
{

    User getEmployee(String email, String password) throws TechnicalException;
    
    User getEmployeeByUserName(String email) throws TechnicalException;
}
