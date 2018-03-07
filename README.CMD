Fuse Demo for QRadar and Resilient Rest API 
=========================================

Create the following 2 queues in AMQ:

- ste.queue.qIncidents
- pentaho

The message format push into pentaho queue as the following:

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


To build, CD to the source root directory

mvn clean install

To install the artifact

osgi:install -s mvn:com.jboss.demo/sg-tee-fuse-poc/1.0.0-SNAPSHOT

To test this demo, please deploy the FusePOCSimulator first. Then use Postman to test.

