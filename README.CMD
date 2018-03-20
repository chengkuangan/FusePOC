Fuse Demo for QRadar and Resilient Rest API 
=========================================

Pre-Req:
--------
1. Create the following 2 queues in AMQ:

- pentaho

2. The message format push into pentaho queue as the following. This message is stored in pentaho queue.

<http_path>,<json data>

Example of pentaho queue content, per the following for api/reference_data/sets, 

api/reference_data/sets,[
{
"creation_time": 42,
"element_type": "ALN",
"name": "String",
"number_of_elements": 42,
"time_to_live": "String",
"timeout_type": "UNKNOWN"
} ]

3. Please change the following to reflect the actual VM IP address where the JBoss Fuse listens to:

	<cxf:rsServer address="http://172.30.1.87:9291/" id="proxyEndpoint"
        loggingFeatureEnabled="true" serviceClass="com.jboss.poc.services.QIncidentsService">
        <cxf:providers>
            <bean class="com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider"/>
        </cxf:providers>
    </cxf:rsServer>

4. Change the following to reflect the actual QRadar server

			<setProperty id="_QRadarServer" propertyName="qradar.server">
                <simple>https://172.16.100.19</simple>
                <!-- simple>http://localhost:9391</simple-->
            </setProperty>


5. Change the following for the actual credential used to login to Resilient Server

			<setBody id="_AuthDetail">
                <constant>{"email": "integration@stee.com", "password": "Pa55w0rd", "interactive": true}</constant>
            </setBody>
            

6. Go to src/main/java/com/jboss/poc/processor to change the server IP for Resilient

		String authServer = "https://172.16.6.115/rest/session";		// set the resilient authentication endpoint
		String getServer = "https://172.16.6.115/rest/orgs/210/incidents" + queryString;
		String deleteServer = "https://172.16.6.115/";
		            
To Build
---------
CD to the source root directory and run the following command:

mvn clean install

To install
----------

osgi:install -s mvn:com.jboss.demo/sg-tee-fuse-poc/1.0.0-SNAPSHOT

Note: If it is instaleld, you can also do a osgi:update <pid>

To Test:
-------

1. For Scenario 1. QRadar -> JBoss Fuse -> Resilient, use the following minimum JSON format to send the post data to Resilient using Postman.

URL: http://localhost:9293/rest/orgs/210/incidents
Method: POST
Content-Type: application/json
Sample Body (raw with application/json):
{
	"name": "Incidents 201",
	"discovered_date": 0
}
 
2. Test Scenario 2 - 9.

The Jboss Fuse exposed endpoint is http://<Fuse IP>:9291/

Example: http://localhost:9291/api/siem/offenses

Please refer to QRadar API Documentation for more detail.
            
-----

To test this demo without the actual QRadar and Resilient Servers, please deploy the FusePOCSimulator first. Then use Postman to test.
Please note that Resilient Authentication is not simulated by the Simulator.

