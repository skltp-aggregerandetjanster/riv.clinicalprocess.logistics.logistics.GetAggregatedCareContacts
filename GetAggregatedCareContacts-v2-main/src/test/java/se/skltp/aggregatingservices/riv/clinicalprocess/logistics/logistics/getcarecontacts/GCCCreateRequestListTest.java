package se.skltp.aggregatingservices.riv.clinicalprocess.logistics.logistics.getcarecontacts;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import riv.clinicalprocess.logistics.logistics.getcarecontactsresponder.v2.GetCareContactsResponseType;
import se.skltp.aggregatingservices.api.AgpServiceFactory;
import se.skltp.aggregatingservices.tests.CreateRequestListTest;

@RunWith(SpringJUnit4ClassRunner.class)
public class GCCCreateRequestListTest extends CreateRequestListTest {

  private static GCCAgpServiceConfiguration configuration = new GCCAgpServiceConfiguration();
  private static AgpServiceFactory<GetCareContactsResponseType> agpServiceFactory = new GCCAgpServiceFactoryImpl();
  private static ServiceTestDataGenerator testDataGenerator = new ServiceTestDataGenerator();


  public GCCCreateRequestListTest() {
    super(testDataGenerator, agpServiceFactory, configuration);
  }
}