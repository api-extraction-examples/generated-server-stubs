import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestRequestInspectionController(BaseTestCase):
    """RequestInspectionController integration test stubs"""

    def test_headers_get(self):
        """Test case for headers_get

        Return the incoming request's HTTP headers.
        """
        headers = { 
        }
        response = self.client.open(
            '/headers',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ip_get(self):
        """Test case for ip_get

        Returns the requester's IP Address.
        """
        headers = { 
        }
        response = self.client.open(
            '/ip',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_agent_get(self):
        """Test case for user_agent_get

        Return the incoming requests's User-Agent header.
        """
        headers = { 
        }
        response = self.client.open(
            '/user-agent',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
