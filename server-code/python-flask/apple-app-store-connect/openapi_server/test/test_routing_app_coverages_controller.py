import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.routing_app_coverage_create_request import RoutingAppCoverageCreateRequest  # noqa: E501
from openapi_server.models.routing_app_coverage_response import RoutingAppCoverageResponse  # noqa: E501
from openapi_server.models.routing_app_coverage_update_request import RoutingAppCoverageUpdateRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestRoutingAppCoveragesController(BaseTestCase):
    """RoutingAppCoveragesController integration test stubs"""

    def test_routing_app_coverages_create_instance(self):
        """Test case for routing_app_coverages_create_instance

        
        """
        routing_app_coverage_create_request = {"data":{"relationships":{"appStoreVersion":{"data":{"id":"id","type":"appStoreVersions"}}},"attributes":{"fileName":"fileName","fileSize":0},"type":"routingAppCoverages"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/routingAppCoverages',
            method='POST',
            headers=headers,
            data=json.dumps(routing_app_coverage_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_routing_app_coverages_delete_instance(self):
        """Test case for routing_app_coverages_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/routingAppCoverages/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_routing_app_coverages_get_instance(self):
        """Test case for routing_app_coverages_get_instance

        
        """
        query_string = [('fields[routingAppCoverages]', ['fields_routing_app_coverages_example']),
                        ('include', ['include_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/routingAppCoverages/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_routing_app_coverages_update_instance(self):
        """Test case for routing_app_coverages_update_instance

        
        """
        routing_app_coverage_update_request = {"data":{"attributes":{"uploaded":True,"sourceFileChecksum":"sourceFileChecksum"},"id":"id","type":"routingAppCoverages"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/routingAppCoverages/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(routing_app_coverage_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
