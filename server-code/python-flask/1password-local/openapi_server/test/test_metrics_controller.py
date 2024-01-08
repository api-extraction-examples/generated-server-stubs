import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestMetricsController(BaseTestCase):
    """MetricsController integration test stubs"""

    def test_get_prometheus_metrics(self):
        """Test case for get_prometheus_metrics

        Query server for exposed Prometheus metrics
        """
        headers = { 
            'Accept': 'text/plain',
        }
        response = self.client.open(
            '/metrics',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
