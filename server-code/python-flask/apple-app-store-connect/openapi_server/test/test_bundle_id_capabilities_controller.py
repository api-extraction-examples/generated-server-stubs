import unittest

from flask import json

from openapi_server.models.bundle_id_capability_create_request import BundleIdCapabilityCreateRequest  # noqa: E501
from openapi_server.models.bundle_id_capability_response import BundleIdCapabilityResponse  # noqa: E501
from openapi_server.models.bundle_id_capability_update_request import BundleIdCapabilityUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBundleIdCapabilitiesController(BaseTestCase):
    """BundleIdCapabilitiesController integration test stubs"""

    def test_bundle_id_capabilities_create_instance(self):
        """Test case for bundle_id_capabilities_create_instance

        
        """
        bundle_id_capability_create_request = {"data":{"relationships":{"bundleId":{"data":{"id":"id","type":"bundleIds"}}},"attributes":{"settings":[{"minInstances":0,"visible":True,"allowedInstances":"ENTRY","enabledByDefault":True,"name":"name","options":[{"supportsWildcard":True,"enabledByDefault":True,"name":"name","description":"description","enabled":True,"key":"XCODE_5"},{"supportsWildcard":True,"enabledByDefault":True,"name":"name","description":"description","enabled":True,"key":"XCODE_5"}],"description":"description","key":"ICLOUD_VERSION"},{"minInstances":0,"visible":True,"allowedInstances":"ENTRY","enabledByDefault":True,"name":"name","options":[{"supportsWildcard":True,"enabledByDefault":True,"name":"name","description":"description","enabled":True,"key":"XCODE_5"},{"supportsWildcard":True,"enabledByDefault":True,"name":"name","description":"description","enabled":True,"key":"XCODE_5"}],"description":"description","key":"ICLOUD_VERSION"}]},"type":"bundleIdCapabilities"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/bundleIdCapabilities',
            method='POST',
            headers=headers,
            data=json.dumps(bundle_id_capability_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_bundle_id_capabilities_delete_instance(self):
        """Test case for bundle_id_capabilities_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/bundleIdCapabilities/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_bundle_id_capabilities_update_instance(self):
        """Test case for bundle_id_capabilities_update_instance

        
        """
        bundle_id_capability_update_request = {"data":{"attributes":{"settings":[{"minInstances":0,"visible":True,"allowedInstances":"ENTRY","enabledByDefault":True,"name":"name","options":[{"supportsWildcard":True,"enabledByDefault":True,"name":"name","description":"description","enabled":True,"key":"XCODE_5"},{"supportsWildcard":True,"enabledByDefault":True,"name":"name","description":"description","enabled":True,"key":"XCODE_5"}],"description":"description","key":"ICLOUD_VERSION"},{"minInstances":0,"visible":True,"allowedInstances":"ENTRY","enabledByDefault":True,"name":"name","options":[{"supportsWildcard":True,"enabledByDefault":True,"name":"name","description":"description","enabled":True,"key":"XCODE_5"},{"supportsWildcard":True,"enabledByDefault":True,"name":"name","description":"description","enabled":True,"key":"XCODE_5"}],"description":"description","key":"ICLOUD_VERSION"}]},"id":"id","type":"bundleIdCapabilities"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/bundleIdCapabilities/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(bundle_id_capability_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
