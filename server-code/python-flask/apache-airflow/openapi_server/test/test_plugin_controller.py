import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.plugin_collection import PluginCollection  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPluginController(BaseTestCase):
    """PluginController integration test stubs"""

    def test_get_plugins(self):
        """Test case for get_plugins

        Get a list of loaded plugins
        """
        query_string = [('limit', 100),
                        ('offset', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/plugins',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
