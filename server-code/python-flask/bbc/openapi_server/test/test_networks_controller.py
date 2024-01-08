import unittest

from flask import json

from openapi_server.models.networks_response import NetworksResponse  # noqa: E501
from openapi_server.models.radio_error_response import RadioErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestNetworksController(BaseTestCase):
    """NetworksController integration test stubs"""

    def test_get_radio_networks(self):
        """Test case for get_radio_networks

        Networks
        """
        query_string = [('preset', True),
                        ('international', True)]
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/radio/networks.json',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
