import unittest

from flask import json

from openapi_server.models.health_info import HealthInfo  # noqa: E501
from openapi_server.models.version_info import VersionInfo  # noqa: E501
from openapi_server.test import BaseTestCase


class TestMonitoringController(BaseTestCase):
    """MonitoringController integration test stubs"""

    def test_get_health(self):
        """Test case for get_health

        Get instance status
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/health',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_version(self):
        """Test case for get_version

        Get version information
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/version',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
