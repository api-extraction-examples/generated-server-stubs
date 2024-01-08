import unittest

from flask import json

from openapi_server.models.links import Links  # noqa: E501
from openapi_server.test import BaseTestCase


class TestRootController(BaseTestCase):
    """RootController integration test stubs"""

    def test_get_root(self):
        """Test case for get_root

        
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
