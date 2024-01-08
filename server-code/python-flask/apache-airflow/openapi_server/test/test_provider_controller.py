import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.get_providers200_response import GetProviders200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProviderController(BaseTestCase):
    """ProviderController integration test stubs"""

    def test_get_providers(self):
        """Test case for get_providers

        List providers
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/providers',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
