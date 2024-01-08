import unittest

from flask import json

from openapi_server.models.get_server_health200_response import GetServerHealth200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestHealthController(BaseTestCase):
    """HealthController integration test stubs"""

    def test_get_heartbeat(self):
        """Test case for get_heartbeat

        Ping the server for liveness
        """
        headers = { 
            'Accept': 'text/plain',
        }
        response = self.client.open(
            '/heartbeat',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_server_health(self):
        """Test case for get_server_health

        Get state of the server and its dependencies.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/health',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
