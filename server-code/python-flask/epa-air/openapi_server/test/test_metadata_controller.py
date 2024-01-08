import unittest

from flask import json

from openapi_server.models.air_rest_services_metadata_get200_response import AirRestServicesMetadataGet200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestMetadataController(BaseTestCase):
    """MetadataController integration test stubs"""

    def test_air_rest_services_metadata_get(self):
        """Test case for air_rest_services_metadata_get

        Clean Air Act Metadata Service
        """
        query_string = [('output', 'output_example'),
                        ('callback', 'param_callback_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/echo/air_rest_services.metadata',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/x-www-form-urlencoded not supported by Connexion")
    def test_air_rest_services_metadata_post(self):
        """Test case for air_rest_services_metadata_post

        Clean Air Act Metadata Service
        """
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/x-www-form-urlencoded',
        }
        data = dict(output='output_example',
                    param_callback='param_callback_example')
        response = self.client.open(
            '/echo/air_rest_services.metadata',
            method='POST',
            headers=headers,
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
