/*
 * Copyright (c) 2002-2003 by OpenSymphony
 * All rights reserved.
 */
/*
 * Generated by XDoclet - Do not edit!
 */
package com.opensymphony.workflow.spi.ejb;


/**
 * Local home interface for HistoryStep.
 * @author <a href="mailto:hani@formicary.net">Hani Suleiman</a>
 * @author <a href="mailto:plightbo@hotmail.com">Pat Lightbody</a>
 */
public interface HistoryStepLocalHome extends javax.ejb.EJBLocalHome {
    //~ Static fields/initializers /////////////////////////////////////////////

    public static final String COMP_NAME = "java:comp/env/ejb/HistoryStep";
    public static final String JNDI_NAME = "HistoryStep";

    //~ Methods ////////////////////////////////////////////////////////////////

    public com.opensymphony.workflow.spi.ejb.HistoryStepLocal create(long id, long entryId, int stepId, int actionId, java.lang.String owner, java.sql.Timestamp startDate, java.sql.Timestamp dueDate, java.sql.Timestamp finishDate, java.lang.String status, java.lang.String caller) throws javax.ejb.CreateException;

    public java.util.Collection findByEntryId(long entryId) throws javax.ejb.FinderException;

    public com.opensymphony.workflow.spi.ejb.HistoryStepLocal findByPrimaryKey(java.lang.Long pk) throws javax.ejb.FinderException;
}
