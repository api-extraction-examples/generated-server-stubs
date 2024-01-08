import unittest

from flask import json

from openapi_server.models.license import License  # noqa: E501
from openapi_server.test import BaseTestCase


class TestInstanceInformationController(BaseTestCase):
    """InstanceInformationController integration test stubs"""

    def test_get_license(self):
        """Test case for get_license

        Get license
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/instance/license',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
