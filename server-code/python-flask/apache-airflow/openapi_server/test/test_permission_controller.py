import unittest

from flask import json

from openapi_server.models.action_collection import ActionCollection  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPermissionController(BaseTestCase):
    """PermissionController integration test stubs"""

    def test_get_permissions(self):
        """Test case for get_permissions

        List permissions
        """
        query_string = [('limit', 100),
                        ('offset', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/permissions',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
