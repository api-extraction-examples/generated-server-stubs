import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.hook_type import HookType  # noqa: E501
from openapi_server.test import BaseTestCase


class TestHookTypeController(BaseTestCase):
    """HookTypeController integration test stubs"""

    def test_list_hook_types(self):
        """Test case for list_hook_types

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/hooks/types',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
