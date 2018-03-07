Fuse Demo for QRadar and Resilient Rest API 
=========================================

Create the following Queue in AMQ:

ste.queue.qIncidents
pentaho

To build, CD to the source root directory

mvn clean install

To install the artifact

osgi:install -s mvn:com.jboss.demo/sg-tee-fuse-poc/1.0.0-SNAPSHOT

To test this demo, please deploy the FusePOCSimulator first. Then use Postman to test.

