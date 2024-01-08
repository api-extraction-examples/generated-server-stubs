import unittest

from flask import json

from openapi_server.models.license_metric import LicenseMetric  # noqa: E501
from openapi_server.test import BaseTestCase


class TestLicenseMetricsController(BaseTestCase):
    """LicenseMetricsController integration test stubs"""

    def test_get_approximate_application_license_count(self):
        """Test case for get_approximate_application_license_count

        Get approximate application license count
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/license/approximateLicenseCount/product/{application_key}'.format(application_key='application_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_approximate_license_count(self):
        """Test case for get_approximate_license_count

        Get approximate license count
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/license/approximateLicenseCount',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
