package com.digiwes.frameworkx.engagedparty.party;

import com.digiwes.frameworkx.common.TimePeriod;
import com.digiwes.frameworkx.engagedparty.party.partyRole.Consumer;
import com.digiwes.frameworkx.engagedparty.party.partyRole.PartyRole;
import org.apache.commons.lang3.time.DateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by zhaoyp-pc on 2016/1/18.
 */
public class PartyTest {

    private SessionFactory sessionFactory;

    @Before
    public void setUp() throws Exception {
        // A SessionFactory is set up once for an application!
        StandardServiceRegistry registry = null; // configures settings from hibernate.cfg.xml

        StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder().configure();
        if( null != registryBuilder ){
            registry = registryBuilder.build();
        }

        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        }
        catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.

            StandardServiceRegistryBuilder.destroy(registry);
            e.printStackTrace();
        }
    }
    protected void tearDown() throws Exception {
        if ( sessionFactory != null ) {
            sessionFactory.close();
        }
    }

    @org.junit.Test
    public void test(){
             try {
                 Session session = sessionFactory.openSession();
                 session.beginTransaction();
                 Individual party = new Individual();
                 party.setName("zhaoyp");
                 party.setGender("sex");
                 party.setNationality("china");
                 party.setMaritalStatus("active");
                 TimePeriod validFor = new TimePeriod(DateUtils.parseDate("2016-01-02", "yyyy-MM-dd"),DateUtils.parseDate("2016-01-02","yyyy-MM-dd"));
                 party.setValidFor(validFor);
                 Set<IndividualName> individualNameSet = new HashSet<IndividualName>();
                 IndividualName partyName = new IndividualName("zhaoyp","aa",validFor);
                 individualNameSet.add(partyName);
                 party.set_individualName(individualNameSet);
                 session.save(party);
                 session.getTransaction().commit();
             } catch (Exception e) {
                    e.printStackTrace();
             }
    }

   @Test
    public void testPartyRole(){
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            PartyRole consumer = new Consumer(11,"zhaoyp");
            TimePeriod validFor = new TimePeriod(DateUtils.parseDate("2016-01-02", "yyyy-MM-dd"),DateUtils.parseDate("2016-01-02","yyyy-MM-dd"));
            session.save(consumer);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Test
    public  void testPartyName(){
        Session session = null ;
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            TimePeriod validFor = new TimePeriod(DateUtils.parseDate("2016-01-02", "yyyy-MM-dd"),DateUtils.parseDate("2016-01-02","yyyy-MM-dd"));
            OrganizationName partyName = new OrganizationName("zhaoyp","aa",validFor);
            session.save(partyName);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

}