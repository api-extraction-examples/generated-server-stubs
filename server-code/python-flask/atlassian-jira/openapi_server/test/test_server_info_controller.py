import unittest

from flask import json

from openapi_server.models.server_information import ServerInformation  # noqa: E501
from openapi_server.test import BaseTestCase


class TestServerInfoController(BaseTestCase):
    """ServerInfoController integration test stubs"""

    def test_get_server_info(self):
        """Test case for get_server_info

        Get Jira instance info
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/serverInfo',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
