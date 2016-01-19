package com.digiwes.frameworkx.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by root on 15-12-8.
 */
public class PersistenceUtil {

    private static transient Log log = LogFactory.getLog(PersistenceUtil.class);

    private static PersistenceUtil persistenceUtil = new PersistenceUtil();
    EntityManagerFactory entityManagerFactory = null;

    private PersistenceUtil() {
        entityManagerFactory = Persistence.createEntityManagerFactory("com.digiwes.frameworkx.engagedparty.party");
    }
    public static PersistenceUtil getInstance() {
        return persistenceUtil;
    }

    public EntityManager getEntityManager() {
        if( null != entityManagerFactory){
            return  entityManagerFactory.createEntityManager();
        }else{
            return null;
        }

    }

    public void save(Object bean) throws Exception {
        if (null == bean) {
            return;
        }
        EntityManager entityManager = null;
        try {
            entityManager = getEntityManager();
            if(entityManager != null && entityManager.getTransaction() != null ){
                entityManager.getTransaction().begin();

                entityManager.persist(bean);

                entityManager.getTransaction().commit();
            }

        } catch ( Exception e) {

            if (null != entityManager && entityManager.getTransaction() !=null) {
                entityManager.getTransaction().rollback();
            }
            throw e;
        } finally {
            if (null != entityManager) {
                entityManager.close();
            }
        }
    }
    public void saveBatch(Object[] beans) throws Exception {
        if (null == beans || 0 == beans.length) {
            return;
        }
        EntityManager entityManager = null;
        try {

                entityManager = getEntityManager();
            if(entityManager != null && entityManager.getTransaction() != null ) {
                entityManager.getTransaction().begin();

                for (Object bean : beans) {
                    entityManager.persist(bean);
                }

                entityManager.getTransaction().commit();
            }
        } catch ( Exception e) {

            if (null != entityManager && entityManager.getTransaction() !=null) {
                entityManager.getTransaction().rollback();
            }
            throw e;
        } finally {
            if (null != entityManager) {
                entityManager.close();
            }
        }
    }
    /*public List loadAll(Class dataType) throws Exception {
        if (null == dataType) {
            throw new Exception("");
        }
        EntityManager entityManager = null;
        try {
            entityManager = PersistenceUtil.getInstance().getEntityManager();
            if (null != entityManager && entityManager.getTransaction() !=null) {
                entityManager.getTransaction().begin();
                if(entityManager.createQuery(" from "+dataType) != null){
                    entityManager.createQuery(" from " + dataType).getResultList();
                }
                List resultList = entityManager.createQuery(" from " + dataType).getResultList();
                entityManager.getTransaction().commit();

                return resultList;
            }
        } catch ( Exception e) {

            if (null != entityManager) {
                entityManager.getTransaction().rollback();
            }
            throw e;
        } finally {
            if (null != entityManager) {
                entityManager.close();
            }

        }
    }*/
}
