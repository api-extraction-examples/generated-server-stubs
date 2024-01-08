import unittest

from flask import json

from openapi_server.models.api_health import ApiHealth  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestHealthController(BaseTestCase):
    """HealthController integration test stubs"""

    def test_payments_health_get(self):
        """Test case for payments_health_get

        Returns the status of each connectivity provider
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/openbanking/sandbox/connect/api/payments/health',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
