Fuse Demo for QRadar and Resilient Rest API 
=========================================

Pre-Req:
--------
1. Create the following 2 queues in AMQ:

- ste.queue.qIncidents
- pentaho

2. The message format push into pentaho queue as the following:

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

3. Please change the following to reflect the actual Resilient Server

<setProperty id="_setResilientServer" propertyName="resilient.server">
                <simple>http://localhost:9390</simple>
            </setProperty>
            
4. Please change the following to reflect the actual QRadar Server

<setProperty id="_QRadarServer" propertyName="qradar.server">
                <simple>http://localhost:9391</simple>
            </setProperty>            

5. Please change the following to reflect the actual Resilient Server

<cxf:rsClient address="http://localhost:9391/rest/session"
        id="resilientAuthServiceEndpoint" loggingFeatureEnabled="true" serviceClass="com.jboss.poc.services.ResilientAuthService">
        <cxf:providers>
            <bean class="com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider"/>
        </cxf:providers>
    </cxf:rsClient>

6. Please change the following to relect the actual Resilient Server:

<setProperty id="_ResilientServer" propertyName="resilient.server">
                <simple>http://localhost:9391</simple>
            </setProperty>
                

To Build
---------
CD to the source root directory and run the following command:

mvn clean install

To install
----------

osgi:install -s mvn:com.jboss.demo/sg-tee-fuse-poc/1.0.0-SNAPSHOT

To Test:
-------


1. Test the Scenario 1. QRadar -> JBoss Fuse -> Resilient

The Jboss Fuse exposed endpoint is http://localhost:9290/qincidents. 

2. Test Scenario 2 - 9.

The Jboss Fuse exposed endpoint is http://localhost:9291/
Example: http://localhost:9291/api/siem/offenses

3. To test Resilient Authentication

Use Postman to do a GET at the following URL
http://localhost:9293/rest/orgs/201/incidents

Remember to change the following content to reflect the actual authentication credential

<setBody id="_AuthDetail">
                <constant>{"email": "admin@mail.com", "password": "P@55w0rd", "interactive": true}</constant>
            </setBody>
            
-----

Note: To test this demo without the actual QRadar and Resilient Servers, please deploy the FusePOCSimulator first. Then use Postman to test.

1. Sample data for creating incidents POST:
{
	"name": "Incidents 201",
	"discovered_date": 0
	
}
